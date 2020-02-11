package com.company;
import java.util.HashSet;
import java.util.Set;

//This function checks if the sub-array with 0 sum is present in a given array or not
public class checkSubArray {
    public static boolean zeroSurbArray(int A[]){
        //create an empty set that stores the sum of elements of each sun-array A[0...i] where 0<=i < A.length
        Set <Integer> set = new HashSet();
        // insert 0 into the set to handle the case when sub-array with 0 sum starts from index 0
        set.add(0);
        int sum = 0;

        // iterate traverse the given array
        for (int i=0; i<A.length;i++){
            // sum of elements so far
            sum += A[i];
            int x = 0;

            // check if the sum ids seen before , we have found the subarray whose sum is 0
            if (set.contains(sum)){
                return true;
            }
            // insert sum to the set
            set.add(sum);
        }
        return false;
    }

    //This method gives all subArrays with Sum 0 as Output
    public static void AllSubArrays(int Arr[]){
        Set <Integer> s = new HashSet<>();
        int sum = 0;
        for (int i = 0 ; i<Arr.length;i++){
            for (int j = i; j < Arr.length;j++){
                sum +=Arr[j];
                if (sum ==0)
                    System.out.println("SubArray [ " + i + ".. " + j + " ]");
            }
        }
    }
    public static void forMainMehtod1(){
        int [] A = {4,-6,3,-1,4,2,7};
        int [] B = {3,4,-7,3,1,3,1,-4,-2,-2};
      if (zeroSurbArray(A)){
            System.out.println("SubArray Exists");
        } else
            System.out.println("SubArray do not exist \n");
        System.out.println("/////////////////////NEW METHOD//////////////////////////////");
    AllSubArrays(B); //  calling the method for all subArrays with SUm 0

    }

}
