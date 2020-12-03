package com.springmovie.springmovie.Services;

import java.util.List;

import com.springmovie.springmovie.list.Movies;

public interface movieService {

	public List<Movies> getMovie();

	public Movies getMoviee(long movieName);

	public Movies addMoviee(Movies movie);

}
