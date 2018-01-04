package com.drcom.hippo.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name="TBLONLINEUSERS")
public class OnlineUser extends EntityWithId {
	
	@Column(name = "FLDUSERID")
	private long userId;
	
	@Column(name="FLDSUBCONTROLID")
	private long subControlId;
	
	@Column(name="FLDMAINCONTROLID")
	private long mainControlId;
	
	@Column(name="FLDLOGINDATE")
	private Date loginDate;
	
	@Column(name="FLDEXTEND")
	private String extend;
	
	@Column(name="FLDUSERIP")
	private String userIp;
	
	@Column(name="FLDUSERMAC")
	private String userMac;
	
	@Column(name="FLDREADFLAG")
	private Boolean readFlag;
	
	@Column(name="FLDVPNIP")
	private String vpnIp;
	
	@Column(name="FLDSOUIP")
	private String souIp;
	
	@Column(name="FLDSESSIONID")
	private long SessionId;
	
	@Column(name="FLDHOSTNAME")
	private String hostName;
	
	@Column(name="FLDDNSIP")
	private String dnsIp;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getSubControlId() {
		return subControlId;
	}

	public void setSubControlId(long subControlId) {
		this.subControlId = subControlId;
	}

	public long getMainControlId() {
		return mainControlId;
	}

	public void setMainControlId(long mainControlId) {
		this.mainControlId = mainControlId;
	}

	public Date getLoginDate() {
		return loginDate;
	}

	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}

	public String getExtend() {
		return extend;
	}

	public void setExtend(String extend) {
		this.extend = extend;
	}

	public String getUserIp() {
		return userIp;
	}

	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}

	public String getUserMac() {
		return userMac;
	}

	public void setUserMac(String userMac) {
		this.userMac = userMac;
	}

	public Boolean getReadFlag() {
		return readFlag;
	}

	public void setReadFlag(Boolean readFlag) {
		this.readFlag = readFlag;
	}

	public String getVpnIp() {
		return vpnIp;
	}

	public void setVpnIp(String vpnIp) {
		this.vpnIp = vpnIp;
	}

	public String getSouIp() {
		return souIp;
	}

	public void setSouIp(String souIp) {
		this.souIp = souIp;
	}

	public long getSessionId() {
		return SessionId;
	}

	public void setSessionId(long sessionId) {
		SessionId = sessionId;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String getDnsIp() {
		return dnsIp;
	}

	public void setDnsIp(String dnsIp) {
		this.dnsIp = dnsIp;
	}
	
	
}
