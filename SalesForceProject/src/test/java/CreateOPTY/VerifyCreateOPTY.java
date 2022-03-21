package CreateOPTY;

import org.testng.annotations.Test;

public class VerifyCreateOPTY extends CreateOpportunities15TO19{
	@Test
	public static void verifyopportunities() throws InterruptedException 
	{
		opportunities15();
	}
    @Test
   public  static void verifycreatenewopty() throws InterruptedException
	{

	createnewopty16();
	}

    @Test
   public static void verifyopportunitypipeline() throws InterruptedException
   {

	 opportunitypipeline17();
   }
    @Test
    public static void verifystuckopportunityreport() throws InterruptedException
    {

		stuckopportunityreport18();
    }
    @Test
    public static void verifyquaterlysummaryreport19() throws InterruptedException
    {
    	
        quaterlysummaryreport19();
    }
	
}
