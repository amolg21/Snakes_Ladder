package com.bridgelabz;

public class SnakesLadder {

    public static void main(String[] args) {
	// Game of snakes and ladder.
        System.out.println("Game started with single player from inital point 0");

        //  Die is rolled to get a random value.
        int die_value = (int)Math.floor(Math.random() * 10) % 7;
        System.out.println("Value of die is " + die_value);
    }
}
