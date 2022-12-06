package day27_WrapperClasses.task;

public class SwapTask {
    public static int[] swap(int[]array,int i,int j){
        int s=0;
        s=array[i];
        array[i]=array[j];
        array[j]=s;
        return array;

    }

    public static double[] swap(double[]array,int i,int j){
        double s=0;
        s=array[i];
        array[i]=array[j];
        array[j]=s;
        return array;

    }
    public static char[] swap(char[]array,int i,int j){
        char s;
        s=array[i];
        array[i]=array[j];
        array[j]=s;
        return array;

    }
    public static String[] swap(String[]array,int i,int j){
        String s="";
        s=array[i];
        array[i]=array[j];
        array[j]=s;
        return array;

    }
}
