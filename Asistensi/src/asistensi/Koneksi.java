
package asistensi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Koneksi {
    private static Connection con;
     public static Connection DBConnection() {
        String dbUrl = "jdbc:mysql://localhost:3306/asistensi";
        String user = "root";
        String password = "";
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            con = DriverManager.getConnection(dbUrl, user, password);
            System.out.println("Berhasil tersambung ke database");
        } catch (SQLException e) {
            System.out.println("Koneksi gagal!");
            e.printStackTrace();
        }
        return con;
    }

    public static void closeConnection() {
        if (con != null) {
            try {
                con.close();
                System.out.println("Connection closed.");
            } catch (SQLException e) {
                System.out.println("Failed to close connection.");
                e.printStackTrace();
            }
        }
    }
}
