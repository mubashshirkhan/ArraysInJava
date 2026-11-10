package com.nit.hk.arrays;

import java.util.Arrays;

//Different ways we can retrieve elements from array object
/*
 * we can retrieve elements from array object in 5 ways
 * 	1. by using ia[0], ia[1], ia[2]				from java 1.0
 *
 * 	2. by using for loop with index 			from java 1.0
 * 	3. by using Arrays.toString(ia) method		from java 1.2v
 * 	4. by using for-each loop					from java 1.5v
 * 	5. by using Stream API & forEach(-) method 	from Java 1.8v
 *
 * the first approach is static nature
 * next 4 approaches are dynamic nature
 */

public class Test06_Program5 {
    public static void main(String[] args) {

        int[] ia = {3, 4, 5, 6, 7};

        //Approach #1: directly by using ia[0]
/*
		System.out.println(ia[0]);
		System.out.println(ia[1]);
		System.out.println(ia[2]);
		System.out.println(ia[3]);
		System.out.println(ia[4]);
	//	System.out.println(ia[5]);
*/
        //Approach #2: by using for loop with index
        for(int i=0; i<ia.length; i++) {
            System.out.println(ia[i]);
        }

        //Approach #3: by using Arrays.toString(ia)
        System.out.println(Arrays.toString(ia));

        //Approach #4: by using enhanced for loop or for-each loop
        for(int i=0; i<ia.length; i++) {	//regular for loop with index
            int element = ia[i];
            System.out.println(element);
        }

        for( int element : ia ) {			//enhanced for loop (or) for-each loop
            System.out.println(element);
        }

        //Approach #5: by using Stream API and forEach(-) method
        Arrays.stream(ia).forEach(element -> System.out.println(element)); //forEach() with LE
        Arrays.stream(ia).forEach(System.out::println) ;					//forEach() with MR

    }//main close
}