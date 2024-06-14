package com.test1;

public class MfaAppOnboarding {
	private Integer integratedAppId;
	private String ssoIntegratedApp1;
	private String ssoValue1;
	private String ssoIntegratedApp2;
	private String ssoValue2;
	private String ssoIntegratedApp3;
	private String ssoValue3;
	private String ssoSystem;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public MfaAppOnboarding() {

	}

	public MfaAppOnboarding(Integer integratedAppId, String ssoIntegratedApp1, String ssoValue1,
			String ssoIntegratedApp2, String ssoValue2, String ssoIntegratedApp3, String ssoValue3, String ssoSystem,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.integratedAppId = integratedAppId;
		this.ssoIntegratedApp1 = ssoIntegratedApp1;
		this.ssoValue1 = ssoValue1;
		this.ssoIntegratedApp2 = ssoIntegratedApp2;
		this.ssoValue2 = ssoValue2;
		this.ssoIntegratedApp3 = ssoIntegratedApp3;
		this.ssoValue3 = ssoValue3;
		this.ssoSystem = ssoSystem;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getIntegratedAppId() {
		return integratedAppId;
	}

	public void setIntegratedAppId(Integer integratedAppId) {
		this.integratedAppId = integratedAppId;
	}

	public String getSsoIntegratedApp1() {
		return ssoIntegratedApp1;
	}

	public void setSsoIntegratedApp1(String ssoIntegratedApp1) {
		this.ssoIntegratedApp1 = ssoIntegratedApp1;
	}

	public String getSsoValue1() {
		return ssoValue1;
	}

	public void setSsoValue1(String ssoValue1) {
		this.ssoValue1 = ssoValue1;
	}

	public String getSsoIntegratedApp2() {
		return ssoIntegratedApp2;
	}

	public void setSsoIntegratedApp2(String ssoIntegratedApp2) {
		this.ssoIntegratedApp2 = ssoIntegratedApp2;
	}

	public String getSsoValue2() {
		return ssoValue2;
	}

	public void setSsoValue2(String ssoValue2) {
		this.ssoValue2 = ssoValue2;
	}

	public String getSsoIntegratedApp3() {
		return ssoIntegratedApp3;
	}

	public void setSsoIntegratedApp3(String ssoIntegratedApp3) {
		this.ssoIntegratedApp3 = ssoIntegratedApp3;
	}

	public String getSsoValue3() {
		return ssoValue3;
	}

	public void setSsoValue3(String ssoValue3) {
		this.ssoValue3 = ssoValue3;
	}

	public String getSsoSystem() {
		return ssoSystem;
	}

	public void setSsoSystem(String ssoSystem) {
		this.ssoSystem = ssoSystem;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
