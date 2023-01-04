package Deck;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    // list of cards in the deck
    private ArrayList<Card> cards;
    private int numPlayers;


    // initialize the deck
    public Deck() {
        cards = new ArrayList<Card>();

        // generate all 52 cards
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                cards.add(new Card(suit, rank));
            }
        }

        // shuffle the deck
        Collections.shuffle(cards);
    }
    public Deck(int numDeck) {
        cards = new ArrayList<Card>();

        // generate all 52 cards
        for (int i = 0; i < numDeck; i++){
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                cards.add(new Card(suit, rank));
            }
        }
        // shuffle the deck
        Collections.shuffle(cards);
    }
    }

    

    public int getNumPlayers() {return numPlayers;}
    public void setNumPlayers(int numPlayers) {this.numPlayers = numPlayers;}



    // draw a card from the top of the deck
    public Card drawCard() {
        if (cards.size() > 0) {
            //System.out.printf("card is %s\n",cards.remove(0));
            return cards.remove(0);
        } else {
            return null;
        }
    }

    // get the number of cards remaining in the deck
    public int getNumCards() {
        return cards.size();
    }
}

// class representing a single card
class Card {
    private int suit;
    private int rank;

    // initialize a card with a given suit and rank
    public Card(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    // get the suit of the card
    public int getSuit() {
        return suit;
    }

    // get the rank of the card
    public int getRank() {
        return rank;
    }

    // get the name of the suit
    public String getSuitName() {
        switch (suit) {
            case 0: return "Clubs";
            case 1: return "Diamonds";
            case 2: return "Hearts";
            case 3: return "Spades";
            default: return "Invalid Suit";
        }
    }

    // get the name of the rank
    public String getRankName() {
        switch (rank) {
            case 1: return "Ace";
            case 2: return "2";
            case 3: return "3";
            case 4: return "4";
            case 5: return "5";
            case 6: return "6";
            case 7: return "7";
            case 8: return "8";
            case 9: return "9";
            case 10: return "10";
            case 11: return "Jack";
            case 12: return "Queen";
            case 13: return "King";
            default: return "Invalid Rank";
        }
    }
}
