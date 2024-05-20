package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dbConnector {
    
    private Connection connect;
    
    public dbConnector() {
        try {
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/school_management", "root", "");
        } catch(SQLException ex) {
            System.err.println("Can't connect to database: " + ex.getMessage());
        }
    }
     
         public ResultSet getData(String sql) throws SQLException{
            Statement stmt = connect.createStatement();
            ResultSet rst = stmt.executeQuery(sql);
            return rst;
        }
    
    public boolean insertData(String sql) {
        try (PreparedStatement pst = connect.prepareStatement(sql)) {
            pst.executeUpdate();
            System.out.println("Inserted Successfully!");
            return true;
        } catch(SQLException ex) {
            System.err.println("Connection Error: " + ex.getMessage());
            return false;
        }
    }

    public void updateData(String sql) {
        try (PreparedStatement pst = connect.prepareStatement(sql)) {
            pst.executeUpdate();
            System.out.println("Updated Successfully!");
        } catch(SQLException ex) {
            System.err.println("Update Error: " + ex.getMessage());
        }
    }
       
    public Connection getConnection() {
        return connect;
    }
}
