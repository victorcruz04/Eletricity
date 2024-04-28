
package eletricity;


import java.sql.*;

public class Conn {

    Connection c;
    Statement s;
    Conn() {
        try {
            c = DriverManager.getConnection("jdbc:mysql:///ebs", "root", "code for interview");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
