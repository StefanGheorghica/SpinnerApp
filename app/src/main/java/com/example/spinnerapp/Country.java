package com.example.spinnerapp;

import java.io.Serializable;

public class Country implements Serializable
{
    private String name;
    private int image;

    public Country() {};

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getImage()
    {
        return image;
    }

    public void setImage(int image)
    {
        this.image = image;
    }
}
