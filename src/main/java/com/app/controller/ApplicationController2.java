package com.app.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/app2")
public class ApplicationController2 {
	
	@RequestMapping(path = "/handlerMethod")
	public ResponseEntity<Map<String, Object>> handlerMethod(){
		Map<String, Object> data = new LinkedHashMap<>();
		data.put("methodName", "handlerMethod");
		data.put("className", "ApplicationController2");
		
		ResponseEntity<Map<String, Object>> responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.OK);
		return responseEntity;
	}
	
	@RequestMapping(path = "/getHandlerMethod", method = RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> getHandlerMethod(){
		Map<String, Object> data = new LinkedHashMap<>();
		data.put("methodName", "getHandlerMethod");
		data.put("className", "ApplicationController2");
		
		ResponseEntity<Map<String, Object>> responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.OK);
		return responseEntity;
	}
	
	@RequestMapping(path = "/postHandlerMethod", method = RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> postHandlerMethod(){
		Map<String, Object> data = new LinkedHashMap<>();
		data.put("methodName", "postHandlerMethod");
		data.put("className", "ApplicationController2");
		
		ResponseEntity<Map<String, Object>> responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.OK);
		return responseEntity;
	}
	
	@RequestMapping(path = "/getAndPostHandlerMethod", method = { RequestMethod.GET, RequestMethod.POST })
	public ResponseEntity<Map<String, Object>> getAndPostHandlerMethod(){
		Map<String, Object> data = new LinkedHashMap<>();
		data.put("methodName", "getAndPostHandlerMethod");
		data.put("className", "ApplicationController2");
		
		ResponseEntity<Map<String, Object>> responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.OK);
		return responseEntity;
	}

}
