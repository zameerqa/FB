package suite1;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import util.Testutil;

public class Login extends Common
{
	@DataProvider(name="Data")
	public static Object[][] testParameterData(Method method) throws Exception
	{
		BaseTest.initialize(); 
	    Object data[][]=Testutil.getData(BaseTest.datatable_suite1,"Login");
	    return data;
	}
	@Test(dataProvider ="Data")
	public void testLogin(String username,String password)throws Exception
	{
		page.fillLogin(username, password);
		Thread.sleep(1000);
		page.clickLogout();
		page.clickOK();
		Thread.sleep(3000);
	}
	@Test
	public void testMeth1()
	{
		System.out.println("Hiiiiiiiiii");
	}

}
