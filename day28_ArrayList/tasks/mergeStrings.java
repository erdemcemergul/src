package day28_ArrayList.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class mergeStrings {
    public static ArrayList<String> merged(String[] arr1,String[] arr2){
        ArrayList list=new ArrayList<String>();
      list.addAll(Arrays.asList(arr1));
      list.addAll(Arrays.asList(arr2));
    return list;
    }

    public static void main(String[] args) {
        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};
        System.out.println(merged(arr1, arr2));

    }
}
