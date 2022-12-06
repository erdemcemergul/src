package day13_String.tasks_1;
import java.util.Scanner;
public class CheckWords {
    public static void main(String[] args) {
        Scanner words=new Scanner(System.in);
        System.out.println("Enter three words");
        String word1= words.next();
        String word2= words.next();
        String word3= words.next();
        if((word1.length()==word2.length())&(word2.length()==word3.length()))
            System.out.println("All words are same length");
       else if ((word1.length()!=word2.length())&(word2.length()!=word3.length())&(word1.length()!=word3.length()))
            System.out.println("All different length");
            else
            System.out.println("Not Same nor Different lengths");

    }
}
