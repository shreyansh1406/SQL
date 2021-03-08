import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DemoCallable {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
		CallableStatement cs=c.prepareCall("{call getall}");
		 ResultSet rs=cs.executeQuery();
	        
	        while(rs.next())
	        {
	        	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
	        }
	        c.close();
		}
		
	}


