package com.app.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/app3", method = RequestMethod.POST)
public class ApplicationController3 {
	
	@RequestMapping(path = "/getHandlerMethod", method = RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> getHandlerMethod(){
		Map<String, Object> data = new LinkedHashMap<>();
		data.put("methodName", "getHandlerMethod");
		data.put("className", "ApplicationController3");
		
		ResponseEntity<Map<String, Object>> responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.OK);
		return responseEntity;
	}
	
	@RequestMapping(path = "/putHandlerMethod", method = RequestMethod.PUT)
	public ResponseEntity<Map<String, Object>> putHandlerMethod(){
		Map<String, Object> data = new LinkedHashMap<>();
		data.put("methodName", "putHandlerMethod");
		data.put("className", "ApplicationController3");
		
		ResponseEntity<Map<String, Object>> responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.OK);
		return responseEntity;
	}
	
	@RequestMapping(path = "/patchHandlerMethod", method = RequestMethod.PATCH)
	public ResponseEntity<Map<String, Object>> patchHandlerMethod(){
		Map<String, Object> data = new LinkedHashMap<>();
		data.put("methodName", "patchHandlerMethod");
		data.put("className", "ApplicationController3");
		
		ResponseEntity<Map<String, Object>> responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.OK);
		return responseEntity;
	}
	
	@RequestMapping(path = "/deleteHandlerMethod", method = RequestMethod.DELETE)
	public ResponseEntity<Map<String, Object>> deleteHandlerMethod(){
		Map<String, Object> data = new LinkedHashMap<>();
		data.put("methodName", "deleteHandlerMethod");
		data.put("className", "ApplicationController3");
		
		ResponseEntity<Map<String, Object>> responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.OK);
		return responseEntity;
	}
	
}
