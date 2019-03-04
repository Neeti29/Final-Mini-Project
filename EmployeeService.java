package Service;

import java.sql.SQLException;

import Entities.Employee;

public interface EmployeeService {
	
	public void save(Employee emp) throws SQLException;

}
