package com.springmovie.springmovie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springmovie.springmovie.Services.movieService;
import com.springmovie.springmovie.list.Movies;

@RestController
public class MyController {
	@Autowired
	private movieService MovieService;

	@GetMapping("/movies")
	public List<Movies> getMovie() {

		return this.MovieService.getMovie();
	}

	@GetMapping("/movies/{movieName}")
	public Movies getMoviee(@PathVariable String movieName) {
		return this.MovieService.getMoviee(Long.parseLong(movieName));
	}

	@PostMapping("/movies")
	public Movies addMoviee(@RequestBody Movies movies) {
		return this.MovieService.addMoviee(movies);
	}

}
