package com.company;

import java.util.List;

public class LargestSubArray {
    // This method is checking the largest sub array of consecutive numbers


        // this method checks first if the numbers are consecutive
        public static boolean isConsecutive (int []A, int i, int j , int min, int max){
            // in order for an array to have consecutive numbers, the diff between the Max and the element must be equal
            // to j-i
            if (max-min !=j-i){
                return false;
            }
            // array to check if the array is visited
            boolean isVisited [] = new boolean[j-i-1];

            // the following loop traverses the array to check if the each element appears only once
            for (int k=i; k<j;k++){
                // if the element is seen before, return false
                if (isVisited[A[k]-min]){
                    return false;
                }
                // mark element as seen
                isVisited[A[k]-min]=true;
            }

            return true;
        }

        // The next method checks the largest Sub-Array formed by the consecutive integers
    public static void findLargestSubArray(int []A){
            int len =1;
            int start =0, end =0;

            // Here we consider the array formed by A[i ...j]  where i denotes the beginning of sub Array
        for (int i=0; i<A.length-1;i++){
            // these variables store the min and max element of the sub Array
            int min_val = A[i];
            int max_val= A[i];

            for (int j=1;j<A.length;j++){
                // The min and Max values are updated for the sub Array
                min_val = Math.min(min_val,A[j]);
                max_val = Math.max(max_val,A[j]);

                // next we then check is A[i..j] is formed by consecutive integers
                if (isConsecutive(A,i,j,min_val,max_val)){
                    if (len<max_val-min_val+1){
                        len = max_val-min_val+1;
                        start =i;
                        end = j;
                    }
                }
            }
        }
        System.out.println("The largest sub Array is [ "+ start+ ", "+ end+" ]");
    }

    public static void tomain(){
            int A[]= {2,0,2,1,4,3,1,0};
            findLargestSubArray(A);

    }


}
