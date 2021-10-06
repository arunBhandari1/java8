package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import methodReference.Student;

public class StreamApi
{

	public static void main(String[] args)
	{
		List <Person> people = List.of(
				new Person("Seli",Gender.FEMALE),
				new Person("Arun",Gender.MALE),
				new Person("Anusha",Gender.FEMALE),
				new Person("Amaya",Gender.FEMALE),
				new Person("Binita",Gender.FEMALE),
				new Person("Manoj",Gender.MALE)
				);
		
		//Imperative approach
		
//		List<Person> females = new ArrayList<>();
//		
//		for (Person person: people)
//		{
//			if (Gender.FEMALE.equals(person.gender))
//			{
//				females.add(person);
//			}
//		}
//		
//		for (Person female: females)
//		{
//			System.out.println(female);
//		}
		
		
		//Declarative Approach 
		Function<Person, String> fun= person -> person.name;
		people.stream()
				.map(fun)
				.mapToInt(String::length)
				.forEach(System.out::println);
		
		boolean containsOnlyFemales = people.stream()
				.allMatch(person -> Gender.FEMALE.equals(person.gender));
				
		System.out.println(containsOnlyFemales);
		
	}
	
	
	static class Person
	{
		private String name;
		private Gender gender;
		
		Person(String name, Gender gender)
		{
			this.name= name;
			this.gender= gender;
			
		}
		
		@Override
		public String toString()
		{
			
			return "Person :- Name = "+ name + ", Gender = "+ gender ;
			
		}
		
	}
	
	enum Gender {
		MALE,FEMALE
	}
}
