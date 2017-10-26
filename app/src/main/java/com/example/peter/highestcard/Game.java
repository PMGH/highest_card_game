package com.example.peter.highestcard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by Peter on 26/10/2017.
 */

public class Game {

    private String name;
    private ArrayList<Player> players;
    private Deck deck;
    private ArrayList<Player> winner;
    private int winnerValue;

    public Game(String name, ArrayList<Player> players, Deck deck) {
        this.name = name;
        this.players = players;
        this.deck = deck;
        this.winner = new ArrayList<Player>();
        this.winnerValue = 0;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public Deck getDeck() {
        return deck;
    }

    public ArrayList<Player> getWinner() {
        return this.winner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public void setWinner(ArrayList<Player> winner) {
        this.winner = winner;
    }

    //    deal (remove from deck, give to player)
    public Deck deal(){
        //    shuffle deck
        deck.shuffle();

        for (Player player : this.players){
            Card card = deck.dealTopCard();
            player.setCard(card);
        }

        return deck;
    }

    //    compare player's cards and declare winner or draw
    public ArrayList<Player> evaluateWinner(){
        int counter = 0;
        for (Player player : players) {
            if (player.getCardValue() > this.winnerValue) {
                this.winner.add(player);
            }
            else {
                setWinner(null);
            }
        }
        return winner;
    }

    //    check win
    public Boolean checkWin(){
        if (winner.size() > 0){
            return true;
        }
        else {
            return false;
        }
    }

    //    declare winner
    public String declareWinner(){
        if (checkWin()){
            return winner.get(0).getName() + "won";
        }
        else {
            return "Draw!";
        }
    }

    public String play(){
        deal();
        return declareWinner();
    }

}
