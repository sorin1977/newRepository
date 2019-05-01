package com.ssn.sma.persons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PersonFactory {
	private static List<String> names= Arrays.asList("Sorin", "Alex","Tati","Camy","Criss","Mami");
	private static List<String> professions= Arrays.asList("developer","elev","pensionar");
	
	public static List <Person> createPersons(){
		List<Person> result= new ArrayList<Person>();
		 
		for (int i= 0; i<names.size();i++) {
			Gender gender = Gender.MALE;
			if (i>2) {
				gender=Gender.FEMALE;
			}
			Person p =new Person.PersonBuilder(i+1)
					.givenName(names.get(i))
					.withProfession(getRandomProfesion())
					.personGender(gender)
					.personZipCode((i+22036)/2*4)
					.build();
			result.add(p);
		}
		
		return result;
	}

	private static String getRandomName() {
		Random random =new Random();
	 	int index = random.nextInt(names.size()); 
		return  names.get(index);
	}

	private static String getRandomProfesion() {
		Random random =new Random();
	 	int index = random.nextInt(professions.size());
		return professions.get(index);
	}

	 

}
