package idhamramadito.jwork;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Idham Ramadito
 * @version 27 Juni 2021
 */
public class DatabaseConnectionPostgre {

    public static Connection connection(){
        Connection c = null;
        Statement stat = null;
        String db_name = "jwork";
        String db_user = "postgres";
        String db_password = "postgres";
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+db_name, db_user, db_password);

        } catch (Exception e){
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        return c;
    }
}
