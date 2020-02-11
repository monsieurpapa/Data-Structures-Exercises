package com.company;

import java.util.Arrays;

public class SortBinaryArray {
    public static void sortBinary (int Arr[]){
        int zeros =0;
        // Counting the number of Zeros whose last index will be used to precede the 1s
        for (int i =0; i<Arr.length;i++){
            if (Arr[i] ==0)
                    zeros++;

        }
      int k = 0;
        // Adding the Zeros to the beginning of the Array
        while (zeros-- !=0){
            Arr[k++]=0;
        }
        // Adding the 1s after the 0s
        while (k <Arr.length){
            Arr[k++]=1;
        }
    }
    public static void anotherMethod(int A[]){
        int k =0;
        for (int i =0; i<A.length;i++){
            if (A[i]==0)
                A[k++]=0;
        }
        for (int j = k; j<A.length;j++){
            A[k++] =1;
        }

    }
    public static void method3(int A[]){
        int pivot =1;
        int j = 0;

        for (int i=0;i<A.length;i++){
            if (A[i]<pivot)
                Swap(A,i,j);
                j++;
        }

    }

    private static void Swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void toTheMainMethod(){
        int A[] = {0,1,0,1,0,1,0,0,1};
        sortBinary(A);
        // Printing the sorted ARRAY
        System.out.println(Arrays.toString(A));


    }
}
