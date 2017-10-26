package com.example.peter.highestcard;

/**
 * Created by Peter on 26/10/2017.
 */

public class Player {

    private String name;
    private Card card;

    public Player(String name) {
        this.name = name;
        this.card = null;
    }

    public String getName() {
        return this.name;
    }

    public Card getCard() {
        return this.card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public int getCardValue(){
        int value = this.card.getCardValue();
        return value;
    }
}
