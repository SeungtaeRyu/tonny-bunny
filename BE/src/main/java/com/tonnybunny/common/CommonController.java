package com.tonnybunny.common;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * nginx 테스트용 Controller
 */
@RestController
@CrossOrigin
public class CommonController {

	@GetMapping("/")
	public String getRootPath() {
		return "path: /";
	}


	@GetMapping("/api")
	public String getApiPath() {
		return "path: api";
	}

}