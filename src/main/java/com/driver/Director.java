package com.driver;

public class Director {
    String name;
    int numberOfMovies;
    double imdbRating;

    public Director(){

    }

    public Director(String name, int numberOfMovies, double imdbRating){
        this.name = name;
        this.numberOfMovies = numberOfMovies;
        this.imdbRating = imdbRating;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getNumberOfMovies(){
        return this.numberOfMovies;
    }
    public void setNumberOfMovies(int numberOfMovies){
        this.numberOfMovies = numberOfMovies;
    }

    public double getImdbRating(){
        return this.imdbRating;
    }
    public void setImdbRating(double imdbRating){
        this.imdbRating = imdbRating;
    }
}
