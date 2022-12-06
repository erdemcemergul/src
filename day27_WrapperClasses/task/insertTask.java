package day27_WrapperClasses.task;

import java.util.Arrays;

public class insertTask {
    public static int[] insert(int[] array, int index,int element){
int[] newarr=new int[array.length+1];
int j=0;
        for (int i = 0; i < newarr.length; i++) {
            if (i==index){
                newarr[i]=element;
            continue;}
            newarr[i]=array[j];
            j++;
        }




return newarr;
    }
    public static String[] insert(String[] array, int index,String element){
        String[] newarr=new String[array.length+1];
        int j=0;
        for (int i = 0; i < newarr.length; i++) {
            if (i==index){
                newarr[i]=element;
                continue;}
            newarr[i]=array[j];
            j++;
        }




        return newarr;
    }
    public static double[] insert(double[] array, int index,double element){
        double[] newarr=new double[array.length+1];
        int j=0;
        for (int i = 0; i < newarr.length; i++) {
            if (i==index){
                newarr[i]=element;
                continue;}
            newarr[i]=array[j];
            j++;
        }




        return newarr;
    }
    public static char[] insert(char[] array, int index,char element){
        char[] newarr=new char[array.length+1];
        int j=0;
        for (int i = 0; i < newarr.length; i++) {
            if (i==index){
                newarr[i]=element;
                continue;}
            newarr[i]=array[j];
            j++;
        }




        return newarr;
    }

    public static void main(String[] args) {
        double[] arr = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(insert(arr, 2, 100)));
    }
}
