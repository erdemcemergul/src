package day24_CustomMethods_Return.tasks;

public class frequencyOfNumbers {

    public static int frequency(int[] array,int num){
        int count=0;
        for (int i=0;i< array.length; i++){
            if (array[i]==num)
                count++;

        }
return count;




    }

    public static void main(String[] args) {
        int[] array ={1,1,1,1,1,2,2};
        System.out.println(frequency(array, 1));
    }


}
