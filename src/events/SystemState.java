package events;

import java.util.ArrayList;
import main.Alert;

public class SystemState {
	String userId; 
	boolean loggedIn; 
	ArrayList<Alert> alerts = new ArrayList<Alert>();
	
	public String getUserId(){
		return userId;
	}
	
	public boolean getLoggedInStatus() { 
		return loggedIn;
	}
	
	public ArrayList<Alert> getAlerts() { 
		return alerts;
	}
}

