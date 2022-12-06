package day28_ArrayList.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class minNumber {
    public static Integer min(ArrayList<Integer> list){
        Integer a= list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (a>= list.get(i))
                a= list.get(i);

        }
        return a;

    }



    public static void main(String[] args) {
        ArrayList liste=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(min(liste));
    }
}
