package com.company;

import java.util.Arrays;

// Given an array of integers, find maximum product of two integers in an array
public class MaximumProductOfTwoIntegers {

    // NAIVE SOLUTION TO FIND MAXIM PRODUCT OF TWO INTEGERS IN AN ARRAY
    public static void maximProduct (int []A){
        int max_product = Integer.MAX_VALUE;
        int max_i = -1,max_j=-1;


        for (int i =0; i<A.length;i++){

            for (int j=i;j<A.length;j++){
                   // Update maximum product if required
                if (max_product < A[i]*A[j]){
                    max_product = A[i] *A[j];
                    max_i =i;
                    max_j = j;
                }
            }
    }
        System.out.println("Pair is ("+ A [max_i] + ", "+ A[max_j]+ " )");

    }

    // AN ALTERNATIVE SOLUTION IS THE METHOD HERE : This sorts the array first then gets the product of the last two elements of the array
    public static void aBetterApproach(int []A){
        // n is the length of the array
        int n = A.length;
        // sort array in ascending order
        Arrays.sort(A);
        // maximum product is formed by maxim of
        //1. product of the first two elements or
        //2. product of last two elements
        if (A[0]*A[1] > (A[n-1])*(A[n-2])){
            System.out.println("Pair is ( "+A[0]+ ", "+ A[1]+ ")");
        }else {
            System.out.println("Pair is ( "+A[n-1]+ ", "+ A[n-2]+ ")");
        }
    }

    public static void formainmain(){
        int [] A = {-10,-3,5,6,-2};
        maximProduct(A);
    }
}
