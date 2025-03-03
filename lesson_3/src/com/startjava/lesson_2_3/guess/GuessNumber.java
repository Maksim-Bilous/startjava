package com.startjava.lesson_1.guess;
import java.util.Scanner;

public class GuessNumber{
    private int computerNum;
    

    // getters

    public int getComputerNum() {
        return computerNum;
    }

    // guess process

    public void startGame(Player player1 , Player player2) {
        Scanner playerNumIn = new Scanner(System.in);

        String currentPlayer = player1.getName();

        computerNum = (int)(Math.random() * 100) + 1;

        while(true) {
            System.out.print(currentPlayer + " Введите число: ");
            int playerNum = playerNumIn.nextInt();
            if (playerNum > computerNum) {
                System.out.println("\n" + currentPlayer + ", Ваше число больше того что загадал компьютер\n");
                currentPlayer = (currentPlayer.equals(player1.getName())) ? player2.getName() : player1.getName();
            } else if (playerNum < computerNum) {
                System.out.println("\n" + currentPlayer + ", ваше число меньше того что загадал компьютер\n");
                currentPlayer = (currentPlayer.equals(player1.getName())) ? player2.getName() : player1.getName();
            } else if (playerNum == computerNum) {
                System.out.println("\n" + currentPlayer + ", Вы угадали!");
                break;
            }
        }
    }
}