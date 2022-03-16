package com.classwork.testfile;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;

import com.classwork.testng.pages.OpportunitiesPage;

public class OpportunitiesTest   {
	
	
	
	
	@BeforeMethod
	public void start() throws IOException {
		
	}
	
	public void verifyOppName() {
		OpportunitiesPage opp = new OpportunitiesPage();
		opp.clickOppTab();
		opp.clickNewBtn();
		opp.enterOppName();
		opp.clickSaveBtn();
	}
	
	public void verifyLeadSource() {
		
	}
	
	public void verifyStatus() {
		
		
	}
	
	public void verifyerror() {
		
		
	}
	
	
	
	
	
}
