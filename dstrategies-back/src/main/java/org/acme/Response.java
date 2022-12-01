package org.acme;

import java.util.Set;

public class Response{
	
	private Metadata metadata;
	
	public Response() {
		super();
	}
	
	public Response(Metadata metadata) {
		super();
		this.metadata = metadata;
	}
	public Response(String version, String colour) {
		super();
		metadata = new Metadata(version, colour);
	}


	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}
}
