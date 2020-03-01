package com.tradeai.securityservice.response;

import java.util.Date;

public class SecurityResponse {
	
	private String securityId;
	private String securityName;
	private String securityISIN;
	private String securitySedol;
	private String securityCusip;
	private Date securityValidFrom;
	private Date securityValidTo;
	
	
	public String getSecurityId() {
		return securityId;
	}
	public void setSecurityId(String securityId) {
		this.securityId = securityId;
	}
	public String getSecurityName() {
		return securityName;
	}
	public void setSecurityName(String securityName) {
		this.securityName = securityName;
	}
	public String getSecurityISIN() {
		return securityISIN;
	}
	public void setSecurityISIN(String securityISIN) {
		this.securityISIN = securityISIN;
	}
	public String getSecuritySedol() {
		return securitySedol;
	}
	public void setSecuritySedol(String securitySedol) {
		this.securitySedol = securitySedol;
	}
	public String getSecurityCusip() {
		return securityCusip;
	}
	public void setSecurityCusip(String securityCusip) {
		this.securityCusip = securityCusip;
	}
	public Date getSecurityValidFrom() {
		return securityValidFrom;
	}
	public void setSecurityValidFrom(Date securityValidFrom) {
		this.securityValidFrom = securityValidFrom;
	}
	public Date getSecurityValidTo() {
		return securityValidTo;
	}
	public void setSecurityValidTo(Date securityValidTo) {
		this.securityValidTo = securityValidTo;
	}
	
	

}
