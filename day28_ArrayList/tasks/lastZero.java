package day28_ArrayList.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class lastZero {
    public static void main(String[] args) {
        ArrayList list=new ArrayList<>(Arrays.asList(1,2,3,4,5));

        list.set(list.size()-1,0 );

        System.out.println(list);


    }


}
