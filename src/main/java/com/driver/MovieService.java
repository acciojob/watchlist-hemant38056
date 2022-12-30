package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;

    public void addMovieInService(Movie movie){
        movieRepository.addMovieRepository(movie);
    }

    public void addDirectorInService(Director director){
        movieRepository.addDirectorInRepository(director);
    }

    public void addMovieDirectorPairService(String movieName, String directorName){
        movieRepository.addMovieDirectorPairRepository(movieName, directorName);
    }

    public Movie getMovieNameService(String name){
        Movie mAnswer = movieRepository.getMovieNameRepository(name);
        return mAnswer;
    }

    public Director getDirectorNameService(String name){
        Director dAnswer = movieRepository.getDirectorNameRepository(name);
        return dAnswer;
    }

    public List<String> getMoviesByDirectorService(String name){
        List<String> moviesList = movieRepository.getMoviesByDirectorRepository(name);
        return moviesList;
    }

    public List<String> findAllMoviesService(){
        List<String> moviesAllList = movieRepository.findAllMoviesRepository();
        return moviesAllList;
    }

    public void deleteDirectorByNameService(String name){
        movieRepository.deleteDirectorByNameRepository(name);
    }

    public void deleteAllDirectorsService(){
        movieRepository.deleteAllDirectorsRepository();
    }
}
