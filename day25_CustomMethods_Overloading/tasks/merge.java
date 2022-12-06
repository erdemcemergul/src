package day25_CustomMethods_Overloading.tasks;

public class merge {

    public static int[] merg(int[]ar1, int[]ar2)
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
    public static double[] merg(double[]ar1, double[]ar2)
    {
        double[] merged=new double[ar1.length+ ar2.length];
        for (int i = 0; i < ar1.length; i++) {
            merged[i]=ar1[i];

        }
        for (int i = 0; i < ar2.length ; i++) {
            merged[i+ ar1.length]=ar2[i];

        }
        return merged;


    }
    public static char[] merg(char[]ar1, char[]ar2)
    {
        char[] merged=new char[ar1.length+ ar2.length];
        for (int i = 0; i < ar1.length; i++) {
            merged[i]=ar1[i];

        }
        for (int i = 0; i < ar2.length ; i++) {
            merged[i+ ar1.length]=ar2[i];

        }
        return merged;


    }
    public static String[] merg(String[]ar1, String[]ar2)
    {
        String[] merged=new String[ar1.length+ ar2.length];
        for (int i = 0; i < ar1.length; i++) {
            merged[i]=ar1[i];

        }
        for (int i = 0; i < ar2.length ; i++) {
            merged[i+ ar1.length]=ar2[i];

        }
        return merged;


    }


}
