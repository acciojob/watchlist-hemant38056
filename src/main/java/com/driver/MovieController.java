package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {
    @Autowired
    MovieService movieService;

    @PostMapping("/movies/add-movie")
    public ResponseEntity<String> addMovie(@RequestBody() Movie movie){
        movieService.addMovieInService(movie);
        return new ResponseEntity<>("New Movie Added Successfully", HttpStatus.CREATED);
    }

    @PostMapping("/movies/add-director")
    public ResponseEntity<String> addDirector(@RequestBody() Director director){
        movieService.addDirectorInService(director);
        return new ResponseEntity<>("New Director Added Successfully", HttpStatus.CREATED);
    }

    @PutMapping("/movies/add-movie-director-pair")
    public ResponseEntity<String> addMovieDirectorPair(@RequestParam("movie") String movieName, @RequestParam("director") String directorName){
        movieService.addMovieDirectorPairService(movieName,directorName);
        return new ResponseEntity<>("Movie and Director Pair Updated", HttpStatus.CREATED);
    }

    @GetMapping("/movies/get-movie-by-name/{name}")
    public ResponseEntity<Movie> getMovieByName(@PathVariable("name") String name){
        Movie movieNameAnswer = movieService.getMovieNameService(name);
        return new ResponseEntity<>(movieNameAnswer, HttpStatus.CREATED);
    }

    @GetMapping("/movies/get-director-by-name/{name}")
    public ResponseEntity<Director> getDirectorByName(@PathVariable("name") String name){
        Director directorNameAnswer = movieService.getDirectorNameService(name);
        return new ResponseEntity<>(directorNameAnswer, HttpStatus.CREATED);
    }

    @GetMapping("/movies/get-movies-by-director-name/{director}")
    public ResponseEntity<List<String>> getMoviesByDirectorName(@PathVariable("director") String name){
        List<String> moviesList = movieService.getMoviesByDirectorService(name);
        return new ResponseEntity<>(moviesList, HttpStatus.CREATED);
    }

    @GetMapping("/movies/get-all-movies")
    public ResponseEntity<List<String>> findAllMovies(){
        List<String> moviesAllList = movieService.findAllMoviesService();
        return new ResponseEntity<>(moviesAllList, HttpStatus.CREATED);
    }

    @DeleteMapping("/movies/delete-director-by-name")
    public ResponseEntity<String> deleteDirectorByName(@RequestParam("name") String directorName){
        movieService.deleteDirectorByNameService(directorName);
        return new ResponseEntity<>("Deleted Successfully", HttpStatus.CREATED);
    }

    @DeleteMapping("/movies/delete-all-directors")
    public ResponseEntity<String> deleteAllDirectors(){
        movieService.deleteAllDirectorsService();
        return new ResponseEntity<>("All Directors Deleted", HttpStatus.CREATED);
    }

}
