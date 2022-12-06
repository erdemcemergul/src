package day28_ArrayList.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class firstDublicated {
    public static Integer duplicated(ArrayList<Integer> list){
Integer x=0;
        for (int i = 0; i < list.size(); i++) {
            if (list.indexOf(list.get(i))==(list.lastIndexOf(list.get(i))-1)){
                x=list.get(i);
            break;}
        }


        return x;

    }

    public static void main(String[] args) {
        ArrayList liste=new ArrayList<>(Arrays.asList(1,2,2,3,4,4,5,6,7,7));
        System.out.println(duplicated(liste));
    }


}
