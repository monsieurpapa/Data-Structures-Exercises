package com.company;

import java.util.HashMap;
import java.util.Map;

// Given an array of integers, find maxim length sub-array having given sum
public class maximLengthOfSubArray {
    public static void maxLengthSubArray(int []A, int S){

        // the variable that stores the maximum length of sub-array with sum
        int len =0;
        // stores the index of maximum sub-array having sum S
        int ending_index = -1;
        // consider all sub-arrays starting from i
        for (int i=0;i<A.length;i++){
            int sum = 0;

            //consider all sub-arrays ending at j
            for (int j =i; j<A.length;j++){
                // sum of elements in current sub-Array
                sum+=A[j];

                // if we have found a sub-Array with sum S
                if (sum == S){
                    // update length & ending index of max
                    if (len<j-i+1){
                        len = j-i+1;
                        ending_index = j;
                    }
                }
            }
        }
        // print the Sub Array
        System.out.println("["+ (ending_index - len+1) + ", "+ ending_index + " ]");

    }
     /*// SOLVING THE PROBLEM IN LINEAR TIME using Map
    // Logic :  To create an empty map to store ending index of first sub-array
    having given sum. We traverse the given array and mantain sum  of elements seen so far
    - If sum is seen for the first time, insert the sum with its index into the map
    - If (sum  - S) is seen before, there exists a sub-array with given sum which ends at current
    index and we update maximum length sub-Array having sum S if current sub-Array
    has more length
    // s*/
    public static void  method2withMap (int []A,int S){
        // create an empty Hash Map to store ending index of subArray having some Sum
        Map <Integer,Integer> map = new HashMap<>();

        // insert (0,-1) pair into the set to handle the case when su-Array with sum S starts from index 0
        map.put(0,1);
        int sum = 0;

        //len stores the maximum length sub-Array with sum S
        int len = 0;
        // stores index index of maximum length sub Array having sum S
        int ending_index = -1;

        // traverse the given array
        for (int i=0; i<A.length;i++){
            // sum elements so far
            sum+=A[i];

            // if sum is seen for the first time, insert sum with its index into the map
            if (!map.containsKey(sum))
                map.put(sum,i);

            // update length and ending index of maximum length sub Array having sum S
            if (map.containsKey(sum -S) && len <i-map.get(sum-S)){
                len = i-map.get(sum - S);
                ending_index = i;
            }
        }
        // print the sub Array
        System.out.println("["+ (ending_index - len+1) + ", "+ ending_index + " ]");
        ;
    }
    public static void toMainGuy(){
        int []A = {5,6,-5,5,3,5,3,-2,0};
        int sum =8;
        maxLengthSubArray(A, sum);
    }
}
