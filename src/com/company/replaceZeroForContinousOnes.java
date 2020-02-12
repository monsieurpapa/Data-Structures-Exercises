package com.company;
// Given a binary array, Find the index of 0 to be replaced with 1 to get maximum length sequence of continuous ones
public class replaceZeroForContinousOnes {
    public static int findIndexOfZero (int[] A){
        int max_count = 0; // counts the maximum number of 1's (including 0)
        int max_index = -1;  // stores the index to be replaced

        int prev_zero_index = -1;  // stores the index of previous zero
        int count = 0;              // store current index of zeros

        // consider of each i of the array
        for (int i=0; i<A.length;i++){
            // if current element is 1
            if (A[i]==1){
                count++;
            }
            else
                //if current element is 0
            {
                // reset count to 1 + number of ones to the left of current 0
                count = i - prev_zero_index;

                //update prev_zero_index to current index
                prev_zero_index = i;
            }

            // Update maximum count & index of 0 to be replaced if required
            if (count > max_count){
                max_count = count;
                max_index = prev_zero_index;
            }
        }
        // return index of 0 to be replaced or -1 array contains all  1's
        return max_index;
    }
    public static void toMainMethod3(){
        int [] A = {0,0,1,0,1,1,1,0,1,1};
        int index =  findIndexOfZero(A);

        if (index!=-1){
            System.out.println("Index to be replace is : " + index);
        }else
            System.out.println("Invalid Input");

    }

}
