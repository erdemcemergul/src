package day24_CustomMethods_Return.tasks;

import java.util.Arrays;

public class contain {
    public static boolean conta(int[]array,int num){
        int count=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==num)
                count++;

        }
        if (count>0)
            return true;
        else return false;


    }

    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7};
     int   no=10;
        System.out.println(conta(arr,no));
    }
}
