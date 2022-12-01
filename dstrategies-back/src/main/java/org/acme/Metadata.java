package org.acme;

public class Metadata {

	public Metadata() {
		super();
	}

	
	public Metadata(String version, String colour) {
		super();
		this.version = version;
		this.colour = colour;
	}

	String version;
	
	String colour;

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	
}
