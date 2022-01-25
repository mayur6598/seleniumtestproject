package config;

import org.openqa.selenium.WebDriver;

import utilites.SeleniumUtils;

public class runutils extends SeleniumUtils {
	
	public void SetUp() {
		WebDriver driver=setUp("chrome","https://demo.actitime.com/user/submit_tt.do");
	}
}
