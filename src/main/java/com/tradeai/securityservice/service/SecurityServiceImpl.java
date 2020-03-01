package com.tradeai.securityservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tradeai.securityservice.data.SecurityRepository;
import com.tradeai.securityservice.datamodel.Security;

@Service
public class SecurityServiceImpl implements SecurityService {
	
	@Autowired
	private SecurityRepository repository; 

	@Override
	public Security getSecurity(String securityId) {
		// TODO Auto-generated method stub
		
		Optional<Security> optional =  repository.findById(securityId);
		return optional.get();
	}

}
