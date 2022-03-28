package com.example.pocollect;

public class PokemonItem {
    private int number;
    private String image;
    private String name;
    private Boolean ischeck;

    public Boolean getIscheck() {
        return ischeck;
    }

    public void setIscheck(Boolean ischeck) {
        this.ischeck = ischeck;
    }

    public PokemonItem(int number, String image, String name) {
        this.number = number;
        this.image = image;
        this.name = name;
        this.ischeck = false;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
