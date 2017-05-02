/**
 * 
 */
package com.bd.or.controller;



import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bd.or.model.LoginRequest;
import com.bd.or.model.LoginResponse;

/**
 * @author BIROJ ROUT
 *
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/alisha/loginservice")


public class LoginContoller {

	/**
	 * @param args
	 */
	@RequestMapping(value="/login",method={RequestMethod.POST})
	public ResponseEntity<?> signin(@RequestBody LoginRequest request)
	
	{
		LoginResponse response = new LoginResponse();
		response.setStatus(200);
		response.setMessage("Success");
		return new ResponseEntity<LoginResponse>(response, HttpStatus.OK);
		
	}
}
