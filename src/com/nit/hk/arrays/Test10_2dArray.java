package com.nit.hk.arrays;
//Types of arrays
/*
 * We have 2 types of arrays
 *  	1. single dimensional array	-> []
 *  	2. multi dimensional array	-> [][]...
 *
 *  for storing a group values as array
 *    we must single dimensional array
 *    - a single dimensional array is 'array of values'
 *
 *  for storing a group of arrays as one array
 *    we must use multi dimensional array
 *    - a multi dimensional array is 'array of arrays'
 *
 *
 *   bag with books
 *   	-> single dimensional array
 *
 *   bag with other bags
 *   	-> multi dimensional array
 *
 *
 * MDA creation with new kw and size
 * =======================================
 *
 *   int[][] 	iaa	= new int[3][2];  	//array of arrays
 *  					//parent array size = 3
 *  					//child arrays size = 2
 *   iaa[0][0] = 3;
 *   iaa[0][1] = 4;
 *
 *   iaa[1][0] = 5;
 *   iaa[1][1] = 6;
 *
 *   iaa[2][0] = 7;
 *   iaa[2][1] = 8;
 *
 *
 * MDA creation with initializer { }
 * =======================================
 *
 *   int[][] 	iaa	= { {3, 4 } , { 5, 6 } , { 7, 8} };
 *
 *
 * retrieving and printing values from array
 * =========================================
 * we must inner for loops
 * 	1 for parent array
 *  2 for child array
 *
 *
 *  for(int i=0; i<iaa.length; i++){ //for parent array
 *  	int[] ia = iaa[i];
 *
 *  	for(int j=0; j<ia.length; j++){
 *  		//System.out.println(iaa[i][j]);
 *  		System.out.println(ia[j]);
 *  	}
 *
 *  }
 *
 *
 */


public class Test10_2dArray {
    public static void main(String[] args) {
        int[][] iaa = {{3, 4}, {5, 6}, {7, 8}};

        for(int i=0; i<iaa.length; i++) {
            for(int j=0; j<iaa[i].length; j++) {
                System.out.print(iaa[i][j] + " ");
            }
            System.out.println();
        }
    }
}