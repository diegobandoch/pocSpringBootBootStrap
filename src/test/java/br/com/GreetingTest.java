package br.com;

import java.util.Arrays;

import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import br.com.model.Greeting;
import br.com.model.Issue;

public class GreetingTest {

	@Test
	public void testeGreeting() {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Greeting> response = restTemplate.getForEntity("http://localhost:8181/greeting?name=Diego",
				Greeting.class);

		System.out.println("-----------------------------------");
		System.out.println(response.getBody());
		System.out.println("-----------------------------------");
	}

	@Test
	public void testeJiraService() {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.set("Authorization", "Basic ZHNhbnQ1NDpXYWxtYXJ0MTE=");
		headers.set("Content-Type", "application/json");
		
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		
		String url = "http://jira.vmcommerce.intra:8080/rest/api/2/issue/MAP-2067";
		ResponseEntity<Issue> exchange = restTemplate.exchange(url, HttpMethod.GET, entity, Issue.class);
		
//		ResponseEntity<Issue> response = restTemplate
//				.getForEntity("http://jira.vmcommerce.intra:8080/rest/api/2/issue/MAP-2067", Issue.class);


		Issue issue =(Issue)exchange.getBody();
		
		System.out.println("-----------------------------------");
		System.out.println(issue.getKey());
		System.out.println("-----------------------------------");
	}

}
