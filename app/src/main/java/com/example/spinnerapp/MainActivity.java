package com.example.spinnerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity
{
    private Spinner spinner_country;

    private CountryAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner_country = findViewById(R.id.spinner_country);

        adapter = new CountryAdapter(MainActivity.this, Data.getCountryList());

        spinner_country.setAdapter(adapter);
    }
}