package com.bptn.course.week6.studentJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentAppClass {

	// variables to connect to our bptn Postgres database
	private static final String userName = "postgres";
	private static final String password = "pg123";
	private static final String dbName = "bptn";
	private static final String port = "5432";
	private static final String dbUrl = "localhost";

	// "jdbc:postgresql://localhost:5432/bptn -->full qualified database url

	// Create a connection
	public Connection createConnection() {

		Connection conn = null;

		try {
			// Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection("jdbc:postgresql://" + dbUrl + ":" + port + "/" + dbName, userName,
					password);

		} catch (Exception e) {

			System.out.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}

		System.out.println("Opened database connection successfully");

		return conn;

	}

	// method to get All students from the students table
	// SQL query: "select * from "students""
	public void getAllStudents(Connection conn) {

		try {
			Statement stmt = null;
			stmt = conn.createStatement();

			// create a sql query which gets all the students from the "students" table
			String sql = "SELECT * from students";

			// executed the query and got a ResultSet Object
			ResultSet rs = stmt.executeQuery(sql); // 100 rows

			// print the results of the sql query onto the console
			while (rs.next()) {
				// Retrieve the column for every single row
				System.out.print("Student Id: " + rs.getInt("studentId"));
				System.out.print(", Course Id: " + rs.getInt("courseId"));
				System.out.print(", Student Name: " + rs.getString("studentName"));
				System.out.print(", Student Email: " + rs.getString("studentEmail"));
				System.out.println(", Student Phone: " + rs.getString("studentPhone"));

			}
			// close the statement
			stmt.close();

		} catch (SQLException e) {

			System.out.println("Exception: " + e.getMessage());
		}

	}

	// Gets the student by its studentId
	// SQL query: "select * from "students" where "studentId"=12"
	public void getStudentById(Connection conn, int studentId) {

		try {
			PreparedStatement stmt = null;

			String sql = "SELECT * FROM students WHERE \"studentId\"=?";

			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, studentId);

			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				// Retrieve the column for every single row
				System.out.print("Student Id: " + rs.getInt("studentId"));
				System.out.print(", Course Id: " + rs.getInt("courseId"));
				System.out.print(", Student Name: " + rs.getString("studentName"));
				System.out.print(", Student Email: " + rs.getString("studentEmail"));
				System.out.println(", Student Phone: " + rs.getString("studentPhone"));
			}
			// close the statement
			stmt.close();
			

		} catch (SQLException e) {

			System.out.println("Exception: " + e.getMessage());
		}

	}
	
	//insert a new record into the students table
	public void addStudent(Connection conn, int courseId,String studentName, String studentEmail,String studentPhone) {
		
		try {
			PreparedStatement stmt = null;
			
			String sql="INSERT into students(\"courseId\",\"studentName\",\"studentEmail\",\"studentPhone\") VALUES(?,?,?,?)";
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, courseId);
			stmt.setString(2, studentName);
			stmt.setString(3, studentEmail);
			stmt.setString(4, studentPhone);
			
			int resultCount= stmt.executeUpdate(); //number of records inserted successfully
			System.out.println(resultCount+ " record(s) inserted");
			// close the statement
			stmt.close();
			
		}
		catch(SQLException e) {
			System.out.println("Exception: " + e.getMessage());
		}
		
	}

	// close the connection
	public boolean closeConnection(Connection conn) {

		boolean flag = true;

		try {
			conn.close();
		} catch (SQLException e) {

			flag = false;
			System.out.println("Exception: " + e.getMessage());
		}

		return flag;

	}

}
