package com.xebia.cd.demo.fitnesse.util;

import fitnesse.junit.JUnitHelper;
import fitnesse.junit.JUnitXMLTestListener;
import fitnesse.responders.run.ResultsListener;

public class JUnitExecutionFactory {

	private static final String FITNESSE_RESULTS_PATH = "target/fitnesse-results";
	private static final String FAILSAFE_REPORTS_PATH = "target/failsafe-reports";
	private static final String FITNESSE_ROOT_PATH = "target/"; // must points to where FitNesseRoot is located

	public JUnitExecution createSuiteExecution(final String suiteName) {
		return new JUnitExecution() {
			@Override
			public void execute() throws Exception {
				createHelper(suiteName).assertSuitePasses(suiteName);
			}
		};
	}

	private JUnitHelper createHelper(String testName) throws Exception {
		ResultsListener resultsListener = new JUnitXMLTestListener(FAILSAFE_REPORTS_PATH);
		return new JUnitHelper(FITNESSE_ROOT_PATH, FITNESSE_RESULTS_PATH, resultsListener);
	}
	
	public interface JUnitExecution {
		void execute() throws Exception;
	}
}