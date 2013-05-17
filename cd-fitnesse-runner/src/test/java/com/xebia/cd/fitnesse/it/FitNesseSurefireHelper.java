package com.xebia.cd.fitnesse.it;

import com.xebia.cd.demo.fitnesse.util.JUnitExecutionFactory;

public abstract class FitNesseSurefireHelper {

	protected void executeSuite(String suiteName) throws Exception {
		new JUnitExecutionFactory().createSuiteExecution(suiteName).execute();
	}
}