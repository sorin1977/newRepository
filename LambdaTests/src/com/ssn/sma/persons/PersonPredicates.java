package com.ssn.sma.persons;

import java.util.function.Predicate;

public class PersonPredicates {
	public static Predicate<Person> malePersons = p-> p.getGender().equals(Gender.MALE);
	public static Predicate <Person> femalePersons=p->p.getGender().equals(Gender.FEMALE);
	public static Predicate <Person> isDeveloper=p->p.getProfesion().equalsIgnoreCase("developer");
	

}
