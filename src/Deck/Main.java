package Deck;

import java.util.Scanner;
//import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {

        int num;
        Card card;

        //Deck deck = new Deck();
        Scanner s = new Scanner(System.in);
        System.out.println("How many deck of cards?:");

        Deck deck = new Deck(s.nextInt());
        System.out.println("How many players?:");
        num = s.nextInt();
        deck.setNumPlayers(num);
        s.close();
        String[] playerCardValue = new String[deck.getNumPlayers()];
        String[] playerCardSuit = new String[deck.getNumPlayers()];
        int[] valueArray = new int[deck.getNumPlayers()];
        int[] suitArray = new int[deck.getNumPlayers()];

        System.out.printf("No of cards = %d\n", deck.getNumCards());
        System.out.printf("No of players = %d\n", deck.getNumPlayers());
        
        for (int i = 0; i < num; i++){
            card = deck.drawCard();
            playerCardValue[i] = card.getRankName();
            playerCardSuit[i] = card.getSuitName();
            valueArray[i] = card.getRank();
            suitArray[i] = card.getSuit();
            
            System.out.printf("Player %d's card is %s %s\n", i, playerCardValue[i],playerCardSuit[i]);
        }
        // Arrays.sort(valueArray);
         
    
    } 
        
    
}
