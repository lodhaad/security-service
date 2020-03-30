package com.tradeai.securityservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tradeai.securityservice.datamodel.Security;
import com.tradeai.securityservice.dto.SecurityDTO;
import com.tradeai.securityservice.response.SecurityResponse;
import com.tradeai.securityservice.service.SecurityService;

@RestController
@RequestMapping ("/security")
public class SecurityController {
	
	@Autowired
	private SecurityService service; 
	
	@GetMapping (path = "/health")
	
	public String gethealth () {
		return "health good ";
	}
	
	
	@GetMapping(path = "/{securityId}" )
	public ResponseEntity<SecurityResponse> getSecurity (@PathVariable String securityId) {
		
		SecurityResponse response = getFromDB(securityId);
		
		return new ResponseEntity<SecurityResponse>(response, HttpStatus.OK);
		
	}
	
	
	
	private SecurityResponse getFromDB (String securityId) {
		
		SecurityDTO secFromDb = service.getSecurity(securityId);
		
		SecurityResponse response = new SecurityResponse();
		response.setSecurityId(secFromDb.getSecurityId());
		response.setSecurityName(secFromDb.getSecurityName());
		response.setSecurityISIN(secFromDb.getSecurityISIN());
		response.setSecuritySedol(secFromDb.getSecuritySedol());
		response.setSecurityValidFrom(secFromDb.getSecurityValidFrom());
		response.setSecurityValidTo(secFromDb.getSecurityValidTo());
		return response;
		
		
	}

}
