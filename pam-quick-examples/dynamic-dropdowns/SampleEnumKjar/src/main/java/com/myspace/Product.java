package com.myspace;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Product implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String region;
	private java.lang.String name;

	public Product() {
	}

	public java.lang.String getRegion() {
		return this.region;
	}

	public void setRegion(java.lang.String region) {
		this.region = region;
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public Product(java.lang.String region, java.lang.String name) {
		this.region = region;
		this.name = name;
	}

}