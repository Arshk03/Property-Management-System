import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arsh
 */
public class databaseConnection {
    final static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    final static String DB_URL = "jdbc:mysql://localhost:3306/project";
    
    final static String USER = "root";
    final static String PASS = "Qwerty03";
    
    public static Connection connection(){
        try{
            Class.forName(JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            return conn;
        }
    catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        return null;
    }
        
    }
    
}
