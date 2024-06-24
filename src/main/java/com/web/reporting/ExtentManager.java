package com.web.reporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.gherkin.model.Scenario;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.cucumber.java.After;
import io.cucumber.java.Before;

@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
public class ExtentManager {

    private static ExtentReports extentReports = null;
    
	private static ThreadLocal<ExtentReports> extent = new ThreadLocal();
    private static ThreadLocal<ExtentTest> test = new ThreadLocal();
    private static ThreadLocal<ExtentTest> child = new ThreadLocal();
	private static ThreadLocal<ExtentTest> subchild = new ThreadLocal();
	
	@Before
    public void beforeScenario(Scenario scenario) {
        ExtentTest test = ExtentManager.getInstance().createTest(scenario.getGherkinName());
        ExtentManager.setTest(test);
    }

    public ExtentManager() {
    }


    public synchronized static ThreadLocal<ExtentTest> getTest() {
        return test;
    }

    public synchronized static void setTest(ExtentTest test) {
        getTest().set(test);
    }

    public synchronized static ThreadLocal<ExtentTest> getChild() {
        return child;
    }

    public synchronized static void setChild(ExtentTest child) {
        getChild().set(child);
    }

    public static ThreadLocal<ExtentReports> getExtent() {
        return extent;
    }

    public static void setExtent(ExtentReports extent) {
        getExtent().set(extent);
    }

    public static ExtentReports getInstance() {
        return extentReports;
    }

    public static ExtentReports createInstance(String reportFolderPath, String reportName) {
        if (extentReports == null) {
            ExtentSparkReporter htmlReporter = new ExtentSparkReporter(reportFolderPath + reportName);
            htmlReporter.config().setDocumentTitle("Execution Report");
            htmlReporter.config().setReportName("Test Reports ");
            htmlReporter.config().setTheme(Theme.STANDARD);
            htmlReporter.config().setEncoding("utf-8");
            extentReports = new ExtentReports();
            extentReports.attachReporter(htmlReporter);
            setExtent(extentReports);
            return getExtent().get();
        }
        return extentReports;
    }

    public static void addExecutionDetails_ExtentReport() {
        getExtent().get().flush();
    }
}

