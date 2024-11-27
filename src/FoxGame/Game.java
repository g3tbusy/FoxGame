package FoxGame;

import java.util.Scanner;

import static FoxGame.App.clearScreen;
import static FoxGame.Menu.*;

public class Game
{
    private static Scanner input = new Scanner(System.in);
    private static int choice;

    public static void loadGame()
    {
        System.out.println("soon");
    }

    public static void startGame()
    {
        clearScreen();
        System.out.println("""
                Каждое утро Лисёнок просыпался, завтракал и шёл увидеться с Бельчонком. Это утро не было исключением.\s
                Лисёнок пришёл на их обычное место встречи, но Бельчонка там не было. Лисёнок ждал, ждал, но так и не смог дождаться своего друга\s
                Бельчонок не пропустил еще ни одной встречи, вдруг он попал в беду. - подумал Лисёнок.
                Как поступить Лисенку?
            """);

        System.out.print("[1] Вернуться домой\n" +
                "[2] Отправиться на поиски\n" +
                "[3] Выйти в меню\n" +
                "Выбор: ");

        choice = input.nextInt();

        switch (choice)
        {
            case 1 -> WIN_GAME();
            case 2 -> goSearch();
            case 3 -> mainMenu();
            default ->
            {
                System.out.println("{!} Ошибка ввода");

                mainMenu();
            }
        }
    }

    public static void goSearch()
    {
        clearScreen();
        System.out.println("""
                Все лесные жители были заняты своими делами и не обращали внимания на Лисёнка и его проблему. Но вдруг кто нибудь видел Бельчонка... 
                Лисёнок не знал, что ему делать. Помогите ему.
            """);

        System.out.print("[1] Попытаться разузнать о Бельчонке у лесных жителей\n" +
                "[2] Искать Бельчонка в одиночку\n" +
                "[3] Выйти в меню\n" +
                "Выбор: ");

        choice = input.nextInt();

        switch (choice)
        {
            case 1 -> tryToLearn();
            case 2 -> GAME_OVER_1(); // solo search
            case 3 -> mainMenu();
            default ->
            {
                System.out.println("{!} Ошибка ввода");

                mainMenu();
            }
        }
    }

    public static void tryToLearn()
    {
        clearScreen();
        System.out.println("""
                Пока Лисёнок принимал решение, лесные жители разошлись кто куда.Остались только Сова и Волк. 
                Но у Совы бывают проблемы с памятью, а Волк может сильно разозлиться из-за расспросов
            """);

        System.out.print("[1] Расспросить сову\n" +
                "[2] Расспросить волка\n" +
                "[3] Выйти в меню\n" +
                "Выбор: ");

        choice = input.nextInt();

        switch (choice)
        {
            case 1 -> askBowl();
            case 2 -> askWolf();
            case 3 -> mainMenu();
            default ->
            {
                System.out.println("{!} Ошибка ввода");

                mainMenu();
            }
        }
    }

    public static void askBowl()
    {
        clearScreen();
        System.out.println("""
                Сова долго не хотела говорить, но в итоге сказала, что видела испуганного Бельчонка, бежавшего вглубь леса.
                Все лесные жители знают, что в глубине леса опасно, если Бельчонок там, ему срочно нужна помощь.
            """);

        System.out.print("[1] Поверить Сове и отправиться вглубь леса\n" +
                "[2] Сове не стоит верить\n" +
                "[3] Выйти в меню\n" +
                "Выбор: ");

        choice = input.nextInt();

        switch (choice)
        {
            case 1 -> trustTheBowl();
            case 2 -> GAME_OVER_1();
            case 3 -> mainMenu();
            default ->
            {
                System.out.println("{!} Ошибка ввода");

                mainMenu();
            }
        }
    }

    public static void trustTheBowl()
    {
        clearScreen();
        System.out.println("""
                    В глубине леса Лисёнок встретил Медвежонка. Ленивый Медвежонок был готов рассказать все, что знает, 
                    если Лисёнок принесёт ему мёда.
                """);

        System.out.print("[1] Нет, потрачено слишком много времени, нужно идти дальше\n" +
                "[2] Нужно воспользоваться шансом и раздобыть мёд\n" +
                "[3] Выйти в меню\n" +
                "Выбор: ");

        choice = input.nextInt();

        switch (choice)
        {
            case 1 -> GAME_OVER_1();
            case 2 -> findHoney();
            case 3 -> mainMenu();
            default ->
            {
                System.out.println("{!} Ошибка ввода");

                mainMenu();
            }
        }
    }

    public static void findHoney()
    {
        clearScreen();
        System.out.println("""
                    Лисёнок быстро нашёл мёд, но вокруг летал рой злобных пчел.
                    Лисёнок всегда боялся пчёл, но и не найти друга он тоже боялся.
                """);

        System.out.print("[1] Подождать, вдруг пчёлы улетят\n" +
                "[2] Нужно попытаться выкрасть мёд немедленно\n" +
                "[3] Выйти в меню\n" +
                "Выбор: ");

        choice = input.nextInt();

        switch (choice)
        {
            case 1 -> waitForTheBees();
            case 2 -> GAME_OVER_3();
            case 3 -> mainMenu();
            default ->
            {
                System.out.println("{!} Ошибка ввода");

                mainMenu();
            }
        }
    }

