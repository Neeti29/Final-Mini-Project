package Service;

import java.sql.SQLException;

import Database.EmployeeDAO;
import Database.EmployeeDAOImpl;
import Entities.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private static EmployeeDAO employeeDAO =  new EmployeeDAOImpl();
	
	public void save(Employee emp) throws SQLException {
		employeeDAO.save(emp);
	}

}
