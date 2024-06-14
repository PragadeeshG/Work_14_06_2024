package com.test1;

public class GenericIdApproach {
	private Integer integratedAppSetId;
	private String saml;
	private String openId;
	private String kongApi;
	private String updatedInstruction;
	private boolean dedicatedURLAvailable;
	private boolean dedicatedURLPath;
	private boolean qualifiedDns;
	private String appendixReference;
	private String platform;
	private Integer purpose;
	private String serverName;
	private String appName;
	private String genericIdName;

	public GenericIdApproach() {

	}

	public GenericIdApproach(Integer integratedAppSetId, String saml, String openId, String kongApi,
			String updatedInstruction, boolean dedicatedURLAvailable, boolean dedicatedURLPath, boolean qualifiedDns,
			String appendixReference, String platform, Integer purpose, String serverName, String appName,
			String genericIdName) {
		super();
		this.integratedAppSetId = integratedAppSetId;
		this.saml = saml;
		this.openId = openId;
		this.kongApi = kongApi;
		this.updatedInstruction = updatedInstruction;
		this.dedicatedURLAvailable = dedicatedURLAvailable;
		this.dedicatedURLPath = dedicatedURLPath;
		this.qualifiedDns = qualifiedDns;
		this.appendixReference = appendixReference;
		this.platform = platform;
		this.purpose = purpose;
		this.serverName = serverName;
		this.appName = appName;
		this.genericIdName = genericIdName;
	}

	public Integer getIntegratedAppSetId() {
		return integratedAppSetId;
	}

	public void setIntegratedAppSetId(Integer integratedAppSetId) {
		this.integratedAppSetId = integratedAppSetId;
	}

	public String getSaml() {
		return saml;
	}

	public void setSaml(String saml) {
		this.saml = saml;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getKongApi() {
		return kongApi;
	}

	public void setKongApi(String kongApi) {
		this.kongApi = kongApi;
	}

	public String getUpdatedInstruction() {
		return updatedInstruction;
	}

	public void setUpdatedInstruction(String updatedInstruction) {
		this.updatedInstruction = updatedInstruction;
	}

	public boolean isDedicatedURLAvailable() {
		return dedicatedURLAvailable;
	}

	public void setDedicatedURLAvailable(boolean dedicatedURLAvailable) {
		this.dedicatedURLAvailable = dedicatedURLAvailable;
	}

	public boolean isDedicatedURLPath() {
		return dedicatedURLPath;
	}

	public void setDedicatedURLPath(boolean dedicatedURLPath) {
		this.dedicatedURLPath = dedicatedURLPath;
	}

	public boolean isQualifiedDns() {
		return qualifiedDns;
	}

	public void setQualifiedDns(boolean qualifiedDns) {
		this.qualifiedDns = qualifiedDns;
	}

	public String getAppendixReference() {
		return appendixReference;
	}

	public void setAppendixReference(String appendixReference) {
		this.appendixReference = appendixReference;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public Integer getPurpose() {
		return purpose;
	}

	public void setPurpose(Integer purpose) {
		this.purpose = purpose;
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getGenericIdName() {
		return genericIdName;
	}

	public void setGenericIdName(String genericIdName) {
		this.genericIdName = genericIdName;
	}

}
