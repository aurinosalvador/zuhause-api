package zuhause.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Eduardo Folly
 */
public class DbUtil {

    public static Connection getConnection(DbConfig config) throws ClassNotFoundException, SQLException {
        Class.forName(config.getDriver());

        return DriverManager.getConnection(config.getUrl(),
                config.getUser(), config.getPassword());
    }
}
