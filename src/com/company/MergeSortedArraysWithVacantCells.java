package com.company;
// Merge two arrays by satisfying given constraints
//Given tow arrays X[] and Y[] of size m and n each where m>=n and X[] has exactly n vacant cells, merge elements of Y[] in their correct position in X[]
// i.e merge (X,Y )by keeping the sorted order
// For eg : Input x[] = {0,2,0,3,   5,6,0,0}  Y[] =  {1,8,9,10,15}  OUTPUT : x[] = {1,2,3,5,6,8,9,10,15}


import java.util.Arrays;

public class MergeSortedArraysWithVacantCells {
    // The Idea is to move non-empty elements of X[] in the beginning of X[] and then merge X[] with Y[] starting from the end // Similar to MergeSort Algorithm

// function to merge X[0..m ] AND y []0...n] to X[0...m+n+1]
    public static void merge (int []X, int []Y, int m, int n){
        // size of X[] is k+1
        int k = m+n+1;

        // run till X[] or Y[] has elements left
        while (m>=0 && n>=0){
            // put next greater element in next free position in X[] from the end
            if (X[m]>Y[n]){
                X[k--] = X[m--];
            }else {
                X[k--] = Y[n--];
            }

        }

        // Copy remaining elements of Y[] (if any) to X[]
        while (n>=0){
            X[k--] = Y[n--];
        }
        // fill Y[] with all zeros
        Arrays.fill(Y,0);

}

    // The function moves non-empty elements in X[] in the beginning and then merge it With Y[]

    public static void rearrange (int[]X, int []Y){
        // moves non-empty elements of X[] in the beginning
        int k=0;
        for (int i=0; i<X.length;i++){
            if (X[i]!=0){
                X[k++] = X[i];
            }
        }
        // merge X[0...k-1] and Y[0..n-1] to X[0..m-1]
        merge(X,Y,k-1,Y.length-1);
    }
    public static void thisisForGitTrial(){
        int x = 2;
        if (2==x)
            System.out.println("YOU ARE NOT CRAZY");
    }

    // To the main method for execution

    public static void anotherMain(){
        int [] X = {0,2,0,3,0,5,6,0,0};
        int [] Y = {1,8,9,10,15};

        // Validate the input before calling rearrange()
        //1. Both Arrays X[] Y[] should be sorted ---- ignore 0's in X[]
        //2. Size of Array X[] >= size of Array Y[] i.e m >=n
        //3. Number of vacant cells in array X[] = size of array Y[]

        rearrange(X,Y);
        //print merged array
        System.out.print(Arrays.toString(X));
    }
}
