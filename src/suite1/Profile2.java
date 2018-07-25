package suite1;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import util.Testutil;

public class Profile2 extends Common
{
	@DataProvider(name="Data")
	public static Object[][] testParameterData(Method method) throws Exception
	{
		BaseTest.initialize(); 
	    Object data[][]=Testutil.getData(BaseTest.datatable_suite1,"Login");
	    return data;
	}
	@Test(dataProvider ="Data")
	public void testProfile(String username,String password)throws Exception
	{
		page.fillLogin(username,password);
		page.btnPersonal.click();
		page.lnkProfile2.click();
		Thread.sleep(4000);
	}
}
