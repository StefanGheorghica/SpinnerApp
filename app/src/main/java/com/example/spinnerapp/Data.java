package com.example.spinnerapp;

import java.util.ArrayList;
import java.util.List;

public class Data
{
    public static List<Country> getCountryList()
    {
        List<Country> countryList = new ArrayList<>();

        Country Romania = new Country();
        Romania.setName("Romana");
        Romania.setImage(R.drawable.romania);
        countryList.add(Romania);

        Country UK = new Country();
        Romania.setName("English");
        Romania.setImage(R.drawable.uk);
        countryList.add(UK);

        Country France = new Country();
        Romania.setName("France");
        Romania.setImage(R.drawable.france);
        countryList.add(France);

        return countryList;
    }
}
