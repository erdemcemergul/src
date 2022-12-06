package day24_CustomMethods_Return.tasks;

import java.util.Arrays;

public class reverse {
    public static int[] reversed(int[] array){
        int[] revarray=new int[array.length];
        int j=0;
        for (int i = array.length-1; i >=0 ; i--,j++) {

            revarray[i]=array[j];

        }

        return revarray;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(reversed(arr)));
    }
}
