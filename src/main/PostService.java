package main;

import org.apache.hc.core5.http.*;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.classic.methods.HttpDelete;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;

import com.google.gson.Gson;

import java.util.ArrayList;

public class PostService { 
    protected HttpResponse response;
    protected HttpResponse deleteResponse; 
    protected HttpClient httpClient;
    protected HttpPost post;

    public boolean postAlerts(ArrayList<Alert> alertsToPost) throws Exception { 

        httpClient = HttpClientBuilder.create().build();
        post = new HttpPost("https://api.marketalertum.com/Alert/");

        post.addHeader("content-type", "application/json");
        post.setHeader("Accepts", "application/json");

        for(int i = 0; i < 5; i++){
        	for(Alert alertToPost : alertsToPost) {
                post.setEntity((HttpEntity) new StringEntity(new Gson().toJson(alertToPost)));
                response = httpClient.execute(post);
                
                if(response.getCode() == 400) { 
                	return false; 
                }
                
                alertToPost.getDetails();
                post.reset();
            }
        }
        
//        for(Alert alertToPost : alertsToPost) {
//            post.setEntity((HttpEntity) new StringEntity(new Gson().toJson(alertToPost)));
//            response = httpClient.execute(post);
//            
//            if(response.getCode() == 400) { 
//            	return false; 
//            }
//            
//            alertToPost.getDetails();
//            post.reset();
//        }

        return true; 
    }

    public boolean removeAllAlerts() throws Exception{ 
        httpClient = HttpClientBuilder.create().build();
        String deleteEndpoint = "https://api.marketalertum.com/Alert?userId=31a7cb0e-e0e5-4a05-9351-c074815f7b8a";
        HttpDelete httpDelete = new HttpDelete(deleteEndpoint);
        deleteResponse = httpClient.execute(httpDelete);
        
        if(deleteResponse.getCode() == 400) { 
        	return false; 
        }
        
        return true; 
    }
}