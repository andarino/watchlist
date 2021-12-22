package com.springboot.watchlist.consumer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.springboot.watchlist.model.RestClient;
import com.springboot.watchlist.model.Result;

public class ConsumerAPI {

	public static List<Result> ConnectAPI(String q) {
    List<Result> listaFilmes = new ArrayList<>();
    // request url
    String url = "https://imdb8.p.rapidapi.com/title/find?q="+q;

    // create an instance of RestTemplate
    RestTemplate restTemplate = new RestTemplate();

    // create headers
    HttpHeaders headers = new HttpHeaders();

    // set `Content-Type` and `Accept` headers
    headers.setContentType(MediaType.APPLICATION_JSON);
    headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

    // example of custom header
    headers.set("x-rapidapi-host", "imdb8.p.rapidapi.com");
    headers.set("x-rapidapi-key", "d36c63bfcdmsh1c6b07453c9000ep14b8c6jsn8704340d2ea7");

    // build the request
    HttpEntity request = new HttpEntity(headers);

    // make an HTTP GET request with headers
    ResponseEntity<RestClient> response = restTemplate.exchange(
            url,
            HttpMethod.GET,
            request,
            RestClient.class,
            1
    );
    List<Result> qtdResultados = new ArrayList(response.getBody().getResults());

     int i;
     for(i = 0; i < qtdResultados.size() ; i++) {
    	// endPointsTitle.add(response.getBody().getResults().get(i).getTitle());//endPointsTitle.add(response.getBody().getResults().get(i).getTitle());
    	// endPointsImg.add(response.getBody().getResults().get(i).getImage()); // endPointsImg.add(response.getBody().getResults().get(i).getImage().getUrl()); 
    	 listaFilmes.add(response.getBody().getResults().get(i));         
    	 }

    if (response.getStatusCode() == HttpStatus.OK) {
       System.out.println("Request Successful.");
    } else {        	
        System.out.println("Request Failed");
    }
 return listaFilmes;
	}
	
	
	public ConsumerAPI() {
		// TODO Auto-generated constructor stub
	}

}
