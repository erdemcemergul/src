package day25_CustomMethods_Overloading.tasks;

import java.util.Arrays;

public class reverse {
    public static int[] rev(int[] arr){
        Arrays.sort(arr);
        int[] revarr=new int[arr.length];
        for (int i= arr.length-1,j=0;i>=0;i--,j++)
            revarr[j]=arr[i];
    return revarr;
    }
    public static double[] rev(double[] arr){
        Arrays.sort(arr);
        double[] revarr=new double[arr.length];
        for (int i= arr.length-1,j=0;i>=0;i--,j++)
            revarr[j]=arr[i];
        return revarr;
    }
    public static char[] rev(char[] arr){
        Arrays.sort(arr);
        char[] revarr=new char[arr.length];
        for (int i= arr.length-1,j=0;i>=0;i--,j++)
            revarr[j]=arr[i];
        return revarr;
    }
    public static String[] rev(String[] arr){
        Arrays.sort(arr);
        String[] revarr=new String[arr.length];
        for (int i= arr.length-1,j=0;i>=0;i--,j++)
            revarr[j]=arr[i];
        return revarr;
    }
}
