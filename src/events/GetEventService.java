package events;


import java.util.ArrayList;

import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.core5.http.*;
import org.apache.hc.core5.http.io.entity.EntityUtils;

import com.google.gson.Gson;

public class GetEventService {
	protected String userId = "31a7cb0e-e0e5-4a05-9351-c074815f7b8a";
	protected String eventLogString = "";
	protected HttpClient client; 
	protected HttpGet get; 
	
	EventsLog[] events;
	
	public void getEvents() { 
		client = HttpClientBuilder.create().build(); 
		get = new HttpGet("https://api.marketalertum.com/EventsLog/" + userId);
		
		get.addHeader("content-type", "application/json");
	    get.setHeader("Accepts", "application/json");
		try {
			ClassicHttpResponse response = (ClassicHttpResponse) client.execute(get);
			System.out.println(response.getCode());
			eventLogString = EntityUtils.toString(response.getEntity(), "UTF-8");
			
			//System.out.println(eventLogString);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Gson gson = new Gson(); 
		 
		events = gson.fromJson(eventLogString, EventsLog[].class);
		
		for(EventsLog event : events) {
			event.printEventLogs();
		}
	}
	
	public ArrayList<EventsLog.EventLogTypes> eventTypesOccured() { 
		ArrayList<EventsLog.EventLogTypes> eventsOccuredType = new ArrayList<EventsLog.EventLogTypes>();
		for(EventsLog event : events) { 
			eventsOccuredType.add(event.getEventLogType());
		}
		
		return eventsOccuredType;
	}
}
