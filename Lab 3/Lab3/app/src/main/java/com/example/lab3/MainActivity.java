package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int num_clicks = 0;

        protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_main);
// storing ID of the button
// in a variable
            Button button1 = (Button) findViewById(R.id.ButtonA);
            Button button2 = (Button) findViewById(R.id.ButtonB);
            TextView counter = (TextView) findViewById(R.id.counter);
            counter.setText("Number of clicks: "+ num_clicks);
// operations to be performed
// when user tap on the button
            if (button1 != null) {
                button1.setOnClickListener((View.OnClickListener)(new View.OnClickListener() {
                    public final void onClick(View it) {
// displaying a toast message
                        Toast.makeText((Context) MainActivity.this, "You just clicked button A", Toast.LENGTH_LONG).show();
                        num_clicks = num_clicks + 1;
                        counter.setText("Number of clicks: "+ num_clicks);
                    }
                }));
            }
            if (button2 != null) {
                button2.setOnClickListener((View.OnClickListener) (new View.OnClickListener() {
                    public final void onClick(View it) {
// displaying a toast message
                        Toast.makeText((Context) MainActivity.this, "You just clicked button B", Toast.LENGTH_LONG).show();
                        num_clicks = num_clicks - 1;
                        counter.setText("Number of clicks: " + num_clicks);
                    }
                }));
            }
        }
    }