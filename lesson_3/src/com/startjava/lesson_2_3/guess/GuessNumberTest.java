package com.startjava.lesson_1.guess;
import java.util.Scanner;

public class GuessNumberTest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player1 = new Player();
        Player player2 = new Player();
        GuessNumber game = new GuessNumber();
        
        System.out.println("Приветствую вас в игре угадай число!\n");
        System.out.println("Введите имена игроков:\n");

        System.out.print("Введите имя первого игрока: ");
        player1.setName(scanner.nextLine());

        System.out.print("Введите имя второго игрока: ");
        player2.setName(scanner.nextLine());

        while (true) {
            game.startGame(player1 , player2);
            Scanner endOfGameIn = new Scanner(System.in);
            System.out.print("Спасибо за игру хотите сыграть еще раз? [y/n]: ");
            char endOfGame = endOfGameIn.next().charAt(0);
            if (endOfGame == 'n') {
                System.out.println("Спасибо за игру!");
                break;
            }
            continue;
        }
    }
}