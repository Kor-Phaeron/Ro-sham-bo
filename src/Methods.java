import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class Methods {
    static int winsCount = 1;
    static int winsPlayer = 0;
    static int winsComputer = 0;
    static int winsCountReset = 1;
    static String userName;

    public static void score(){
        System.out.println();
        System.out.println("Game score:");
        System.out.println(Methods.userName + ": " + State.ANSI_GREEN + winsPlayer + State.ANSI_RESET + ".");
        System.out.println("Computer: " + State.ANSI_RED + winsComputer + State.ANSI_RESET + ".");
        System.out.println();
    }

    public static void colorGreen(String text) {
        System.out.print(State.ANSI_GREEN + text + State.ANSI_RESET);
    }

    public static void colorRed(String text) {
        System.out.print(State.ANSI_RED + text + State.ANSI_RESET);
    }

    public static void colorBlue(String text) {
        System.out.print(State.ANSI_BLUE + text + State.ANSI_RESET);
    }

    public static String changeName(){
        String newName = Menus.scn1.nextLine();
        return newName;
    }
    public static int changeTotalWins(){
        winsCount = Integer.parseInt(GettingInput.getInput(Menus.scn1, "Enter value of total wins to end game: "));
        winsCountReset = winsCount;
        return winsCount;
    }

    public static String userName(){
        Scanner scn = new Scanner((System.in));
        System.out.println("What's your name, buddy?");
        userName = scn.nextLine();
        System.out.println();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }

    public static void newPlayer(String name){
        Connection connection = null;

        Statement statement = null;

        Highscores_Database obj_HighscoresDatabase = new Highscores_Database();

        connection = obj_HighscoresDatabase.getConnection();
        String userName = "Test";
//        System.out.println("fasdnvasdkv" + "fasndjvnjskd");

        try {

            String query = "Insert into Highscores (name) values ('zhopa"+name+"zhopa')";
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Values inserted successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
