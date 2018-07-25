package suite1;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import util.Testutil;

public class PaymentDemo extends Common
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
		page.fillLogin(username,password);
		page.lnkPayment.click();
		Thread.sleep(2000);
		page.clickLogout();
		page.clickOK();
		Thread.sleep(2000);
	}

}
