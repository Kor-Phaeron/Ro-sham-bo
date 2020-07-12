import java.sql.Connection;
import java.sql.Statement;

public class Highscores_Edit_Values {

    public static void main(String[] args) {
        Connection connection = null;

        Statement statement = null;

        Highscores_Database obj_HighscoresDatabase = new Highscores_Database();

        connection = obj_HighscoresDatabase.getConnection();

        try {
            String query = "update Highscores set name = 'Hanna' where Score='1'";
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Values updated");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
