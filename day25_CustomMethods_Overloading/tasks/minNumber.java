package day25_CustomMethods_Overloading.tasks;

public class minNumber {
    public static int min(int[] arr){
        int min =arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i+1]<=arr[i])
                min =arr[i+1];

        }
        return min;

    }
    public static double max(double[] arr){
        double min =arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i+1]<=arr[i])
                min =arr[i+1];

        }
        return min;

    }
    public static long max(long[] arr){
        long min =arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i+1]<=arr[i])
                min =arr[i+1];

        }
        return min;

    }
    public static short max(short[] arr){
        short min =arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i+1]<=arr[i])
                min =arr[i+1];

        }
        return min;

    }
    public static float max(float[] arr){
        float min =arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i+1]<=arr[i])
                min =arr[i+1];

        }
        return min;

    }
    public static byte max(byte[] arr){
        byte min =arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i+1]<=arr[i])
                min =arr[i+1];

        }
        return min;

    }
}
