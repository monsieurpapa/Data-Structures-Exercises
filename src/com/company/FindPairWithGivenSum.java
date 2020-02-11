package com.company;

import java.util.Arrays;

public class FindPairWithGivenSum {
    // THis method finds two elements in an Array whose sum is equal to 10
    public static void findSumPair(int arr[], int SUM){
        // here we iterate through the array except for the last element
        for (int i = 0; i <arr.length-1; i++){
            //whereas this time we start from the i'th element till last element
            for (int j = i+1; j <arr.length;j++){
                if (arr [i] + arr[j] ==SUM){
                    System.out.println("The sum exists for "+arr[i] + " and" +arr[j]);
                }
                else {
                    System.out.println("No Sum available");
                }
            }
        }

    }

    public static void AnotherMethod(int Arr[], int SUM){
        // We start by sorting the array
        Arrays.sort(Arr);
        // We consider two indexes Low And High at the edges
        int low = 0;
        int high = Arr.length-1;

        // Hence reducing the search space bhy checking the condition first

        while (low <high){
            if (Arr[low] + Arr[high] == SUM){
                System.out.println("The pair is found for" + Arr[low] + " and "+ Arr[high]);
                return;
            }
            if (Arr[low] + Arr[high] < SUM)
                low++;
            else
                high--;


        }
        System.out.println("No pairs found");

    }
}
