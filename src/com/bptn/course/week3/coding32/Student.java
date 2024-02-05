package com.bptn.course.week3.coding32;

class Student {

	//instance variables
    private String name;
    private int classGrade;

    //constructor
    public Student(String name, int classGrade) {
        this.name = name;
        this.classGrade = classGrade;
    }
  
    //getters
    public String getName() {
        return this.name;
    }

    public int getClassGrade() {
        return this.classGrade;
    }

    // overrides the default Object toString method;
    public String toString() {
        return "Student name is: " + name + " and student's class grade is: Grade " + classGrade;
    }

}