import java.sql.Connection;
import java.sql.Statement;

public class Highscores_Delete_Values {
    public static void main(String[] args) {
        Connection connection = null;

        Statement statement = null;

        Highscores_Database obj_HighscoresDatabase = new Highscores_Database();

        connection = obj_HighscoresDatabase.getConnection();

        try {
            String query = "delete from Highscores";
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Values deleted");
//            String query = "drop table Highscores";
//            statement = connection.createStatement();
//            statement.executeUpdate(query);
//            System.out.println("Table deleted.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
