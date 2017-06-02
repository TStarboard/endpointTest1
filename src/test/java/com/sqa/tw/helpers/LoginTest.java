package com.sqa.tw.helpers;

import org.testng.annotations.*;

import com.sqa.tw.helpers.*;

public abstract class LoginTest extends BasicTest {

	public LoginTest(String baseURL) {
		super(baseURL);
	}

	public abstract void login();

	public abstract void logout();

	@Override
	@BeforeClass
	public void setUpFirefox() throws Exception {
		super.setUpFirefox();
		login();
	}

	@Override
	@AfterClass
	public void tearDown() throws Exception {
		logout();
		getDriver().close();
	}
}
