package day13_String.tasks_1;
import java.util.Scanner;
public class ThreeLetter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter a three letter word");
        String wordy=input.next();
        String subwordy = wordy.substring(1,2);
        if(wordy.length()<3)
            System.out.println("Word is too short");
        else if (wordy.length()>3)
            System.out.println("Word is too long");

       else{
            if (subwordy.equals("a"))
                System.out.println("Cool word");
            else
                System.out.println("Okay word");}

    }


}
