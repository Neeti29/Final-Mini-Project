package Project;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;


public class Admin 
{
	Statement stmt;
	PreparedStatement pstm;
	Connection con=	Createconnection.createConnection();
	Scanner s=new Scanner(System.in);
	
	void modifications() throws Exception
	{
		stmt = con.createStatement();
		con.setAutoCommit(false);
		
		try
		{
			
			int i2= stmt.executeUpdate("Update Department set Dept_Name= 'Development' where D_Id=14");
			
			int i3= stmt.executeUpdate("Delete from Project where D_Id = 12");
			
			con.commit();
			
			System.out.println(" Success !!");
			
		}
		catch(Exception e)
		{
			
			try
			{
				con.rollback();
				System.out.println(" Failed,please try again !");
			}
			
			catch(Exception ex)
			{
				System.out.println(ex);
			}
		}
		
		stmt.close();
		con.close();
		System.out.println("Connection is closed");
		
	}
	
	void updateDesignation()
	{
		
		
		System.out.println("Enter employee id");
		String empId=s.nextLine();
		int sal;
		
		int salary="Select Salary from employee where E_Id="+empId;
		rs.get
		System.out.println("Enter new Employee Designation");
		String desg=s.nextLine();
		
		
			sal=salary+(salary*20)/100;
			String sqlUpdate="UPDATE employee " + "SET Salary =sal and Designation=desg" + "WHERE E_Id = empId";  
	}
}

