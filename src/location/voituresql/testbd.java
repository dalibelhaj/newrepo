package location.voituresql;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
/**
 * This program demonstrates how to establish database connection to Microsoft
 * SQL Server.
 * @author www.codejava.net
 *
 */
public class testbd {
	
	 public static void main(String[] args) throws Exception {
		   Connection conn=null;
		    try {
		    Class.forName("com.mysql.jdbc.Driver");	
		    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/location","root","");
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT marque FROM voiture");
            
            while (rs.next()) {
		    System.out.println(rs.getString("marque"));  
            }
            
		    } catch (SQLException e) {
		        throw new Error("Problem", e);
		    } finally {
		      try {
		        if (conn != null) {
		            conn.close();
		        }
		      } catch (SQLException ex) {
		          System.out.println(ex.getMessage());
		      }
		    }
		  }

	 public static Connection conexion() { 
		// TODO Auto-generated method stub
		 try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/location","root","");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
		}

	