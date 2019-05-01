package com.ssn.sma.persons;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static com.ssn.sma.persons.PersonFactory.*;

public class TestPersons {

	public static void main(String[] args) {
		List <Person> persons= createPersons(); 
		//persons.stream().forEach(System.out::println);
		  persons.stream()
		  .filter(PersonPredicates.femalePersons)
		  .filter(PersonPredicates.isDeveloper)
		  .collect(Collectors.toList()).stream().forEach(System.out::println);
		
	}

}
