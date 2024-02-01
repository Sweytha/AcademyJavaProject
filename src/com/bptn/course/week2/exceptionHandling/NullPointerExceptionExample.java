package com.bptn.course.week2.exceptionHandling;

public class NullPointerExceptionExample {

	public static void main(String[] args) {

		String text = null;

		try {
			System.out.println(text.length());// fails here because text is null
		} catch (NullPointerException e) {
			System.out.println("Null pointer exception has occurred " + e.getMessage());
		}

		System.out.println("Statements to be executed after the try catch");

	}

}
//1. NullPointerException exceptions is an unchecked exception- programmer handles the exception and it is not enforced by Java compiler 
//2. It occurs when we access a string whose length is null