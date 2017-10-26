package com.example.peter.highestcard;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Peter on 26/10/2017.
 */

public class PlayerTest {

    Player player;

    @Before
    public void before(){
        player = new Player("Peter");
    }

    @Test
    public void playerHasName(){
        assertEquals("Peter", player.getName());
    }

    @Test
    public void playerStartsWithNoCard(){
        assertEquals(null, player.getCard());
    }

    @Test
    public void canSetPlayerCard(){
        Card card = new Card(CardSuit.SPADES, CardValue.ACE);
        player.setCard(card);
        assertEquals(card, player.getCard());
    }
}
