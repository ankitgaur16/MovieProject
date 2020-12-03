package com.springmovie.springmovie.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springmovie.springmovie.list.Movies;

@Service
public class movieServiceImpl implements movieService {

	List<Movies> list;

	public movieServiceImpl() {

		list = new ArrayList<>();
		list.add(new Movies("Bala", " 8 Jan", " 28 Jan"));
		list.add(new Movies("Rock", " 20 Jan", " 30 Jan"));
		list.add(new Movies("PolicyMaker", " 29 Jan", " 16 Fab"));
		list.add(new Movies("Brave", " 02 Feb", " 14 Fab"));
		list.add(new Movies("Drive", " 10 Fab", " 18 Fab"));
		list.add(new Movies("Race", " 15 Fab", " 28 Fab"));
	}

	@Override
	public List<Movies> getMovie() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Movies getMoviee(long movieName) {

		Movies m = null;
		for (Movies moviee : list) {
			if (moviee.getMovies() == movieName) {
				m = movie;
				break;
			}
		}

		return m;
	}

	@Override
	public Movies addMoviee(Movies movie) {
		list.add(movie);
		return null;
	}
	
	public boolean Movies ()
	{
		String startDate;
        String endDate;
       String newMovie;
       String confirmMovie;
	 for(Movies moviee : list)
	 {
		if( newMovie.startDate.CompareToO(confirmMovie.startDate>0)&&(newMovie.startDate.compareto(confirmMovie.endDate<0))||(newMovie.endDate.compareto(confirmMovie.startDate>0)&&(newMovie.endDate.compareto(cofirmMovie.endDate<0))
		{
			return true;
		}
		else
		{
	 return false ;
	}
	 }
	}
}



