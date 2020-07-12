import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        Methods.userName();
        Methods.newPlayer(Methods.userName);

        int choiceMainMenu;
        int computerOpponentChoice;
        int round = 1;

        do {
            Menus.printMainMenu();
            choiceMainMenu = Menus.getChoice();
            MainMenu:
            switch (choiceMainMenu) {
                case (State.GAME):
                    while (Methods.winsPlayer < Methods.winsCount && Methods.winsComputer < Methods.winsCount) {
                        System.out.println("Round: " + round++);
                        System.out.println("Playing till: " + Methods.winsCount + " win(s).");
                        int choiceNewGameMenu = Menus.newGameMenu();
                        GameMenu:
                        switch (choiceNewGameMenu) {
                            case (State.ROCK):
                                System.out.println("Your choice is: Rock");
                                computerOpponentChoice = ComputerOpponent.compChoice();
                                if (computerOpponentChoice == State.ROCK) {
                                    System.out.println("Computer's choice is: Rock");
                                    Methods.colorBlue("Draw.");
                                    System.out.println();
                                    Methods.score();
                                } else if (computerOpponentChoice == State.PAPER) {
                                    System.out.println("Computer's choice is: Paper");
                                    Methods.colorRed("You lose.");
                                    System.out.println();
                                    Methods.winsComputer++;
                                    Methods.score();
                                } else if (computerOpponentChoice == State.SCISSORS) {
                                    System.out.println("Computer's choice is: Scissors");
                                    Methods.colorGreen("You win!");
                                    System.out.println();
                                    Methods.winsPlayer++;
                                    Methods.score();
                                }
                                break;
                            case (State.PAPER):
                                System.out.println("Your choice is: Paper");
                                computerOpponentChoice = ComputerOpponent.compChoice();
                                if (computerOpponentChoice == State.ROCK) {
                                    System.out.println("Computer's choice is: Rock");
                                    Methods.colorGreen("You win!");
                                    System.out.println();
                                    Methods.winsPlayer++;
                                    Methods.score();
                                } else if (computerOpponentChoice == State.PAPER) {
                                    System.out.println("Computer's choice is: Paper");
                                    Methods.colorBlue("Draw.");
                                    System.out.println();
                                    Methods.score();
                                } else if (computerOpponentChoice == State.SCISSORS) {
                                    System.out.println("Computer's choice is: Scissors");
                                    Methods.colorRed("You lose.");
                                    System.out.println();
                                    Methods.winsComputer++;
                                    Methods.score();
                                }
                                break;
                            case (State.SCISSORS):
                                System.out.println("Your choice is: Scissors");
                                computerOpponentChoice = ComputerOpponent.compChoice();
                                if (computerOpponentChoice == State.ROCK) {
                                    System.out.println("Computer's choice is: Rock");
                                    Methods.colorRed("You lose.");
                                    System.out.println();
                                    Methods.winsComputer++;
                                    Methods.score();
                                } else if (computerOpponentChoice == State.PAPER) {
                                    System.out.println("Computer's choice is: Paper");
                                    Methods.colorGreen("You win!");
                                    System.out.println();
                                    Methods.winsPlayer++;
                                    Methods.score();
                                } else if (computerOpponentChoice == State.SCISSORS) {
                                    System.out.println("Computer's choice is: Scissors");
                                    Methods.colorBlue("Draw.");
                                    System.out.println();
                                    Methods.score();
                                }
                                break;
                            case (State.GAME_EXIT):
                                Methods.winsCount = Methods.winsCountReset;
                                round = 1;
                                break MainMenu;
                            default:
                                System.out.println("Please, choose between 1 to 3 or 0");
                                System.out.println();
                                round--;
                        }
                    }
                    if (Methods.winsPlayer == Methods.winsCount) {
                        Methods.colorGreen(Methods.userName +", you totally rocks!");
                        System.out.println();
                    } else if (Methods.winsComputer == Methods.winsCount) {
                        Methods.colorRed(Methods.userName + " you're such a, looser...");
                        System.out.println();
                    }
                    //Highscores_Values.insertName();
                    Methods.winsCount = Methods.winsCountReset;
                    Methods.winsPlayer = 0;
                    Methods.winsComputer = 0;
                    Menus.choice = 0;
                    round = 1;
                    break;

                case (State.RULES):
                    Menus.gameRules();
                    Menus.choice = 0;
                    break;

                case (State.SETTINGS):
                    while (Menus.choice != 0) {
                        int choiceSettings = Menus.settings();
                        switch (choiceSettings) {
                            case (State.CHANGE_NAME):
                                System.out.println("Enter new player's name:");
                                Methods.userName = Methods.changeName();
                                System.out.println("Hello, " + Methods.userName + "!");
                                break MainMenu;
                            case (State.CHANGE_TOTAL_WINS):
                                Methods.changeTotalWins();
                                break MainMenu;
                            case (State.SETTINGS_EXIT):
                                break MainMenu;
                            default:
                                System.out.println("Please, choose between 1, 2 or 0");
                                System.out.println();
                        }
                    }
                    Menus.choice = 0;
                    break;
                case (State.HIGHSCORES):
                    System.out.println("Highscores are under construction.");
                    Menus.choice = 0;
                    break;
                case (State.EXIT):
                    break;
                default:
                    System.out.println("Please choose between 1 and 4.");
                    break;
            }
        } while (choiceMainMenu != State.EXIT);
    }
}