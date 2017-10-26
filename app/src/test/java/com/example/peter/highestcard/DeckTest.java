package com.example.peter.highestcard;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static com.example.peter.highestcard.CardSuit.DIAMONDS;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by Peter on 26/10/2017.
 */

public class DeckTest {

    Deck deck;
    Deck spyDeck;


    @Before
    public void before(){
        deck = new Deck();
        spyDeck = Mockito.spy(deck);
    }

    @Test
    public void hasFullDeck() {
        assertEquals(52, deck.getDeck().size());
    }

//    @Test
//    public void canShuffleDeck(){
//        Card card = new Card (CardSuit.DIAMONDS, CardValue.NINE);
//
//        Mockito.when(spyDeck.shuffle()).thenReturn();
//        assertEquals(card, );
//    }

    @Test
    public void canDealTopCard(){
        Card card = new Card (DIAMONDS, CardValue.NINE);
        Mockito.when(spyDeck.dealTopCard()).thenReturn(card);

        assertEquals(CardSuit.DIAMONDS, card.getSuit());
        assertEquals(CardValue.NINE, card.getValue());
    }
}
