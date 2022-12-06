package day13_String.tasks_1;

import java.util.Scanner;

public class IsItSame {
    public static void main(String[] args) {
        Scanner wordy = new Scanner(System.in);
        System.out.println("Enter a WORD");
        String checkword = wordy.next();
        if (checkword.charAt(0) == checkword.charAt(checkword.length() - 1))
            System.out.println("same");
        else
            System.out.println("not same");
    }
}
