/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author pint
 */
public class DbConnectivity
{
    public static Connection con;
    public static Connection getConnect()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql:///library_management","root","root");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return con;
    }
}
