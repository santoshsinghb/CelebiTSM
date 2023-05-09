package Helpers;

import static Helpers.Constants.*;

import Helper.BaseVariables;
import Methods.ReadExcelMethods;
import static Helpers.BaseVariables.*;
import static Helpers.BaseObject.*;
import static Helper.BaseObjects.E2E;
import static Helper.Constants.LoginDetailsSheetName;
public class TestDataReader 
{
	private static final ReadExcelMethods ReadExcelUtils = null;
	private static final String UATLink = null;

	public TestDataReader() throws Exception
	{
		read = new ReadExcelMethods(TestDataFile);
	}
	
	public static void ReadLoginDetails(String user) throws Exception
	{
		int noOfRow = read.GetNoOfRow(LoginSheet);
		for (int i = 0; i < noOfRow; i++) {
			if (read.GetCellDataX(LoginSheet, "User", i).contains(user))
			{
				System.out.println("rows= "+noOfRow);
				Username = read.GetCellDataX(LoginSheet, "Username", i);
				Password = read.GetCellDataX(LoginSheet, "Password", i);
				break;
			}
			else
			{
				Username = null; 
				Password = null;
				System.out.println("User login details not found!!");
			}
		}		
	}
	
	public void ReadCustomerDetails(String customer) throws Exception
	{
		int noOfRow = read.GetNoOfRow(CustomerSheet);
		for (int i = 0; i < noOfRow; i++) {
			if (read.GetCellDataX(CustomerSheet, "Customer", i).contains(customer))
			{
				System.out.println("rows= "+noOfRow);
				CustomerName= read.GetCellDataX(CustomerSheet, "Customername", i);
				break;
			}
			else
			{
				CustomerName = null; 
				System.out.println("Customer details not found!!");
			}
		}	
	}

	public static void ReadLoginDetails() throws Throwable
	{
		BaseVariables.Username = ReadExcelUtils.GetCellDataX(LoginSheet, "Username", 1);
		BaseVariables.Password = ReadExcelUtils.GetCellDataX(LoginSheet, "Password", 1);
	}

		
	}
	
	
	
	
	
	
	
	
		

