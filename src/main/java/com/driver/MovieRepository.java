package com.driver;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

@Repository
public class MovieRepository {
    HashMap<String, Movie> moviesMap = new HashMap<>();
    HashMap<String, Director> directorMap= new HashMap<>();

    HashMap<String , ArrayList<String>> pairMap = new HashMap<>();

    public void addMovieRepository(Movie movie){
        moviesMap.put(movie.name, movie);
    }

    public void addDirectorInRepository(Director director){
        directorMap.put(director.name, director);
    }

    public void addMovieDirectorPairRepository(String movieName, String directorName){
        if(moviesMap.containsKey(movieName) && directorMap.containsKey(directorName)){
            if(!pairMap.containsKey(directorName)){
                pairMap.put(directorName, new ArrayList<>());
            }
            pairMap.get(directorName).add(movieName);
        }
    }

    public Movie getMovieNameRepository(String movieName){
        return moviesMap.get(movieName);
    }

    public Director getDirectorNameRepository(String directorName){
        return directorMap.get(directorName);
    }

    public List<String> getMoviesByDirectorRepository(String directorName){
        List<String> listOfMovies = new ArrayList<>();
        if(pairMap.containsKey(directorName)){
            listOfMovies.addAll(pairMap.get(directorName));
        }
        return listOfMovies;
    }

    public List<String> findAllMoviesRepository(){
        return new ArrayList<>(moviesMap.keySet());
    }

    public void deleteDirectorByNameRepository(String directorName){
        ArrayList<String> temp = new ArrayList<>();
        if(pairMap.containsKey(directorName)){
            temp = pairMap.get(directorName);
            pairMap.remove(directorName);

            for (String name : temp){
                if(moviesMap.containsKey(name)){
                    moviesMap.remove(name);
                }
            }
        }
        directorMap.remove(directorName);
    }

    public void deleteAllDirectorsRepository(){
        HashSet<String> movieSet = new HashSet<>();
        directorMap.clear();
        for (String directorName : pairMap.keySet()){
            for (String movieName : pairMap.get(directorName)){
                movieSet.add(movieName);
            }
        }

        for (String name : movieSet){
            if(moviesMap.containsKey(name)){
                moviesMap.remove(name);
            }
        }

        pairMap.clear();

    }


}
