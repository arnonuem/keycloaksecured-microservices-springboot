package com.example.service01;

import java.security.Principal;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.keycloak.adapters.springsecurity.client.KeycloakRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Endpoint {
	
	@Autowired
	KeycloakRestTemplate rest;
		
	@GetMapping( "/elements" )
	public String elements( Model model, Principal principal ) {
		ResponseEntity<String[]> response = rest.getForEntity( "http://localhost:8181/elements", String[].class );
		model.addAttribute( "elements", /*Arrays.asList( "element01", "element02", "element03" )*/ response.getBody() );
		model.addAttribute( "username", principal.getName() );
		return "elements";
	}
	
	@GetMapping( "/logout" )
	public String logout( HttpServletRequest request ) throws ServletException {
		request.logout();
		return "/";
	}
	
}
