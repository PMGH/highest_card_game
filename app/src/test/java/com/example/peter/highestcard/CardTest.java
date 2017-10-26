package com.example.peter.highestcard;

import org.junit.Before;
import org.junit.Test;

import static com.example.peter.highestcard.CardSuit.SPADES;
import static com.example.peter.highestcard.CardValue.ACE;
import static org.junit.Assert.assertEquals;

/**
 * Created by Peter on 26/10/2017.
 */

public class CardTest {
    Card card;

    @Before
    public void before(){
        card = new Card(CardSuit.SPADES, CardValue.ACE);
    }

    @Test
    public void cardHasSuit() {
        assertEquals(CardSuit.SPADES, card.getSuit());
    }

    @Test
    public void cardHasValue() {
        assertEquals(CardValue.ACE, card.getValue());
    }

    @Test
    public void cardValueHasRank(){
        assertEquals(13, card.getCardValue());
    }

}
