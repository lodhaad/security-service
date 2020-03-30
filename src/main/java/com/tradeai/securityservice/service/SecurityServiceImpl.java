package com.tradeai.securityservice.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tradeai.securityservice.data.SecurityRepository;
import com.tradeai.securityservice.datamodel.Security;
import com.tradeai.securityservice.dto.SecurityDTO;

@Service
public class SecurityServiceImpl implements SecurityService {
	
	@Autowired
	private SecurityRepository repository; 

	@Override
	public SecurityDTO getSecurity(String securityId) {


		
		Optional<Security> optional =  repository.findById(securityId);
		
		
		
		ModelMapper mapper = new ModelMapper();
		SecurityDTO dto = mapper.map(optional.get(), SecurityDTO.class);
		
		return dto;
	}

}
