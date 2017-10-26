package com.example.peter.highestcard;

/**
 * Created by Peter on 26/10/2017.
 */

public class Card {

    private CardSuit suit;
    private CardValue value;

    public Card(CardSuit suit, CardValue value) {
        this.suit = suit;
        this.value = value;
    }

    public CardSuit getSuit() {
        return suit;
    }

    public CardValue getValue() {
        return value;
    }

    public int getCardValue(){
        int cardRank = this.value.getRank();
        return cardRank;
    }

}
