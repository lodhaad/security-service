package com.tradeai.securityservice.service;

import com.tradeai.securityservice.datamodel.Security;
import com.tradeai.securityservice.dto.SecurityDTO;

public interface SecurityService {
	
	public SecurityDTO getSecurity(String securityId);

}
