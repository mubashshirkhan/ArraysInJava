
package com.nit.hk.arrays;

import java.util.Arrays;

//Develop a program to copy array elements to another array
//here we must use for loop with index ,
//	for retrieving and copying elements from one array to another array

//we must use Arrays.toString()
//for printing both arrays

/*
 * after retrieving element from the arary
 * 		- if we need to access array location,
 * 		  then we must use indexed for loop
 *
 * 		- if we no need to access the array location,
 *        we must perform validations and calculations
 *        with the value retrieved from the array,
 *        we use for-each loop
 *
 *  in this example we must use indexed for loop
 *  because we must access array location for copying element
 *
 *  in the next example find sum and prod
 *    we can use indexed or enhanced for loop
 */

public class Test08_Program6 {

    public static void main(String[] args) {

        int[] ia1 = {3, 4, 5, 6, 7, 8};
        //=======================================================
        int[] ia2 = ia1; //this array assignment, both ref vars ia1 and ia2 points to same array object
        System.out.println(ia1 == ia2);
        System.out.println();
        //=======================================================
        int[] ia3 = new int[ia1.length];

        for (int i = 0; i < ia1.length; i++) {  //array copy logic
            ia3[i] = ia1[i];
        }

        System.out.println(ia1 == ia3);
        System.out.println(Arrays.toString(ia1));
        System.out.println(Arrays.toString(ia3));

    }
}