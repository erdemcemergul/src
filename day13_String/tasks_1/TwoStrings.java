package day13_String.tasks_1;
import java.util.Scanner;
public class TwoStrings {
    public static void main(String[] args) {
        Scanner sent=new Scanner(System.in);
        System.out.println("Enter two sentences;");
        String sent1=sent.nextLine();
        String sent2=sent.nextLine();
       String longsentence=sent1+" "+sent2;
        System.out.println(longsentence);
    }
}
