package com.app.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "ApplicationController1", path = "/app1")
public class ApplicationController1 {
	
	@RequestMapping(name = "handlerMethod1", value = "/handlerMethod1")
	public ResponseEntity<Map<String, Object>> handlerMethod1(){
		Map<String, Object> data = new LinkedHashMap<>();
		data.put("methodName", "handlerMethod1");
		data.put("className", "ApplicationController1");
		
		ResponseEntity<Map<String, Object>> responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.OK);
		return responseEntity;
	}
	
	@RequestMapping(name = "handlerMethod2", value = {"/handlerMethod21", "/handlerMethod22", "/handlerMethod23"})
	public ResponseEntity<Map<String, Object>> handlerMethod2(){
		Map<String, Object> data = new LinkedHashMap<>();
		data.put("methodName", "handlerMethod2");
		data.put("className", "ApplicationController1");
		
		ResponseEntity<Map<String, Object>> responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.OK);
		return responseEntity;
	}
	
	@RequestMapping(name = "handlerMethod3", path = "/handlerMethod3")
	public ResponseEntity<Map<String, Object>> handlerMethod3(){
		Map<String, Object> data = new LinkedHashMap<>();
		data.put("methodName", "handlerMethod3");
		data.put("className", "ApplicationController1");
		
		ResponseEntity<Map<String, Object>> responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.OK);
		return responseEntity;
	}
	
	@RequestMapping(name = "handlerMethod4", path = {"/handlerMethod41", "/handlerMethod42", "/handlerMethod43"})
	public ResponseEntity<Map<String, Object>> handlerMethod4(){
		Map<String, Object> data = new LinkedHashMap<>();
		data.put("methodName", "handlerMethod4");
		data.put("className", "ApplicationController1");
		
		ResponseEntity<Map<String, Object>> responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.OK);
		return responseEntity;
	}
}
