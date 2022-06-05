package com.pipe.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PipeController {

	@GetMapping("/ver")
	public String ver() {
		return "Ver: 1.0.0.0";
	}
}
