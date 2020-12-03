package com.springmovie.springmovie.list;

public class Movies {
	private String movieName;
	private String startDate;
	private String endDate;

	public Movies(String movieName, String startDate, String endDate) {
		super();
		this.movieName = movieName;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Movies() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getMovieName() {
		return movieName;
	}

	public void gettMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "Movies [movieName=" + movieName + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", getMovieName()=" + getMovieName() + ", getStartDate()=" + getStartDate() + ", getEndDate()="
				+ getEndDate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public long getMovies() {

		return 0;
	}

	public long getmovieName() {
		// TODO Auto-generated method stub
		return 0;
	}

}
