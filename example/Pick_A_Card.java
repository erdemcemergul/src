package example;

import java.util.Scanner;

public class Pick_A_Card {
    public static void main(String[] args) {

        Scanner cardNumber = new Scanner(System.in);
        System.out.println("ENTER A BETWEEN 1 and 52;");
        int c = cardNumber.nextInt();
        String erdem="";


        while (c < 1 || c > 52) {
            System.err.println("Invalid- Please ENTER A BETWEEN 1 and 52; ");
            c = cardNumber.nextInt();
        }

        int suit = c / 13;
        int rank = c % 13;
        String suitName = (suit == 0) ? "Clubs" : (suit == 1) ? "Diamonds" : (suit == 2) ? "Hearts" : "Spades";
        String rankName = (rank == 1) ? "Ace" : (rank == 2 || rank == 3 || rank == 4 || rank == 5 || rank == 6 || rank == 7 || rank == 8 || rank == 9 || rank == 10) ? String.valueOf(rank) : (rank == 11) ? "Jack" : (rank == 12) ? "Queen" : "King";


        System.out.println("The card you picked is " + rankName + " of " + suitName);


    }
}


