package hrPageTestCase;

import org.testng.annotations.Test;

import hrPageObjects.CompanyPage;

public class TC_companyTestcase_002 {
	CompanyPage company=new CompanyPage();
	
	@Test
	public void verifycompany() throws InterruptedException {
		company.companyTestcase();
		
	}

}
