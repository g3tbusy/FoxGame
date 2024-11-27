package FoxGame;

import static FoxGame.Menu.*;
import static FoxGame.Paragraphs.*;

public class App
{
    public static void main(String[] args)
    {
        // paragraphAdder();
        mainMenu();
    }

    public static void clearScreen()
    {
        System.out.print("\n".repeat(15));
    }
}
