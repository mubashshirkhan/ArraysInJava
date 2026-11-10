package com.nit.hk.arrays;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

//Develop a program to read integers from a keyboard
//read as many values as user is passing

//1. read those values and store in an array object
//2. pass this array as argument to another method
//3. inside this method add and sub all those values and return results as array
//4. in main method print those values

public class Test06_Program4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while(true) {
            try {
                System.out.print("\nHow many values do you want to enter?:");
                int noOfValues = scn.nextInt();

                int[] ia = new int[noOfValues];

                for(int i=0; i<ia.length; i++) {
                    while(true) {
                        try {
                            System.out.print("Enter value"+(i+1)+": ");
                            ia[i] = scn.nextInt();
                            break;
                        }catch(InputMismatchException e) {
                            System.out.println("Error: Enter only integer\n");
                            scn.nextLine();
                        }//innner try-cath

                    }//inner while
                }

                System.out.println("The values you entered are:");
                System.out.println(Arrays.toString(ia));

                int[] resArray = addSub(ia);
                System.out.println("addition    result: "+ resArray[0]);
                System.out.println("subtraction result: "+ resArray[1]);
                break;

            }catch(InputMismatchException e) {
                System.out.println("Error: Enter only integer");
                scn.nextLine();

            }catch(ArrayOpreationFailedException e) {
                System.out.println("Error: " + e.getMessage());
            }//outer try-catch

        }//outer while

    }//main close

    static int[] addSub(int[] ia) {

        if(ia==null) {
            throw new ArrayOpreationFailedException("array can not be null");
        }

        if(ia.length==0) {
            throw new ArrayOpreationFailedException("array length can not be zero");
        }

        int add, sub;
        add = sub = ia[0];

        int element;
        for(int i=1; i<ia.length; i++) {
            element = ia[i];

            add += element;
            sub -= element;
        }

        return new int[] {add, sub};
    }
}