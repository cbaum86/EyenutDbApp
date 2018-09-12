package com.harvardtechnology.EyenutDbApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hub {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String hubName;
	
	private String hubIp;
	
	private boolean isAWS;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the hubName
	 */
	public String getHubName() {
		return hubName;
	}

	/**
	 * @param hubName the hubName to set
	 */
	public void setHubName(String hubName) {
		this.hubName = hubName;
	}

	/**
	 * @return the hubIp
	 */
	public String getHubIp() {
		return hubIp;
	}

	/**
	 * @param hubIp the hubIp to set
	 */
	public void setHubIp(String hubIp) {
		this.hubIp = hubIp;
	}

	/**
	 * @return the isAWS
	 */
	public boolean isAWS() {
		return isAWS;
	}

	/**
	 * @param isAWS the isAWS to set
	 */
	public void setAWS(boolean isAWS) {
		this.isAWS = isAWS;
	}



}
