package com.tradeai.securityservice.data;

import org.springframework.data.repository.CrudRepository;

import com.tradeai.securityservice.datamodel.Security;

public interface SecurityRepository extends CrudRepository<Security, String> {
	
	

}
