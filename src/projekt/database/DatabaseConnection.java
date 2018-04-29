package projekt.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	/**
	 * Klasse um die Verbindung zur SQL-Datenbank zu erstellen
	 * 
	 * @author DBAE Wintersemester 17/18
	 */

	// Zugangsdaten zur Datenbank
	protected static Connection con;
	private static final String DB_SERVER = "207.154.234.136:5432";
	private static final String DB_NAME = "1718-426965720d0a";
	private static final String DB_USER = "1718-426965720d0a";
	private static final String DB_PASSWORD = "b0d0cadbccd02e2ca1a0faa004f88bd9";
	private static final String DB_DRIVER = "org.postgresql.Driver";
	private static final String DB_URL = "jdbc:postgresql://" + DB_SERVER + "/" + DB_NAME;

	/**
	 * Initialisiere eine Verbindung zur Datenbank
	 * 
	 * @throws SQLException
	 */
	private static Connection init() throws SQLException {
		try {
			Class.forName(DB_DRIVER);
			con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			return con;

		} catch (ClassNotFoundException cfe) {
			System.out.println("PostgresDb: Treiber konnte nicht gefunden werden. \n"
					+ "Fügen sie die postgresql.jar in WEB-INF/lib ein!");
			cfe.printStackTrace();
		}
		return null;
	}

	/**
	 * Rufe eine Verbindung auf, wenn eine bereits existiert. Wenn nicht, rufe
	 * init() auf
	 * 
	 * @throws SQLException
	 */
	public static Connection getConnection() throws SQLException {
		try {
			return (con == null || con.isClosed()) ? init() : con;
		} catch (SQLException e) {
			e.printStackTrace();
			return init();
		}
	}

	/** Schließe die Verbindung */
	public static void closeConnection() {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
