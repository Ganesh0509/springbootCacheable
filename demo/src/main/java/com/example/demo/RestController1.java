package com.example.demo;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class RestController1 implements ErrorController {

     @GetMapping("/test")
    public String getResonse() {
        return "TEst:200" ;
    }

    @RequestMapping("/error")
    public String Handle() {
        return "No mapping Exist";
    }

	@Override
	public String getErrorPath() {
		return "/error";
	}
}