// Write your code here
package com.example.movie.repository;

import com.example.movie.model.Movie;

import java.util.*;

public interface MovieRepository {
    ArrayList<Movie> getMovies();

    Movie addMovie(Movie movie);

    Movie getMovieById(int movieId);
    
    Movie updateMovie(int movieId, Movie movie);

    void deleteMapping(int movieId);
}