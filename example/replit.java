package example;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
 public class replit {
    public static boolean hunt(ArrayList<String> result,int wayStones,int boast) {

int sum=0;
int frequency = Collections.frequency(result, "nanuk" );
result.removeIf(p->(p.equals("nanuk")));
        for (int i = 0; i < result.size(); i++)
            sum+=Integer.valueOf(result.get(i));



return  (wayStones>=frequency&&boast<=sum)?true:false;


    }

    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int stones = in.nextInt();
        int boast = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(hunt(list, stones, boast));

    }
}
