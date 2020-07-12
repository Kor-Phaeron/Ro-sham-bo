import java.sql.Connection;
import java.sql.Statement;

public class Highscores_Table {

    public static void main(String[] args) {

        Connection connection = null;

        Statement statement = null;

        Highscores_Database obj_HighscoresDatabase = new Highscores_Database();

        connection = obj_HighscoresDatabase.getConnection();

        try {

            String query = "Create table Highscores(pos SERIAL primary key, Name varchar, Games_Played int, Wins int)";
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Finished.");



        } catch (Exception e) {
            System.err.println( e.getClass().getName()+": "+ e.getMessage() );

            System.exit(0);
        }

    }
}
