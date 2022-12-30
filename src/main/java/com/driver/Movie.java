package com.driver;

public class Movie {
    String name;
    int durationInMinutes;
    double imdbRating;

    public Movie(){

    }

    public Movie(String name, int durationInMinutes, double imdbRating){
        this.name = name;
        this.durationInMinutes = durationInMinutes;
        this.imdbRating = imdbRating;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getDurationInMinutes(){
        return this.durationInMinutes;
    }
    public void setDurationInMinutes(int durationInMinutes){
        this.durationInMinutes = durationInMinutes;
    }

    public double getImdbRating(){
        return this.imdbRating;
    }

    public void setImdbRating(double imdbRating){
        this.imdbRating = imdbRating;
    }

}
