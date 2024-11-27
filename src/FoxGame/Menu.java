package FoxGame;

import java.util.Scanner;

import static FoxGame.Game.*;

public class Menu
{
    public static void mainMenu()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("\n> > > Главное меню < < <\n" +
                "[1] Начать игру\n" +
                "[2] Загрузить игру\n" +
                "[3] Главное меню\n" +
                "-----------------------\n" +
                "[0] Выйти из игры\n" +
                "Выбор: ");

        int choice = input.nextInt();

        switch(choice)
        {
            case 1 -> startGame();
            case 2 -> loadGame();
            case 3 -> mainMenu();
            case 0 -> System.exit(0);
            default ->
            {
                System.out.println("{!} Ошибка ввода");

                mainMenu();
            }
        }
    }
}