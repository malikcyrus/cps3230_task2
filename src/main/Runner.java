package main;

import marketAlertUM.MarketAlertList;
import marketAlertUM.MarketAlertLogin;

import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.classic.methods.HttpGet;

import events.EventsLog;
import events.GetEventService;

import java.util.ArrayList;

public class Runner {
	static HttpClient client; 
	static HttpGet get; 
	
	public void alertCreated() { 
		System.out.println("User Created Alerts");
	}
	
	public void alertsDeleted() { 
		System.out.println("User Deleted Alerts");
	}
	
	public void userValidLogin() { 
		System.out.println("User Logged In");
	}
	
	public void userLoggedOut() {
		System.out.println("User Logged Out");
	}
	
	public void userViewedAlerts() { 
		System.out.println("User Viewed Alerts");	
	}
	
	public void run() {
		
		System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		ArrayList <Alert> alerts = new ArrayList<Alert>();
		Alert alert = new Alert(1, "Samsung Galaxy Watch 5 44mm Sapphire", "Know your sleep with our improved sleep tracking technology. Plan your bedtime, detect snoring, understand and track your sleep stages (awake, light, deep, REM) via 8 animal sleep symbols representing your sleep type. Better nights lead to better days.", "https://intercomp.com.mt/product/samsung-galaxy-watch-5-44mm-sapphire/", "https://intercomp.com.mt/wp-content/uploads/2022/12/58401.jpg", 29900);
		alerts.add(alert);
		
		PostService alertPoster = new PostService(); 
		 try {
			 if(!alertPoster.postAlerts(alerts)) { 
				 System.out.println("Invalid POST!"); 
				 driver.quit();
				 return;
			 }
	     } catch (Exception e) {
	         e.printStackTrace();
         }
		 
		 MarketAlertLogin login = new MarketAlertLogin(driver);
	     login.inputUserID("31a7cb0e-e0e5-4a05-9351-c074815f7b8a");
	     MarketAlertList list = new MarketAlertList(driver);
	     System.out.println("No of alerts on page: " + list.getNumberOfAlerts());
	     for(Alert alertToCheck : alerts) {
	    	 list.verifyIcon(alertToCheck.alertType);
	     }
	     list.verifyAlertsLayout();
	     list.clickLogOut();
	     driver.quit();
	     
	     
	     // -- getting events here -- 
	     
	     GetEventService eventCaller = new GetEventService();
	     eventCaller.getEvents();
	     
	     ArrayList<EventsLog.EventLogTypes> events = new ArrayList<EventsLog.EventLogTypes>(eventCaller.eventTypesOccured());
	     for(EventsLog.EventLogTypes event : events) {
	    	 switch(event){
	    	 case AlertCreated: alertCreated(); break;
	    	 case AlertDeleted: alertsDeleted(); break;
	    	 case UserValidLogin: userValidLogin(); break;
	    	 case UserLoggedOut: userLoggedOut(); break;
	    	 case UserViewedAlerts: userViewedAlerts(); break;
	    	 default: System.out.println("Cannot identify Event:" + event);
	    	 }
	     }
	     
	}
	
	public static void main(String[] args) {
		final Runner r = new Runner();
		r.run();
	}
}
