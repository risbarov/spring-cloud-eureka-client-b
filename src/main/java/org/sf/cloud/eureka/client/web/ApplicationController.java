package org.sf.cloud.eureka.client.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "Spring Cloud Eureka client B is running...";
	}

	@RequestMapping("/ping")
	@ResponseBody
	public String ping() {
		return "Client B ping";
	}

}
