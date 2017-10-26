package com.example.peter.highestcard;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Peter on 26/10/2017.
 */

public class Deck {
    private ArrayList<Card> deck;

    public Deck() {
        // create empty ArrayList
        deck = new ArrayList<Card>();
        // generate deck / populate ArrayList
        generateDeck();
    }

    public ArrayList<Card> generateDeck(){
        // run through each suit in CardSuit
        for(CardSuit suit : CardSuit.values()) {
            // run through each value in CardValue
            for(CardValue value : CardValue.values()) {
                // create new card from suit and cardValue
                deck.add(new Card(suit, value));
            }
        }

        return deck;
    }

    // getter
    public ArrayList<Card> getDeck() {
        return this.deck;
    }


    // shuffle deck
    public ArrayList<Card> shuffle(){
        Collections.shuffle(this.deck);
        return deck;
    }

    //    remove top card
    public Card dealTopCard(){
        Card card = deck.get(0);
        deck.remove(0);
        return card;
    }
}
