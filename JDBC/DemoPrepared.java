import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoPrepared {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
        PreparedStatement ps=c.prepareStatement("select * from customer");
        ResultSet rs=ps.executeQuery();
        System.out.println("Prepared Statement ");
        
        while(rs.next())
        {
        	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
        }
        c.close();
	}

}
