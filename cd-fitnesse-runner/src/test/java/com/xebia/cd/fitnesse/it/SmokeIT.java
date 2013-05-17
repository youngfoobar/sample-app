package com.xebia.cd.fitnesse.it;

import org.junit.Test;

public class SmokeIT extends FitNesseSurefireHelper {
	
	@Test
	public void assertSuiteSmokeTests() throws Exception {
		executeSuite("FrontPage.SmokeTests");
	}
}