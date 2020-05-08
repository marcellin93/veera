package com.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= {"src\\test\\resources"},glue= {"com.stepdef"},monochrome=true)
public class testrunner extends AbstractTestNGCucumberTests {


}
