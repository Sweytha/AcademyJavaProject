package com.bptn.course.week4.jUnitBooks;

public class Textbook extends Book {
	   
	private int edition;

	public Textbook(String title, double price, int edition) {
		super(title, price);
		this.edition= edition;
		 
	}
	
	@Override
	public String getBookInfo() {
	  return super.getBookInfo() + "-" + this.edition;
	}

	public int getEdition() {
		return this.edition;
	}
	
	public boolean canSubstituteFor(Textbook other) {
		
		return this.edition >=other.getEdition() && this.getTitle().equals(other.getTitle());
	}
	
	
}