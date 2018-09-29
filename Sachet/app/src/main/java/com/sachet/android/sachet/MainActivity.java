package com.sachet.android.sachet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton emergency;
    private ImageButton help;
    private ImageButton knowyourlocality;
    private ImageButton map;
    private ImageButton beaware;
    private ImageButton crime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emergency = (ImageButton) findViewById(R.id.emergency);
        emergency.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent activityChangeIntent = new Intent(MainActivity.this, EmergencyContacts.class);
                // currentContext.startActivity(activityChangeIntent);
                startActivity(activityChangeIntent);
            }
        });
        crime  = (ImageButton) findViewById(R.id.crime);
        crime.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent activityChangeIntent = new Intent(MainActivity.this, Crimes.class);
                // currentContext.startActivity(activityChangeIntent);
                startActivity(activityChangeIntent);
            }
        });

        help = (ImageButton) findViewById(R.id.help);
        knowyourlocality = (ImageButton) findViewById(R.id.knowyourlocality);
        map = (ImageButton) findViewById(R.id.map);
        beaware = (ImageButton) findViewById(R.id.beaware);

    }
}
