package come.tour.page;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.tour.base.BaseFram;

public class FunctionPage extends BaseFram {

	final static Logger logger = Logger.getLogger(HomePage.class);
	
	public FunctionPage Find(){
		
		selLib.enterText(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input"), "LW");
		selLib.enterText(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input"), "123456");
		
		selLib.clickButton(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input"));
		return this;
	}

public FunctionPage Dest(){
		
		selLib.clickButton(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[6]/td/table/tbody/tr/td[2]/font/a"));
				
		String pageTitle = driver.getTitle();
		logger.info("the title of th epage is " + pageTitle);
		String expactedTitle = "Under Construction: Mercury Tours";
		assertEquals(pageTitle, expactedTitle);
	
		return this ;
	}

public FunctionPage vaca(){
	
	selLib.clickButton(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[8]/td/table/tbody/tr/td[2]/font/a"));
			
	String pageTitle = driver.getTitle();
	logger.info("the title of th epage is " + pageTitle);
	String expactedTitle = "Under Construction: Mercury Tours";
	assertEquals(pageTitle, expactedTitle);

	return this ;
}
public FunctionPage reg(){
	
	selLib.clickButton(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[10]/td/table/tbody/tr/td[2]/font/a"));
			
	String pageTitle = driver.getTitle();
	logger.info("the title of th epage is " + pageTitle);
	String expactedTitle = "Under Construction: Mercury Tours";
	assertEquals(pageTitle, expactedTitle);

	return this ;
}
public FunctionPage links(){
	
	selLib.clickButton(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[12]/td/table/tbody/tr/td/font/a[1]"));
	selLib.switchToWindow(1);
	
	String pageTitle = driver.getTitle();
	logger.info("the title of th epage is " + pageTitle);
	String expactedTitle = "404 Not Found";
	assertEquals(pageTitle, expactedTitle);

	return this ;
}
public FunctionPage salonlink(){
	
	selLib.clickButton(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[12]/td/table/tbody/tr/td/font/a[2]"));
	selLib.switchToWindow(1);
	
	String pageTitle = driver.getTitle();
	logger.info("the title of th epage is " + pageTitle);
	String expactedTitle = "Salon.com";
	assertEquals(pageTitle, expactedTitle);

	return this ;
}
}
