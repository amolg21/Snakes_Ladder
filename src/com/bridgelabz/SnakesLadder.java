package com.bridgelabz;

public class SnakesLadder {

    public static void main(String[] args) {
	// Game of snakes and ladder.
        System.out.println("Game started with single player from inital position 0");

        int Score = 0;                       // Position on board.
        int Die_Count = 0;                   // No of times die rolled.
        int Winning_Position = 100;
        int Pre_Score = 0;
        while (Score < Winning_Position) {
            Die_Count++;

            int die_value = (int) Math.floor(Math.random() * 10) % 7;          // Value on die when rolled.
           // System.out.println("Value of die is " + die_value);

            // Play_Check = Checking whether player will stop, will move forward or move behind.
            int Play_Check = (int) Math.floor(Math.random() * 10) % 3;
            if (Play_Check == 0) {
           //     System.out.println("The player will not move and remains at same position");

            } else if (Play_Check == 1) {
          //        System.out.println("The player will move ahead by " + die_value);
                Pre_Score = Score;
                Score = Score + die_value;
              if (Score > Winning_Position) {
                  Score = Pre_Score;               // It will stay on the same position.
              }
            } else {
           //     System.out.println("The player will move behind by " + die_value);
                Score = Score - die_value;
                if (Score < 0) {
                Score=0;                          // It will stay on the same position.
                }
            }
            System.out.println("The position after each die value is " + Score);
        }
          System.out.println("The number of times the dice was played is " + Die_Count );
          System.out.println("The final position is " + Score);
        }
}
