package com.test1;

public class PurposeOfDocument {
	private Integer id;
	private String docClassification;
	private String iamStandard;
	private String privilegeIdentifier;
	private Integer valutingSystemCode;
	private boolean isValuted;
	private boolean isOneValuted;
	private String accessType;
	private String adminCode;
	private String adminUserCreatedTime;
	private String ssoWithoutMfa;
	private String ssoWithMfa;
	private String vaultGeneratedTime;
	private String entityState;

	public PurposeOfDocument() {

	}

	public PurposeOfDocument(Integer id, String docClassification, String iamStandard, String privilegeIdentifier,
			Integer valutingSystemCode, boolean isValuted, boolean isOneValuted, String accessType, String adminCode,
			String adminUserCreatedTime, String ssoWithoutMfa, String ssoWithMfa, String vaultGeneratedTime,
			String entityState) {
		super();
		this.id = id;
		this.docClassification = docClassification;
		this.iamStandard = iamStandard;
		this.privilegeIdentifier = privilegeIdentifier;
		this.valutingSystemCode = valutingSystemCode;
		this.isValuted = isValuted;
		this.isOneValuted = isOneValuted;
		this.accessType = accessType;
		this.adminCode = adminCode;
		this.adminUserCreatedTime = adminUserCreatedTime;
		this.ssoWithoutMfa = ssoWithoutMfa;
		this.ssoWithMfa = ssoWithMfa;
		this.vaultGeneratedTime = vaultGeneratedTime;
		this.entityState = entityState;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDocClassification() {
		return docClassification;
	}

	public void setDocClassification(String docClassification) {
		this.docClassification = docClassification;
	}

	public String getIamStandard() {
		return iamStandard;
	}

	public void setIamStandard(String iamStandard) {
		this.iamStandard = iamStandard;
	}

	public String getPrivilegeIdentifier() {
		return privilegeIdentifier;
	}

	public void setPrivilegeIdentifier(String privilegeIdentifier) {
		this.privilegeIdentifier = privilegeIdentifier;
	}

	public Integer getValutingSystemCode() {
		return valutingSystemCode;
	}

	public void setValutingSystemCode(Integer valutingSystemCode) {
		this.valutingSystemCode = valutingSystemCode;
	}

	public boolean isValuted() {
		return isValuted;
	}

	public void setValuted(boolean isValuted) {
		this.isValuted = isValuted;
	}

	public boolean isOneValuted() {
		return isOneValuted;
	}

	public void setOneValuted(boolean isOneValuted) {
		this.isOneValuted = isOneValuted;
	}

	public String getAccessType() {
		return accessType;
	}

	public void setAccessType(String accessType) {
		this.accessType = accessType;
	}

	public String getAdminCode() {
		return adminCode;
	}

	public void setAdminCode(String adminCode) {
		this.adminCode = adminCode;
	}

	public String getAdminUserCreatedTime() {
		return adminUserCreatedTime;
	}

	public void setAdminUserCreatedTime(String adminUserCreatedTime) {
		this.adminUserCreatedTime = adminUserCreatedTime;
	}

	public String getSsoWithoutMfa() {
		return ssoWithoutMfa;
	}

	public void setSsoWithoutMfa(String ssoWithoutMfa) {
		this.ssoWithoutMfa = ssoWithoutMfa;
	}

	public String getSsoWithMfa() {
		return ssoWithMfa;
	}

	public void setSsoWithMfa(String ssoWithMfa) {
		this.ssoWithMfa = ssoWithMfa;
	}

	public String getVaultGeneratedTime() {
		return vaultGeneratedTime;
	}

	public void setVaultGeneratedTime(String vaultGeneratedTime) {
		this.vaultGeneratedTime = vaultGeneratedTime;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
