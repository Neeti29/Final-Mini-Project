package Database;

import java.sql.SQLException;

import Entities.Employee;

public interface EmployeeDAO {
	public void save(Employee emp) throws SQLException;

}
