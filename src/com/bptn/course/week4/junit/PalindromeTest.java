package com.bptn.course.week4.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PalindromeTest {

	public static boolean isPalindrome(int number) {
		
		int palindrome=number;
		int reverse=0;
		
		while(palindrome!=0) {
			int remainder=palindrome %10;
			reverse=reverse *10 +remainder;
			palindrome=palindrome/10;
		}
		
		return number==reverse;
		
	}
	
	
	@Test
	public void testPalindrome() {
		assertTrue(isPalindrome(121));
		assertTrue(isPalindrome(555));
		assertFalse(isPalindrome(123));
	}

}