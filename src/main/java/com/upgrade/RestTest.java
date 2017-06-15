package com.upgrade;

import org.springframework.web.client.RestTemplate;

public class RestTest {

	public static void main(String [] args){
		
		RestTemplate restTemplate = new RestTemplate();
		String response = restTemplate.getForObject("http://172.27.19.1:8080/user/102", String.class);
		System.out.println(response);
	}
}
