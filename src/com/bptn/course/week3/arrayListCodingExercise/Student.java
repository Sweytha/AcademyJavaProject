package com.bptn.course.week3.arrayListCodingExercise;

class Student {

	
  //instance variables
   private String name;
   private String email;
   private int id;

   //parameterized constructor
   public Student(String initName, String initEmail, int initId) {
      name = initName;
      email = initEmail;
      id = initId;
   }

   // toString() method
   //readable representation of Student Object
   public String toString() {
     return id + ": " + name + ", " + email;
   }

}