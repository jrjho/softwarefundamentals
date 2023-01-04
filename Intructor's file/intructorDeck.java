package Deck;

import java.lang.invoke.ConstantBootstraps;
import java.security.SecureRandom;
import java.util.List;
import java.util.Random;

public class intructorDeck {

    private List<Card> deck;

    public Deck(){
        this.deck = new LinkedList<>();
        for (int i = 0; i < instructorConstants.SUITS.length; i++){

        }
    }

    public void shuffle(){
        Random rand = new SecureRandom();

        for (int curr =0; curr < deck.size(); curr ++){

            int toSwap = rand.nextInt(deck.size());
            Card c = deck.get(curr);
            Card d = deck.get(toSwap);
            deck.set(curr,d);
            deck.set(toSwap,c);


        }

    }
    
}
