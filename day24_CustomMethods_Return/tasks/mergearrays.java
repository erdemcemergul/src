package day24_CustomMethods_Return.tasks;

import java.util.Arrays;

public class mergearrays {
    public static int[] merge(int[]ar1,int[]ar2)
    {
        int[] merged=new int[ar1.length+ ar2.length];
        for (int i = 0; i < ar1.length; i++) {
            merged[i]=ar1[i];

        }
        for (int i = 0; i < ar2.length ; i++) {
            merged[i+ ar1.length]=ar2[i];

        }
        return merged;


    }

    public static void main(String[] args) {
        int [] a={1,2,3};
        int [] b={4,5,6};
        System.out.println(Arrays.toString(merge(a,b)));




    }


}
