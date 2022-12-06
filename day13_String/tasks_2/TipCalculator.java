package day13_String.tasks_2;
import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {
        Scanner tip=new Scanner(System.in);
       double ratio=0;
        double totaltip=119.0;
        System.out.println("Split or No split (Yes or No)?");
        String split= tip.next();

        if (split.equals("Yes")){
            System.out.println("Enter the number of people");
            int people=tip.nextInt();
            System.out.println("Enter the check amount:");
            double amount=(double) tip.nextInt();
            System.out.println("How was the service quality?");
            String quality=tip.next();
            if(quality.equals("Excellent"))
                 ratio=25.0;
            if (tip.equals("Great"))
                ratio=20.0;
             if (tip.equals("Good"))
                ratio=15.0;
            else if (tip.equals("Fair"))
                 ratio=10.0;
            else if (tip.equals("Poor"))
                ratio=5.0;

            System.out.println("Number of people entered: "+people);
            System.out.println("Total to pay: "+(totaltip+amount));
            System.out.println("Total tip: "+totaltip);
            double totalperperson= (totaltip+amount)/4;
            System.out.println("Total per person: "+totalperperson);
            double tipperperson= (totaltip*(ratio/100));
            System.out.println("Tip per person: "+tipperperson);


        }
        else
            System.out.println("There is no tip");




    }



}