    public static void waitForTheBees()
    {
        clearScreen();
        System.out.println("""
                    Лисёнок подождал немного, и пчёлы разлетелись. Лисёнок без проблем набрал мёда.
                    Вдруг он понял, что очень голоден. Что же делать?
                """);

        System.out.print("[1] Поесть немного и передохнуть\n" +
                "[2] Скорее отнести мёд Медвежонку\n" +
                "[3] Выйти в меню\n" +
                "Выбор: ");

        choice = input.nextInt();

        switch (choice)
        {
            case 1 -> GAME_OVER_2();
            case 2 -> takeTheHoney();
            case 3 -> mainMenu();
            default ->
            {
                System.out.println("{!} Ошибка ввода");

                mainMenu();
            }
        }
    }

    public static void takeTheHoney()
    {
        clearScreen();
        System.out.println("""
                    Довольный Медвежонок рассказал Лисёнку, что очень хорошо знает семью Белок и уверен,
                    что Бельчонок никогда не пошёл бы в глубь леса. Он заверял Лисёнка, что Белки не попадают в неприятности,
                    и что Совам нельзя верить, он также уговаривал Лисёнка вернуться домой.
                """);

        System.out.print("[1] Медвежонок ничего не знает, нужно продолжить поиски\n" +
                "[2] Может быть он прав и Лисёнок просто паникует\n" +
                "[3] Выйти в меню\n" +
                "Выбор: ");

        choice = input.nextInt();

        switch (choice)
        {
            case 1 -> GAME_OVER_1();
            case 2 -> WIN_GAME();
            case 3 -> mainMenu();
            default ->
            {
                System.out.println("{!} Ошибка ввода");

                mainMenu();
            }
        }
    }

    public static void askWolf()
    {
        clearScreen();
        System.out.println("""
                Волк оказался вполне дружелюбным, но помочь не смог. Лишь сказал, что маленькому лисенку не стоит бродить по лесу одному.
                И как теперь поступить?
            """);

        System.out.print("[1] Волк прав\n" +
                "[2] Волку не стоит верить\n" +
                "[3] Выйти в меню\n" +
                "Выбор: ");

        choice = input.nextInt();

        switch (choice)
        {
            case 1 -> WIN_GAME();
            case 2 -> GAME_OVER_1();
            case 3 -> mainMenu();
            default ->
            {
                System.out.println("{!} Ошибка ввода");

                mainMenu();
            }
        }
    }

    public static void WIN_GAME()
    {
        clearScreen();
        System.out.println("""
                ВЫ ВЫИГРАЛИ!
                Вернувшись домой, Лисёнок нашёл там Бельчонка. Оказалось, что Бельчонок пришёл на место встречи раньше
                и увидел там рой злобных пчел. Он поспешил предупредить об этом Лисёнка, но они разминулись. Наконец-то друзья нашли друг друга! 
            """); // Вернувшись домой, Лисёнок нашёл там Бельчонка. Оказалось

        System.out.print("[1] Начать новую игру\n" +
                "[2] Выйти из игры\n" +
                "Выбор: ");

        choice = input.nextInt();

        switch (choice)
        {
            case 1 -> startGame();
            case 2 -> System.exit(0);
            default ->
            {
                System.out.println("{!} Ошибка ввода");

                mainMenu();
            }
        }
    }

    public static void GAME_OVER_1()
    {
        clearScreen();
        System.out.println("""
                ВЫ ПРОИГРАЛИ!
                Лисёнок слишком долго плутал по лесу в поисках друга и сам не заметил, как заблудился. Теперь его самого нужно искать...
            """);

        System.out.print("[1] Начать новую игру\n" +
                "[2] Выйти из игры\n" +
                "Выбор: ");

        choice = input.nextInt();

        switch (choice)
        {
            case 1 -> startGame();
            case 2 -> System.exit(0);
            default ->
            {
                System.out.println("{!} Ошибка ввода");

                mainMenu();
            }
        }
    }

    public static void GAME_OVER_2()
    {
        clearScreen();
        System.out.println("""
                ВЫ ПРОИГРАЛИ!
                Пока Лисёнок ел, злобные пчёлы вернулись и покусали его. Лисёнку нужна помощь, он не сможет продолжить поиски.
            """);

        System.out.print("[1] Начать новую игру\n" +
                "[2] Выйти из игры\n" +
                "Выбор: ");

        choice = input.nextInt();

        switch (choice)
        {
            case 1 -> startGame();
            case 2 -> System.exit(0);
            default ->
            {
                System.out.println("{!} Ошибка ввода");

                mainMenu();
            }
        }
    }

    public static void GAME_OVER_3()
    {
        clearScreen();
        System.out.println("""
                ВЫ ПРОИГРАЛИ!
                Это была не лучшая идея, Пчёлы покусали Лисёнка, теперь ему самому нужна помощь..
            """);

        System.out.print("[1] Начать новую игру\n" +
                "[2] Выйти из игры\n" +
                "Выбор: ");

        choice = input.nextInt();

        switch (choice)
        {
            case 1 -> startGame();
            case 2 -> System.exit(0);
            default ->
            {
                System.out.println("{!} Ошибка ввода");

                mainMenu();
            }
        }
    }
}