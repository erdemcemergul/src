package day24_CustomMethods_Return.tasks;

import java.util.Arrays;

public class removeElement {
    public static int[] remEl(int[] arr,int index){
        int[] newarr=new int[arr.length-1];
        int j=0;
        for (int i = 0; i < arr.length ; i++) {
            if (i==index)
            continue;
            newarr[j]=arr[i];
            j++;
        }

        return newarr;
    }

    public static void main(String[] args) {
        int []array = {10, 20, 30, 40, 50, 60};
      int  ind = 2;
        System.out.println(Arrays.toString(remEl(array,ind)));
    }
}
