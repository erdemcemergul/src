package day28_ArrayList.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class swapElements {
    public static void main(String[] args) {
        ArrayList list=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int s=(int)list.get(0);
        list.set(0,(list.get(list.size()-1)));
        list.set(list.size()-1,s );
        System.out.println(list);

    }
}
