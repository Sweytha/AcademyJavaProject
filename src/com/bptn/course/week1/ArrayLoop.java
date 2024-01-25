package com.bptn.course.week1;

public class ArrayLoop {

	public static void main(String[] args) {

		int[] numArray = { 10, 20, 30, 40 };

		int[] numArray1 = { 20, 40, 60, 80 };

		multiplyArray(numArray, 2);
		multiplyArray(numArray1, 3);

	}
	//defined the method
	//this method should be able to double any array given to it as an argument
	public static void multiplyArray(int [] valueArray , int n) {
		
		
		for(int i =0 ;i<valueArray.length;i++) {
			
			valueArray[i] *=n;
			System.out.println("The elements after being doubled are " +valueArray[i]);
			
		}
		
		
	}

}

//i= 0
//numArray[0]= 10 *2 =20

//i=1
//numArray[1] =20 *2 =40

//i=2
//numArray[2] =30*2 =60

//i=3
//numArray[3] =40*2 =80
