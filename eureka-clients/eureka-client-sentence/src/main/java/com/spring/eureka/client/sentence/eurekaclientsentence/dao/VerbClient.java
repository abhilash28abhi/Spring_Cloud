package com.spring.eureka.client.sentence.eurekaclientsentence.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-client-verb")
public interface VerbClient {

	@GetMapping("/")
	public String getWord();
}