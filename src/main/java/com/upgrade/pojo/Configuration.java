package com.upgrade.pojo;

public class Configuration {
	
	private Integer configId;
	
	private String compName;
	
	private String configName;
	
	private int dashboardConfigId;
	
	private String Labels;
	
	private int numberOfNodes;
	
	private int numberOfSplits;
	
	public int getConfigId(){
		return this.configId;
	}
	
	public void setConfigId(int a){
		this.configId = a;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public String getConfigName() {
		return configName;
	}

	public void setConfigName(String configName) {
		this.configName = configName;
	}

	public int getDashboardConfigId() {
		return dashboardConfigId;
	}

	public void setDashboardConfigId(int dashboardConfigId) {
		this.dashboardConfigId = dashboardConfigId;
	}

	public String getLabels() {
		return Labels;
	}

	public void setLabels(String labels) {
		Labels = labels;
	}

	public int getNumberOfNodes() {
		return numberOfNodes;
	}

	public void setNumberOfNodes(int numberOfNodes) {
		this.numberOfNodes = numberOfNodes;
	}

	public int getNumberOfSplits() {
		return numberOfSplits;
	}

	public void setNumberOfSplits(int numberOfSplits) {
		this.numberOfSplits = numberOfSplits;
	}
	
	
}
