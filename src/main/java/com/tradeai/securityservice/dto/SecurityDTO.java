package com.tradeai.securityservice.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class SecurityDTO {
	

	private String securityId;
	

	private String securityName;
	
	
	private String securityISIN;
	


	private String securitySedol;
	


	private String securityCusip;


	private Date securityValidFrom;


	private Date securityValidTo;
	
	

}
