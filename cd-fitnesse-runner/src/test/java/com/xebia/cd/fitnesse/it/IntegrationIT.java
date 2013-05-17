package com.xebia.cd.fitnesse.it;

import org.junit.Test;

public class IntegrationIT extends FitNesseSurefireHelper {
	
	@Test
	public void assertSuiteFunctionalTests() throws Exception {
		executeSuite("FrontPage.IntegrationTests"); 
	}
}