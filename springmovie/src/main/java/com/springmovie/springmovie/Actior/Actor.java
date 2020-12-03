package com.springmovie.springmovie.Actior;

public class Actor {
	private String actorName;
	private int phoneNumber;
	private int age;
	private Object confirmMovies;

	public Actor(String actorName, int phoneNumber, int age, String confirmMovies) {
		super();
		this.actorName = actorName;
		this.phoneNumber = phoneNumber;
		this.age = age;
		this.confirmMovies = confirmMovies;
	}

	public Actor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getconfirmMovies() {
		return (String) confirmMovies;
	}

	public void setconfirmMovies(String confirmMovise, Object confirmMovies) {
		this.confirmMovies = confirmMovies;
	}
	@Override
	public String toString() {
		return "Actor [actorName=" + actorName + ", phoneNumber=" + phoneNumber + ", age=" + age + ", getActorName()="
				+ getActorName() + ", getPhoneNumber()=" + getPhoneNumber() + ", getAge()=" + getAge() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
