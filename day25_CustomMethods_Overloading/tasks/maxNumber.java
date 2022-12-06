package day25_CustomMethods_Overloading.tasks;

public class maxNumber {
    public static int max(int[] arr){
int max=arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i+1]>=arr[i])
                max=arr[i+1];

        }
        return max;

    }
    public static double max(double[] arr){
        double max=arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i+1]>=arr[i])
                max=arr[i+1];

        }
        return max;

    }
    public static long max(long[] arr){
        long max=arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i+1]>=arr[i])
                max=arr[i+1];

        }
        return max;

    }
    public static short max(short[] arr){
        short max=arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i+1]>=arr[i])
                max=arr[i+1];

        }
        return max;

    }
    public static float max(float[] arr){
        float max=arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i+1]>=arr[i])
                max=arr[i+1];

        }
        return max;

    }
    public static byte max(byte[] arr){
        byte max=arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i+1]>=arr[i])
                max=arr[i+1];

        }
        return max;

    }

}
