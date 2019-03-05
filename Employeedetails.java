package Project;
import java.util.Scanner;
public class Employeedetails {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
	/*	System.out.println("Welcome to NIIT Technologies");
		
		
		 
		
		System.out.println("Enter your Choice");
		int choice=s.nextInt();
		int bh=s.nextInt();
		switch(choice)
		{
		case 1:
		{
			System.out.println("Press 1 for User login");
			Registration iObj=new Registration();
			iObj.insertDetails();
			break;
		}
		
	   case 2:
		{
			System.out.println("Press 2 for  Admin login");
			Admin aobj=new Admin();
			switch(bh)
			{
			case 3:
			{
			 System.out.println("press 3 to  add new employee");
			 aobj.insertDetails();
			 break;
			}
			case 4:
			{
				System.out.println("press 4 for delete employee data");
				aobj.modifications();
				break;
			}
			case 5:
			{
				System.out.println("press 5 for update");
				aobj.modifications();
				break;
			}
			
			}
		}
		}*/
	
	/*	Registration iObj=new Registration();
		iObj.insertDetails();
*/
		
	/*	Fetchdata fObj=new Fetchdata();
		fObj.readEmployeeDetails();*/
		
		Admin aObj=new Admin();
		
		aObj.updateDesignation();
		
		
		
		
	}

}
