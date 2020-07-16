package come.tour.page;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.tour.base.BaseFram;

public class SubPage extends BaseFram {

	final static Logger logger = Logger.getLogger(HomePage.class);

	public SubPage subhotel(){
		
		selLib.clickButton(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]/td[2]/a"));
		
		String pageTitle = driver.getTitle();
		logger.info("the title of th epage is " + pageTitle);
		String expactedTitle = "Under Construction: Mercury Tours";
		assertEquals(pageTitle, expactedTitle);
	
		return this ;
	}
	
	public SubPage subrental(){
		
		selLib.clickButton(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[4]/td[2]/font/a"));
		
		String pageTitle = driver.getTitle();
		logger.info("the title of th epage is " + pageTitle);
		String expactedTitle = "Under Construction: Mercury Tours";
		assertEquals(pageTitle, expactedTitle);
	
		return this ;
		
	}
public SubPage crusies(){
		
		selLib.clickButton(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[4]/td[2]/font/a"));
		
		String pageTitle = driver.getTitle();
		logger.info("the title of th epage is " + pageTitle);
		String expactedTitle = "Under Construction: Mercury Tours";
		assertEquals(pageTitle, expactedTitle);
	
		return this ;
		
	}
public SubPage destination(){
	
	selLib.clickButton(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[4]/td[2]/font/a"));
	
	String pageTitle = driver.getTitle();
	logger.info("the title of th epage is " + pageTitle);
	String expactedTitle = "Under Construction: Mercury Tours";
	assertEquals(pageTitle, expactedTitle);

	return this ;
	
}
public SubPage vacations(){
	
	selLib.clickButton(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[4]/td[2]/font/a"));
	
	String pageTitle = driver.getTitle();
	logger.info("the title of th epage is " + pageTitle);
	String expactedTitle = "Under Construction: Mercury Tours";
	assertEquals(pageTitle, expactedTitle);

	return this ;
	
}

public SubPage support(){
	
	selLib.clickButton(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[3]/a"));
	
	String pageTitle = driver.getTitle();
	logger.info("the title of th epage is " + pageTitle);
	String expactedTitle = "Under Construction: Mercury Tours";
	assertEquals(pageTitle, expactedTitle);

	return this ;	
}
public SubPage contact(){
	
	selLib.clickButton(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[3]/a"));
	
	String pageTitle = driver.getTitle();
	logger.info("the title of th epage is " + pageTitle);
	String expactedTitle = "Under Construction: Mercury Tours";
	assertEquals(pageTitle, expactedTitle);

	return this ;
}
}
