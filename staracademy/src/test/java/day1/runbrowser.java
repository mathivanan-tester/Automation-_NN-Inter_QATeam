package day1;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;


public class runbrowser {

	public static void main(String[] args) {
		
		
		Playwright playwright = Playwright.create();
		
	    Browser browser = playwright.chromium().launch(
	
	  new BrowserType.LaunchOptions().setHeadless(false));
	  
	 Page page = browser.newPage();
	    
	 page.navigate("https://devproxy.staracademyapp.com/auth/login");
	    
     System.out.println("Successfully Login the applications home page");

     //page.close();
    // browser.close();
    // playwright.close();
     
     
     

	}

}
