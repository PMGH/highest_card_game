package com.example.peter.highestcard;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by Peter on 26/10/2017.
 */

public class GameTest {

    Game game;
    Player player1;
    Player player2;
    ArrayList<Player> players;
    Deck deck;

    @Before
    public void before(){
        player1 = new Player("Peter");
        player2 = new Player("James");
        players = new ArrayList<Player>();
        players.add(player1);
        players.add(player2);
        deck = new Deck();
        game = new Game("Highest Card", players, deck);
    }

    @Test
    public void gameHasName(){
        assertEquals("Highest Card", game.getName());
    }

    @Test
    public void gameHasPLayers(){
        assertEquals(players, game.getPlayers());
    }

    @Test
    public void gameHasDeck(){
        assertEquals(deck, game.getDeck());
    }

    @Test
    public void gameStartsWithNoWinner(){
        assertEquals(0, game.getWinner().size());
    }

    @Test
    public void checkWin__false(){
        assertEquals(false, game.checkWin());
    }

    @Test
    public void game__draw(){
        //        Mockito (spyGame)
        assertEquals("Draw!", game.play());
    }

    @Test
    public void game__p1win(){
        //        Mockito (spyGame)
        assertEquals("Peter won", game.play());
    }

    @Test
    public void game__p2win(){
        //        Mockito (spyGame)
        assertEquals("James won", game.play());
    }

}
