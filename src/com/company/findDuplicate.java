package com.company;

public class findDuplicate {
    // This method finds the duplicate number of an array of limited size
    public static int findDuplicateElement(int []A){
        boolean elementfound [] = new boolean[A.length-1];

        for (int i=0; i<A.length;i++){
            if (elementfound[A[i]]==true){
               return A[i];
            }
            elementfound[A[i]]=true;

        }
        // to avoid duplicate
        return -1;


    }
    // An approach usinfg the XOR mrthod to determine if there are duplicate in a given array
    public static int anotherOne (int []C){
        int xor =0;
        // we first take XOR for all array elements
        for (int i=0; i<C.length;i++){
            xor ^=C[i];

        }
        //take XOR for number from 1 to n-1
        for (int j =1; j<=C.length-1;j++){
            xor ^=j;
        }
        // the smae elements will cancel out each other as a ^ a = 0, 0^0 = 0 and a ^ 0 = a
        return xor;

    }
    public static void toMain (){
        int B [] = {1,2,3,4,4,5,5,6};
        System.out.println("////////////// FINDING DUPLICATES IN AN ARRAY////////////////////\n");
        System.out.println("The duplicate numbers are : ...." + findDuplicateElement(B));
    }
}
