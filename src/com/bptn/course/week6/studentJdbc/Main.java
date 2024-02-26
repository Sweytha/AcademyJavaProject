package com.bptn.course.week6.studentJdbc;

import java.sql.Connection;

public class Main {

	public static void main(String[] args) {
		
		//create an object
		StudentAppClass jdbc= new StudentAppClass();
		
		Connection conn= jdbc.createConnection(); // create the connection
		jdbc.getAllStudents(conn); //execute the query
		jdbc.getStudentById(conn, 8);
		jdbc.addStudent(conn, 1, "Bob Smith", "bobsmith@example.com", "123456");
		jdbc.closeConnection(conn);
		

	}

}
