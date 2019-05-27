package com.example.service02;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class Endpoint {

	@GetMapping( "/elements" )
	public List<String> elements() {
		return Arrays.asList( "elem 1", "elem 2", "elem 3" );
	}

}
