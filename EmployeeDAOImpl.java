package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Entities.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;

	public void save(Employee emp) throws SQLException {
		// con = DatabaseUtil.getConnection();
		// insert into Employee values (?,?,?,?);
		try {
			String query = "insert into Employee values (?,?,?,?);";
			con = DatabaseUtil.getPSConnection();
			ps = con.prepareStatement(query);
			ps.setLong(1, emp.getEmpId());
			ps.setString(2, emp.getFirstName());
			ps.setString(3, emp.getLastName());
			ps.setString(4, emp.getGender());
			ps.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			ps.close();
			con.close();
		}

	}

}
