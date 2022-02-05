package com.javaproject.dayFour;

import java.util.Random;

public class SnakeAndLadder {
    static int count = 1;
    static int player1Position = 0;
    static int player2Position = 0;
    static int player1CurrentPosition = 0;
    static int player2CurrentPosition = 0;
    static int winningPosition = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Program");

        while(player1CurrentPosition <= winningPosition && player2CurrentPosition <= winningPosition){
            if (count % 2 != 0){
                System.out.println("Player 1 is playing");
                player1Position = p1Position();
                player1CurrentPosition = player1Position;
            }
            else{
                System.out.println("Player 2 is Playing");
                player2Position = p2Position();
                player2CurrentPosition = player2Position;
            }
            if (player1Position <= winningPosition || player2Position <= winningPosition)
                count++;
            if (player1Position == winningPosition || player2Position == winningPosition)
                break;
            System.out.println("Player1 Current Position is " +player1CurrentPosition);
            System.out.println("Player2 Current Position is " +player2CurrentPosition);
        }
        System.out.println("Player 1 Position " +player1Position);
        System.out.println("Player 2 Position " +player2Position);

        if (player1Position > player2Position){
            System.out.println("Player 1 is Winner");
        }
        else{
            System.out.println("Player 2 is Winner");
        }
        System.out.println("The no of dice rolled is "+count);
    }

    public static int rollDice(){
        Random r1 = new Random();
        int a = r1.nextInt(6)+1;
        return (a);
    }

    public static int p1Position() {
      int dice = rollDice();
      System.out.println("The Dice value is "+dice);

      if (dice == 6){
          int a = rollDice();
          System.out.println("The Dice value is "+a);
          dice = dice + a;
      }


        Random r2 = new Random();
        int option1 = r2.nextInt(3);

        switch (option1){
            case 0:
                player1Position = player1CurrentPosition;
                System.out.println("The Player is not Playing");

            case 1:
                player1Position = player1CurrentPosition + dice;
                System.out.println("The player has got a ladder and player will roll the dice again");

                int x = rollDice();
                int p1AddPosition = player1CurrentPosition + x;
                player1CurrentPosition = p1AddPosition;

                if (player1Position > winningPosition) {
                    player1Position = player1CurrentPosition;
                }
                break;

            case 2:
                player1Position = player1CurrentPosition - dice;
                if (player1Position < 0){
                    player1Position = 0;
                }
                System.out.println("The player has got a Snake and moved backwards");
                break;
        }
        player1CurrentPosition = player1Position;
        return (player1CurrentPosition);
    }

    public static int p2Position() {
        int dice = rollDice();
        System.out.println("The Dice value is "+dice);

        if (dice == 6 ){
            int b = rollDice();
            System.out.println("The Dice value is "+b);
            dice = dice + b;
        }

        Random r3 = new Random();
        int option2 = r3.nextInt(3);

        switch (option2){
            case 0:
                player2Position = player2CurrentPosition;
                System.out.println("The Player is not Playing");

            case 1:
                player2Position = player2CurrentPosition + dice;
                System.out.println("The player has got a ladder and player will roll the dice again");

                int y = rollDice();
                int p2AddPosition = player2CurrentPosition + y;
                player1CurrentPosition = p2AddPosition;

                if (player2Position > winningPosition) {
                    player2Position = player2CurrentPosition;
                }
                break;

            case 2:
                player1Position = player2CurrentPosition - dice;
                if (player2Position < 0){
                    player2Position = 0;
                }
                System.out.println("The player has got a Snake and moved backwards");
                break;
        }
        player2CurrentPosition = player2Position;
        return (player2CurrentPosition);
    }
}