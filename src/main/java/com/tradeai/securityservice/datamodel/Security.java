package com.tradeai.securityservice.datamodel;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="security" , schema = "security")
public class Security {
	
	
	@Id
	@Column (name = "security_code")
	private String securityId;
	
	@Column (name = "security_desc")
	private String securityName;
	
	@Column (name = "security_isin")
	private String securityISIN;
	
	@Column (name = "security_sedol")
	private String securitySedol;
	
	@Column (name = "security_cusip")
	private String securityCusip;
	
	@Column (name = "security_valid_from")
	private Date securityValidFrom;
	
	@Column (name = "security_valid_to")
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
