package example;
import java.util.Scanner;
public class credit_Card {
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        long cardNumber=0;
        System.out.println("Enter a credit card number as a long integer:");
        cardNumber=number.nextLong();

        String cardno=""+cardNumber;
       int eventot=0;
       int oddtot=0;

        for(int i=0;i<=(cardno.length()/2);i++){

            for (int j =(cardno.length()-2); j >=0; j-=2) {
                int lastnumber=Integer.parseInt(""+cardno.charAt(j))*2;
                if(lastnumber*2<=9)
                    eventot+=(lastnumber *2);
else
                    eventot+=(lastnumber/10)+(lastnumber%10);


            }
            for (int k = cardno.length()-1; k >=0; k-=2) {
                int lastnumber=Integer.parseInt(""+cardno.charAt(k))*2;
                if(lastnumber*2<=9)
                    oddtot+=(lastnumber *2);
                else
                    oddtot+=(lastnumber/10)+(lastnumber%10);
            }

        }
int tot=eventot+oddtot;
        if (tot%10==0)
            System.out.println(cardNumber +" is valid");
        else
            System.out.println(cardNumber +" is invalid");





    }
}
