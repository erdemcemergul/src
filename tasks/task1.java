package tasks;
import java.util.ArrayList;
import java.util.Arrays;
public class task1 {
    public static void main(String[] args) {

        Integer[] arr={2,3,4,5,6,8,9};
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(arr));
        list1.addAll(Arrays.asList(arr));

        list1.removeIf(p-> !(p%3==0));
        System.out.println("list1 = " + list1);


    }
}