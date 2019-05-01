package com.ssn.sma.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class TesteLambda {

	@SuppressWarnings("unchecked")
	public static <T extends Object> T reverseStr(FunctionalInterfaceString<String> reverse, String str) {
		return (T) reverse.compute(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FunctionalInterfaceString<String> myString = (input -> "Test functional interface " + input);

		System.out.println(myString.compute("Lambda 1"));
		FunctionalInterfaceString<Integer> myInteger = (input -> input * input);
		System.out.println(myInteger.compute(45));
		String reverseStr = reverseStr(myString, "object");
		FunctionalInterfaceString<String> withReturn = (input -> "Reverse " + input);

		System.out.println(withReturn);
		System.out.println(reverseStr);
		System.out.println(reverseStr);

		BiFunction<String, Integer, Integer> biFunction = (position, age) -> getSalaryByPositionAndAge(position, age);

		System.out.println(biFunction.apply("manager", 31));

		Function<Integer, String> function = (sal) -> getWorkerTypeBySalary(sal);

		String workerType = biFunction.andThen(function).apply("manager", 33);
		String workerType1 = biFunction.andThen(function).apply("developer", 25);
		System.out.println(workerType);
		System.out.println(workerType1);

	}

	private static Integer getSalaryByPositionAndAge(String position, Integer age) {
		if (position != null && age != null) {
			if (position.equals("manager") && age > 30) {
				return 10000;
			} else if (position.equals("developer") && age > 20) {
				return 8000;

			} else {
				return 1;
			}
		} else {
			return 0;
		}
	}

	private static String getWorkerTypeBySalary(Integer sal) {
		switch (sal) {
		case 10000:
			return "boss";
		case 8000:
			return "furnicutza";
		default:
			return "pierde vara";
		}
	}

}
