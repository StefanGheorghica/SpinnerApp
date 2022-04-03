package com.example.spinnerapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CountryAdapter extends BaseAdapter
{
    private Context context;
    private List<Country> countryList;

    public CountryAdapter(Context context, List<Country> countryList)
    {
        this.context = context;
        this.countryList = countryList;
    }

    @Override
    public int getCount()
    {
        return countryList != null ? countryList.size() : 0;
    }

    @Override
    public Object getItem(int i)
    {
        return i;
    }

    @Override
    public long getItemId(int i)
    {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        View rootView = LayoutInflater.from(context).inflate(R.layout.item_country, viewGroup, false);
        TextView txtName = rootView.findViewById(R.id.name);
        ImageView image = rootView.findViewById(R.id.image);

        txtName.setText(countryList.get(i).getName());
        image.setImageResource(countryList.get(i).getImage());

        return rootView;
    }
}
