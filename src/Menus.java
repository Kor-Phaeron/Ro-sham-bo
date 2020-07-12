import java.util.Scanner;

class Menus {
    static Scanner scn1 = new Scanner(System.in);
    static int choice;

    public static void printMainMenu(){
        System.out.println();
        System.out.println("MAIN MENU");
        System.out.println();
        System.out.println("Please select:");
        System.out.println("1 - Start a game");
        System.out.println("2 - Rules");
        System.out.println("3 - Settings");
        System.out.println("4 - Highscores");
        System.out.println("5 - Exit");
        System.out.println();
    }

    public static int getChoice() {
        choice = Integer.parseInt(GettingInput.getInput(scn1, "Your choice: "));
        return choice;
    }

    public static int newGameMenu() {
        System.out.println("Your choice:");
        System.out.println();
        System.out.println("1 - Rock");
        System.out.println("2 - Paper");
        System.out.println("3 - Scissors");
        System.out.println("0 - Main menu");
        System.out.println();
        choice = Integer.parseInt(GettingInput.getInput(scn1, "Your choice is: "));
        return choice;
    }

    public static void gameRules() {
        System.out.println("Rules are simple:");
        System.out.println("Choose between rock, paper or scissors.");
        System.out.println("Keep in mind:");
        System.out.println("- rock crushes scissors;");
        System.out.println("- scissors cuts paper;");
        System.out.println("- paper covers rock.");
        System.out.println("It's that simple!");
        System.out.println("Good luck and have fun! =)");
    }

    public static int settings(){
        System.out.println("Your choice:");
        System.out.println();
        System.out.println("1 - Change player's name.");
        System.out.println("2 - Number of wins to end game.");
        System.out.println("3 - Highscores.");
        System.out.println("0 - Main menu");
        System.out.println();
        choice = Integer.parseInt(GettingInput.getInput(scn1, "Your choice is: "));
        return choice;
    }
}