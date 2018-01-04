package com.drcom.hippo.domain;

import java.util.Date;

public class WarningSetting {
	private String emailAddress;
	
	private long threshold;
	
	private Date lastWarningTime;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public long getThreshold() {
		return threshold;
	}

	public void setThreshold(long threshold) {
		this.threshold = threshold;
	}

	public Date getLastWarningTime() {
		return lastWarningTime;
	}

	public void setLastWarningTime(Date lastWarningTime) {
		this.lastWarningTime = lastWarningTime;
	}
}
