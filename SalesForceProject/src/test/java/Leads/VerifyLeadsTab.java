package Leads;

import org.testng.annotations.Test;

public class VerifyLeadsTab extends LeadsTab20To24 {
	
	@Test
	public  void verifyloginandleadstab() throws InterruptedException
	{
		loginandleadstab20();
	}
	@Test
	public void verifyleadsselectview() throws InterruptedException
	{
		
		leadsselectview21();
	}
	@Test
	public void verifydefaultview() throws InterruptedException
	{
		
		defaultview22();
	}
   @Test
   public void verifytodayslead() throws Exception
   {
	   todayslead23();
	   logout();
   }
   @Test
   public void verifynewbuttononlead() throws Exception
   {

		loginandleadstab20();
		newbuttononleads24();
		logout();
   }
}
