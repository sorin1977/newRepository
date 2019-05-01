package com.ssn.sma.persons;

public class Person {
	private int id;
	private String name;
	private String profesion;
	private Gender gender;
	private int zipCode;

	private Person() {

	}

	public static class PersonBuilder {
		private int id;
		private String name;
		private String profesion;
		private Gender gender;
		private int zipCode;

		public PersonBuilder(int id) {
			this.id = id;
		}

		public PersonBuilder givenName(String name) {
			this.name = name;
			return this;

		}

		public PersonBuilder withProfession(String profession) {
			this.profesion = profession;
			return this;
		}

		public PersonBuilder personGender(Gender gender) {
			this.gender = gender;
			return this;
		}

		public PersonBuilder personZipCode(int zipCode) {
			this.zipCode = zipCode;
			return this;
		}

		public Person build() {
			Person person = new Person();
			person.gender = this.gender;
			person.id = this.id;
			person.name = this.name;
			person.profesion = this.profesion;
			person.zipCode = this.zipCode;
			return person;

		}

	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", profesion=" + profesion + ", gender=" + gender + ", zipCode="
				+ zipCode + "]";
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
}
