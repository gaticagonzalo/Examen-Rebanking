package com.example.Rest;

import java.util.Arrays;

//import org.apache.tomcat.util.http.parser.MediaType;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


public class Controller {
    public static ResponseEntity<String> ExecutePUT(String uri, String body) {
		try {		
			RestTemplate restTemplate = new RestTemplate();
			    
			HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList());
			
			HttpEntity<String> entity = new HttpEntity<String>(body,headers);
			ResponseEntity<String> response = restTemplate.exchange(uri, HttpMethod.PUT, entity, String.class);
			
			return response;
		}catch(Exception ex) {
			System.out.println("General Error RestProcess.ExecutePUT: " + ex.getMessage());
			System.out.println("Uri: " + uri);
			System.out.println("Body: " + body);
			return null;
		}
	}
	
	public static ResponseEntity<String> ExecuteGET(String uri) {
				
		try {
			RestTemplate restTemplate = new RestTemplate();
			
			HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList());
			
			HttpEntity<String> entity = new HttpEntity<String>(headers);
			ResponseEntity<String> response = restTemplate.exchange(uri, HttpMethod.GET, entity, String.class);
			
			return response;
		}catch(Exception ex) {
			System.out.println("General Error RestProcess.ExecuteGETByParams: " + ex.getMessage());
			System.out.println("Uri: " + uri);
			return null;
		}
	}
	
	public static ResponseEntity<String> ExecutePOST(String uri, String body){
		try {		
			RestTemplate restTemplate = new RestTemplate();
			    
			HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList());
			
			HttpEntity<String> entity = new HttpEntity<String>(body,headers);
			ResponseEntity<String> response = restTemplate.exchange(uri, HttpMethod.POST, entity, String.class);
			
			return response;
		}catch(Exception ex) {
			System.out.println("General Error RestProcess.ExecutePOST: " + ex.getMessage());
			System.out.println("Uri: " + uri);
			System.out.println("Body: " + body);
			return null;
		}
	}
	
	public static ResponseEntity<String> ExecuteDELETE(String uri){
		try {		
			RestTemplate restTemplate = new RestTemplate();
			
			HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList());
			
			HttpEntity<String> entity = new HttpEntity<String>(headers);
			ResponseEntity<String> response = restTemplate.exchange(uri, HttpMethod.DELETE, entity, String.class);
			
			return response;
		}catch(Exception ex) {
			System.out.println("General Error RestProcess.ExecuteDELETE: " + ex.getMessage());
			System.out.println("Uri: " + uri);
			return null;
		}
	}
}