package day28_ArrayList.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class oddMultiply {

    public static void main(String[] args) {
        ArrayList list=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        for (int i = 0; i < list.size(); i++) {
            int x=(int)list.get(i);
            if ((x%2)!=0)
                list.set(i,x*2);



        }

        System.out.println(list);
    }
}
