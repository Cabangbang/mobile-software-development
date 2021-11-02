package com.example.firstlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private ArrayList<CityData> cityArray = new ArrayList<>();
    private ArrayList<String> cityNames = new ArrayList<>();

    private void readCityData() {
        InputStream is = getResources().openRawResource(R.raw.cities);
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(is, Charset.forName("UTF-8"))
        );

        String line = "";

        try {
            reader.readLine();

            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(",");  // split

                CityData sample = new CityData(
                        tokens[0],
                        tokens[1],
                        Integer.parseInt(tokens[2]),
                        Integer.parseInt(tokens[3])
                );

                cityArray.add(sample);
                cityNames.add(sample.getCity().toUpperCase());
            }
        } catch (IOException e) {
            Log.wtf("MainActivity", "Error: File Reader, Line " + line, e);
            e.printStackTrace();
        }
    }

    ListView country_list;  // variable to link to our widget

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        country_list = (ListView) findViewById(R.id.country_list);
        readCityData();

        // we create the adapter to act as a driver between
        // our data structure and the displayed content

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, cityNames);
        country_list.setAdapter(adapter);

        country_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(MainActivity.this, "You Clicked On " + i, Toast.LENGTH_SHORT).show();

                // this mechanism allows you to call open a new activity in your screen

                Intent intent = new Intent(MainActivity.this, DisplayInfoActivity.class);

                // bundle is the android mechanism to pass parameter to other activity

                Bundle b = new Bundle();

                b.putString("city", cityArray.get(i).getCity());
                b.putString("country", cityArray.get(i).getCountry());
                b.putInt("city_population", cityArray.get(i).getCityPopulation());
                b.putInt("metro_population", cityArray.get(i).getMetroPopulation());

                intent.putExtras(b);
                startActivity(intent);
            }
        });
    }
}