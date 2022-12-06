package day24_CustomMethods_Return.tasks;

import java.util.Arrays;

public class addElement {
    public static int[] add(int[] arr,int num){
        int[] ary=new int[arr.length+1];
        for (int i = 0; i < ary.length-1; i++) {
            ary[i]=arr[i];

        }
        ary[ary.length-1]=num;

return ary;
    }

    public static void main(String[] args) {
        int[] ar={1,2,3};
        int no=4;
        System.out.println(Arrays.toString(add(ar,no)));
    }

}
