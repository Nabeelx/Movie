package com.example.movie;

public class MovieList {


    String imagename;
    String name;

    public MovieList() {
    }

    public MovieList(String imagename, String name) {
        this.imagename = imagename;
        this.name = name;
    }

    public String getImagename() {
        return imagename;
    }

    public void setImagename(String imagename) {
        this.imagename = imagename;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
