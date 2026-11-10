package com.nit.hk.arrays;

public class Test11_JoggedArrays {
    public static void main(String[] args) {

        int[][] iaa1 = new int[3][2];
        //all child arrays size is same 2

        int[][] iaa2 = new int[3][];
        //here only parent array is created, child arrays are not created

        iaa2[0] = new int[2]; // 1st child array with size 2
        iaa2[1] = new int[3]; // 2nd child array with size 3
        iaa2[2] = new int[1]; // 3rd child array with size 1
        iaa2[3] = new int[5]; // 4rt child array with size 5

        //MDA with different sizes child arrays is called jogged array

        //A MDA is used used in 2 sitautions
        //1. for storing arrays in one array
        //2. for representing a matrix or DB table


    }
}