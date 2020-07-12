import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Highscores_Values {

    public static void main(String[] args) {

        Connection connection = null;

        Statement statement = null;

        Highscores_Database obj_HighscoresDatabase = new Highscores_Database();

        connection = obj_HighscoresDatabase.getConnection();

        try {

            String query = "Insert into Highscores (name, score) values ('"+Methods.userName+"',)";
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Values inserted successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
