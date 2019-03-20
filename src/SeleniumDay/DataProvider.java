package SeleniumDay;

import org.testng.annotations.Test;

public class DataProvider {
	
	@Test(dataProvider="getData")
	public void Test2(String name,String surname,String add, int mobileNo){
		System.out.println(name+' '+surname+' '+add+' '+mobileNo);
	}
		
	
	@org.testng.annotations.DataProvider
	public Object[][] getData()
	{
		Object data[][]= new Object[3][4];
		
		//Row1
		data[0][0]="User1";
		data[0][1]="pass1";
		data[0][2]="add1";
		data[0][3]=12345;
		
		//Row 2

		data[1][0]="User2";
		data[1][1]="pass2";
		data[1][2]="add2";
		data[1][3]=890769;
		
		//Row 3

		data[2][0]="User3";
		data[2][1]="pass3";
		data[2][2]="add3";
		data[2][3]=786534;
		
		return data;
				
		
	}
	

}
