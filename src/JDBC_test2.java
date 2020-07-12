import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC_test2 {
    public static void main(String args[]) {
        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres",
                            "postgres", "admin");
            if (c != null) {
                System.out.println("Connection established!");
            }
            else System.out.println("Connection failed!");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");
    }
}