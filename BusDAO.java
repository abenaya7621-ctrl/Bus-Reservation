package BusResv;
import java.sql.*;
public class BusDAO {
	public void displayBusInfo() throws SQLException {
		String query = "Select * from bus";
		Connection con = DbConnection.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next()) {
			System.out.println("Bus No: " + rs.getInt(1));
			if(rs.getInt(2)==0)
				System.out.println("AC: no ");
			else
				System.out.println("AC: yes ");
			System.out.println("Capacity: " + rs.getInt(3));
		}
		
		System.out.println("------------------------------------------");
		con.close();
	}
	
	public int getCapacity(int busNo) throws SQLException {
		String query = "Select capacity from bus where bus_no=?";
		Connection con = DbConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(1, busNo);
		ResultSet rs = pst.executeQuery();
		rs.next();
		int capacity = rs.getInt(1);
		con.close();
		return capacity;
	}
}
