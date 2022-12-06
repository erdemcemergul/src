package day13_String.tasks_1;

import java.util.Scanner;

public class Stringlength {
    public static void main(String[] args) {
        Scanner sent = new Scanner(System.in);
        System.out.println("Please enter a word");
        String sentence = sent.next();

        if (sentence.equals("empty"))
            System.out.println("string is empty");
        else if (sentence.length() > 3)
            System.out.println(sentence.substring(sentence.length() - 3, sentence.length()));
        else
            System.out.println(sentence);


    }
}
