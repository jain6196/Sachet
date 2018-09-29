package com.sachet.android.sachet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Crimes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crimes);

        ArrayList<String> CrimeList = new ArrayList<>();
        CrimeList.add("1.Murder");
        CrimeList.add("2.Violence");
        CrimeList.add("3.Rape");
        CrimeList.add("4.Theft");
        CrimeList.add("5.Rioting");
        CrimeList.add("6.Rash Driving");
        CrimeList.add("7.Kidnapping");
        CrimeList.add("8.Women Assault");
        CrimeList.add("9.Dacoity");
        CrimeList.add("10.Eve Teasing");

        ArrayAdapter<String> CrimeAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,CrimeList);
        ListView listView = (ListView) findViewById(R.id.listCrimes);
        listView.setAdapter(CrimeAdapter);

    }
}
