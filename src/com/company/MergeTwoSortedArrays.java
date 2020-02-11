package com.company;

import java.util.Arrays;

/*Given two sorted arrays x []   and Y[] of size m and n each, merge elements of x[]  with elenents of arrays Y[] BY MAINRING  THE SORTED ORDER.
 i.e fill x[] with first elements m smallest elements and fill y[] with remaining elements

This conversion should be done in place and w
ithout using any other data structure

Eg: Forinput : x [] = {1,4,7,8,10} and Y [] = {2,3,9}
    Output :  x [] = [1,2,3,4,7] and Y = [8,9,10]
/
*/
public class MergeTwoSortedArrays {
    public static void mergetwoarrays (int []A, int []B){
        int m = A.length;
        int n = B.length;

// Consider each element A [i] of array A  and ignore the element if it is already in correct order,
// else Swap it with the next smaller elt which happens to be the first element of the array B
        for (int i =0; i<m;i++){
            if (A[i]>B[0]){             // Swap current element of A[] with first element of B)
                //swap (A[i],B[0])
                int temp = A[i];
                A[i] = B[0];
                B[0] = temp;

                int first = B[0];

                //move B[0] to its correct position to maintain sorted order of B[]. Note B [1..n-1] is already sorted
                int k;
                for (k=1;k < n && B[k]< first; k++){
                    B [k-1] = B[k];

                }
                B [k-1] =first;
            }
        }

    }
    // to the main function
            public static void tobeSentMain (){
               int X [] = {1,4,7,8,10};
               int [] Y = {2,3,9};
                mergetwoarrays(X,Y);

               System.out.println("X : "+ Arrays.toString(X));
                System.out.println("B : "+ Arrays.toString(Y));
            }


}
