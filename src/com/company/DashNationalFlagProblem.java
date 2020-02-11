package com.company;

//Sort an array containing 0’s, 1’s and 2’s (Dutch National Flag Problem)
// Given an array containing only 0's and 1's  and 2's, sort array in linear time and  using constant space
// For example Input  :  {0.1,2,2,1,0,0,2,0,1,1,0} SHOUD output : {0000,1,1,1,1,2,2,2}
public class DashNationalFlagProblem {

    public static void threeWayPartition(int []A, int end){
        int start =0, mid = 0;
        int pivot = 1;

        while (mid <=end){

            if (A[mid]<pivot){// current element is 0
                swap(A,start,mid);
                ++start;
                ++mid;
            }
            else if (A[mid]>pivot){ // current element is 2
                swap(A, mid, end);
                --end;
            }
            else                    //current element is 1
                ++mid;

        }

    }
    public static void swap(int []A,int i, int j){
        int temp=A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    public static void CalledtoMain (){
        int [] A = {};
        threeWayPartition(A, A.length-1);
    }


}
