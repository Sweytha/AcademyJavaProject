package com.bptn.course.week3.arrayListCodingExercise;

import java.util.ArrayList;

public class StudentList {
   // main method for testing
   public static void main(String[] args) {
      ArrayList<Student> roster = new ArrayList<Student>(); //this ArrayList can store Student Objects //<Type>=<Student>
      roster.add(new Student("Skyler", "skyler@sky.com", 323171));
      
      roster.add(new Student("Ayanna","ayanna@gmail.com",789012));
      // add your code here

      System.out.println(roster);
   }
 }


