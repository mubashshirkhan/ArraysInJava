package com.nit.hk.arrays;
//Develop a program to take an array of integers as argument
//in this method find the sum of all integers available in this array
//return result

//in main method call above method by passing int[]
//this int[] must contain dynamic value reading from the end-user

public class Test04_Program2_withEH {

    public static void main(String[] args) {

        try {
            int noOfValues =
                    Integer.parseInt(IO.readln("How many values do you want to enter?: "));

            int[] ia = new int[noOfValues];

            for (int i = 0; i < noOfValues; i++) {
                ia[i] = Integer.parseInt(IO.readln("Enter value" + (i + 1) + ": "));
            }

            //	int result = sumOf(null);

            int result = sumOf(ia);
            System.out.println("Sum of all given values: " + result);

        } catch (ArrayOpreationFailedException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    static int sumOf(int[] ia) throws ArrayOpreationFailedException {

        if (ia == null) {
            throw new ArrayOpreationFailedException("array can not be null");
        }

        if (ia.length == 0) {
            throw new ArrayOpreationFailedException("array length can not be zero");
        }

        int sum = ia[0];

        for (int i = 1; i < ia.length; i++) {
            sum += ia[i];
        }

        return sum;
    }
}

class ArrayOpreationFailedException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ArrayOpreationFailedException() {
        super();
    }

    public ArrayOpreationFailedException(String errMsg) {
        super(errMsg);
    }
}