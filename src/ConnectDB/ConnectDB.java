/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ACER
 */
public class ConnectDB {
    public static Connection con = null;
    private static ConnectDB instance = new ConnectDB();
    public static ConnectDB getIntance(){
        return instance;
    }

    public void connect() throws SQLException{
        String url = "jdbc:sqlserver://localhost:1433;databaseName=QLNVIEN";
	String user = "sa";
	String password = "sapassword";
        con = DriverManager.getConnection(url, user, password);
    }
    
    public void disconnect(){
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static Connection getConnection(){
        return con;
    }
}
