package com.bptn.course.week2.exceptionHandling;

public class BuiltInExceptionExample {

    // This method uses 'throws' to indicate it might throw an IllegalArgumentException,
    // though for unchecked exceptions like IllegalArgumentException, 'throws' is optional in the method signature.
    public static void checkPositive(int number) throws IllegalArgumentException {
        if (number < 0) {
            // Here, 'throw' is used to explicitly throw an IllegalArgumentException
            throw new IllegalArgumentException("Number must be positive");
        }
        System.out.println("Number is positive");
    }

    public static void main(String[] args) {
        try {
            // This call is expected to be okay
            checkPositive(10);

            // This call will cause an IllegalArgumentException to be thrown
            checkPositive(-10);
        } catch (IllegalArgumentException e) {
            // Catching the IllegalArgumentException
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
