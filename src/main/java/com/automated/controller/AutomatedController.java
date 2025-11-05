package com.automated.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/auto/api")
public class AutomatedController {
	@GetMapping("/sanjay")
	public String getNamee() {
		return "sanjay name is retured";
}
}
