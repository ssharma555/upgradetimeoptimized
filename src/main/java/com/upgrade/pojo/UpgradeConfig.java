package com.upgrade.pojo;

/**
 * Created by ssharma on 6/15/17.
 */
public class UpgradeConfig {
	
	private String component_name;
	private String labels;
	private String install_dependencies;
	private String number_of_nodes;
	private String number_of_splits;
	private OverrideProperties override_properties;
	public String getComponent_name() {
		return component_name;
	}
	public void setComponent_name(String component_name) {
		this.component_name = component_name;
	}
	public String getLabels() {
		return labels;
	}
	public void setLabels(String labels) {
		this.labels = labels;
	}
	public String getInstall_dependencies() {
		return install_dependencies;
	}
	public void setInstall_dependencies(String install_dependencies) {
		this.install_dependencies = install_dependencies;
	}
	public String getNumber_of_nodes() {
		return number_of_nodes;
	}
	public void setNumber_of_nodes(String number_of_nodes) {
		this.number_of_nodes = number_of_nodes;
	}
	public String getNumber_of_splits() {
		return number_of_splits;
	}
	public void setNumber_of_splits(String number_of_splits) {
		this.number_of_splits = number_of_splits;
	}
	public OverrideProperties getOverride_properties() {
		return override_properties;
	}
	public void setOverride_properties(OverrideProperties override_properties) {
		this.override_properties = override_properties;
	}
	
	

}
