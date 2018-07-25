package suite1;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import util.Testutil;

public class ModifyPh extends Common
{
	@DataProvider(name="Data")
	public static Object[][] testParameterData(Method method) throws Exception
	{
		BaseTest.initialize(); 
	    Object data[][]=Testutil.getData(BaseTest.datatable_suite1,"Ph");
	    return data;
	}
	@Test(dataProvider ="Data")
	public void testPh(String username,String password,String ph)throws Exception
	{
		page.fillLogin(username, password);
		page.lnkprofile.click();
		Thread.sleep(2000);
		page.btnchange.click();
		Thread.sleep(2000);
		page.txtph.clear();
		page.txtph.sendKeys(ph);
		page.btnSave.click();
		Thread.sleep(2000);
		page.clickOK();
		page.clickLogout();
		page.clickOK();
		Thread.sleep(2000);
	}

}
