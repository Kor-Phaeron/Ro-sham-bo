import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Highscores_Values {

    public static void main(String[] args) {

        Highscores_Database obj_HighscoresDatabase = new Highscores_Database();

        Connection connection = obj_HighscoresDatabase.getConnection();

        try {
            String query = "Insert into Highscores (name, score) values ('"+Methods.userName+"',)";
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
