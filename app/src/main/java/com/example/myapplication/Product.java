package com.example.myapplication;

public class Product {
    private String name;
    private String descrip;
    private int picture;

    public Product(String name, String descrip, int picture) {
        this.name = name;
        this.descrip = descrip;
        this.picture = picture;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }
}
