package com.bptn.course.week4.streamAPI;


import java.util.ArrayList;
import java.util.List;


public class Person {

	int id;
	String name;
	double salary;

	public Person(int id, String name, double salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		return this.id+ " "+ this.name +" " +this.salary;
	}

	public static void main(String[] args) {
		
		//create an arraylist to store person objects
		List<Person> personList=new ArrayList<>();
		personList.add(new Person(1,"John",2500));
		personList.add(new Person(2,"Alex",3500));
		personList.add(new Person(3,"Alice",4500));
		personList.add(new Person(4,"Bob",5500));
		personList.add(new Person(5,"Charlie",6500));
		
		personList.stream()
		           .filter(person -> person.getSalary() > 3000)
		           .forEach(person->System.out.println(person));
	
		
		 // Filter persons with salary greater than 3000 and map their names
        personList.stream()
                .filter(person -> person.getSalary() > 3000)
                .map(Person::getName)
                .forEach(System.out::println);
		

	}

}