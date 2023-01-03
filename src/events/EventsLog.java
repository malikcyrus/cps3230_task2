package events;

import java.util.ArrayList;

import com.google.gson.annotations.SerializedName;

import main.Alert;

public class EventsLog { 
	String id; 
	String timestamp;
	String userId; 
	SystemState systemState;
	
	@SerializedName("eventLogType")
	EventLogTypes eventLogType = null;
	
	 public static enum EventLogTypes {
		@SerializedName("0")
		AlertCreated,
		@SerializedName("1")		
		AlertDeleted,
		@SerializedName("5")
		UserValidLogin,
		@SerializedName("6")
		UserLoggedOut,
		@SerializedName("7")
		UserViewedAlerts
	}

	
	public String getID() { 
		return id; 
	}
	
	public EventLogTypes getEventLogType() { 
		return eventLogType;
	}
	
	public SystemState getSystemState() { 
		return systemState;
	}
	
	public String getUserID() { 
		return userId;
	}
	
	public void printEventLogs() {
		ArrayList<Alert> alerts = new ArrayList<Alert>(systemState.getAlerts());
		
		System.out.println("id: "+ id);
		System.out.println("timestamp: " + timestamp);
		System.out.println("eventLogType: " + eventLogType.name());
		System.out.println("userId: " + userId);
		System.out.println("systemState: {");
		System.out.println("    userId: " + systemState.getUserId());
		System.out.println("    loggedIn: " + systemState.getLoggedInStatus());
		if(alerts.size() <= 0) {
			System.out.println("	alerts: []" );
		} else {
			System.out.println("	alerts: [" );
			for(Alert alert : alerts) { 
				alert.getDetails();
			}
			System.out.println("  	]");
		}
		System.out.println("}");
	}
}