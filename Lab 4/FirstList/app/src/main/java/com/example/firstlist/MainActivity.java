package com.example.firstlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView country_list; // Variable to link to our widget
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        country_list = (ListView) findViewById(R.id.country_list); // We link our widget by finding its id (name)
        ArrayList<String> city_array = new ArrayList<>(); // Our data structure to store our information about cities
        city_array.add("Shanghai"); // We add a city to our array
        // We create the adapter to act as a driver between our data structure and the displayed widget
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,city_array);
        country_list.setAdapter(adapter);

        country_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "You have clicked in " + i,Toast.LENGTH_SHORT).show();

                // This mechanism allows you to call open a new activity in your screen
                Intent intent = new Intent(MainActivity.this, DisplayInfo.class);

                // Bundle is the android mechanism to pass parameter to other activity
                Bundle b = new Bundle();
                b.putString("city", "Shanghai"); //Your id
                b.putString("country", "China"); //Your id
                b.putInt("city_population", 24153000);
                b.putInt("metro_population", 34000000);

                intent.putExtras(b); //Put your id to your next Intent
                startActivity(intent); // Start the new activity

            }
        });

}}
