import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Highscores_Read_Values {
    public static void main(String[] args) {
        Connection connection = null;

        Statement statement = null;

        ResultSet rs = null;

        Highscores_Database obj_HighscoresDatabase = new Highscores_Database();

        connection = obj_HighscoresDatabase.getConnection();

        try {
            String query = "select * from Highscores";
            statement = connection.createStatement();
            rs = statement.executeQuery(query);

            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
