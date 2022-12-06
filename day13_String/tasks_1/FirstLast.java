package day13_String.tasks_1;

import java.util.Scanner;
public class FirstLast {
    public static void main(String[] args) {
        Scanner ent =new Scanner(System.in);
        System.out.println("Enter a sentence;");
        String sentence= ent.nextLine();

        System.out.println(sentence.charAt(0));
        System.out.println(sentence.charAt(sentence.length()-1));


    }
}
