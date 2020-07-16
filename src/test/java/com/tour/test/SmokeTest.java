package com.tour.test;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.tour.base.BaseFram;

import come.tour.page.FunctionPage;
import come.tour.page.HomePage;
import come.tour.page.SubPage;

public class SmokeTest extends BaseFram{
	
	final static Logger logger = Logger.getLogger(SmokeTest.class);
	
	HomePage home= new HomePage();
	SubPage sub = new SubPage();
	FunctionPage fun = new FunctionPage();
	
	
	@Test(enabled=false)
	public void homepageaccess(){
		
		test=extent.createTest("homepageaac");
		home.gotothepage();
		String expactedTitle = "Welcome: Mercury Tours";
		assertEquals(home.Title(), expactedTitle);
		
	}
	
	@Test(enabled=false)
	public void registerac(){
		home.register();
	}
	
	@Test(enabled=false)
	public void signinac(){
		
		test=extent.createTest("signinafterreg");
		
	}

	@Test(enabled=false)
	public void signin(){
		home.gotothepage();
		home.signin();
	}
	@Test(enabled=false)//finding tickets
	public void findflight(){
		home.gotothepage();
		home.signin();
		home.flightfinder();
	}
	
	@Test(enabled=false)//selecting tickets
	public void ticketfinder(){
		home.gotothepage();
		home.signin();
		home.flightfinder();
		home.ticketslec();
	}
	
	@Test(enabled=true)//buyingticket
	public void persoinfo(){
		home.gotothepage();
		home.signin();
		home.flightfinder();
		home.ticketslec();
		home.payinfor();
		
	}
	
	@Test (enabled=false)
	public void subfunction(){
		home.gotothepage();
		sub.subhotel();
	}
	
	@Test(enabled=false)
	public void function(){
		home.gotothepage();
		sub.subrental();
	}
	
	@Test(enabled=false)
	public void func(){
		home.gotothepage();
		sub.crusies();
	}
	@Test(enabled=false)
	public void check(){
		home.gotothepage();
		sub.destination();
			
	}
	
	@Test(enabled=false)
	public void sidebar(){
		home.gotothepage();
		sub.support();				
	}
	
	@Test(enabled=false)
	public void contact(){
		home.gotothepage();
		sub.contact();
	}
	@Test(enabled=false)
	public void bar1(){
		home.gotothepage();
		fun.Dest();
	}
	@Test(enabled=false)
	public void bar2(){
		home.gotothepage();
		fun.vaca();
	}
	@Test(enabled=false)
	public void bar3(){
		home.gotothepage();
		fun.reg();
		home.register();
}
	@Test(enabled=false)
	public void outter(){
		home.gotothepage();
		
		fun.links();
	}
	@Test(enabled=false)
	public void outter1(){
		home.gotothepage();
		fun.salonlink();
		
	}
	@Test(enabled=false)
	public void sign(){
		home.gotothepage();
		fun.Find();
		home.flightfinder();
		
	}
	@Test(enabled=false)
	public void bookflight(){
		home.gotothepage();
		fun.Find();
		home.flightfinder();
		home.ticketslec();
		home.payinfor();
	}
	
}
	
