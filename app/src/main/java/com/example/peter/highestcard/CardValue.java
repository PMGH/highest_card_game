package com.example.peter.highestcard;

/**
 * Created by Peter on 26/10/2017.
 */

public enum CardValue {

    ACE(13),
    KING(12),
    QUEEN(11),
    JACK(10),
    TEN(9),
    NINE(8),
    EIGHT(7),
    SEVEN(6),
    SIX(5),
    FIVE(4),
    FOUR(3),
    THREE(2),
    TWO(1);

    private int value;

    CardValue(int value) {
        this.value = value;
    }

    public int getRank() {
        return this.value;
    }


}
