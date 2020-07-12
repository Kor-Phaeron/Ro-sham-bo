import java.sql.Connection;
import java.sql.DriverManager;

public class Highscores_Database {

    static final String host = "192.168.1.17";
    static final String port = "5432";
    static final String db_name = "ro_sham_bo";
    static final String user = "pi";
    static final String pwd = "admin";

    public static void main(String[] args) {
        Highscores_Database obj_HighscoresDatabase = new Highscores_Database();
        System.out.println(obj_HighscoresDatabase.getConnection());
    }

    public Connection getConnection() {

        Connection connection = null;

        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager
                    .getConnection("jdbc:postgresql://"+ host + ":" + port + "/" + db_name,
                            user, pwd);
//            if (connection != null) {
//                System.out.println("Connection established!");
//            }
//            else System.out.println("Connection failed!");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        return connection;
    }
}
