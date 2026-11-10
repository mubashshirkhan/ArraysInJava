package com.nit.hk.arrays;
//Develop a program to find 'sum and prod' of all even numbers available in the array
//here we can use either indexed for loop (or) for-each loop

public class Test09_Program7 {
    public static void main(String[] args) {

        int[] ia1 = {3, 4, 5, 6, 7, 8};

        int sum=0, prod=0;
        boolean isFirst = true;

//		int element;
//		for(int i=0; i<ia1.length; i++) {
//			element = ia1[i];
//			if(element%2 == 0) {
//				if(isFirst) { 			//if it is first even number
//					sum = prod = element;  //storing in sum and prod variable
//					isFirst = false;
//				}else {					//if it is not first even number
//					sum += element;		   //adding with previous res
//					prod *= element;
//				}
//			}
//
//		}//for close

        for(int element : ia1) {

            if(element%2 == 0) {
                if(isFirst) { 			//if it is first even number
                    sum = prod = element;  //storing in sum and prod variable
                    isFirst = false;
                }else {					//if it is not first even number
                    sum += element;		   //adding with previous res
                    prod *= element;
                }
            }

        }//for close

        System.out.println(sum);
        System.out.println(prod);
    }
}