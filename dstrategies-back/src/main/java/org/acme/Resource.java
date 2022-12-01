package org.acme;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/dstrategies-back")
public class Resource {
	
	@ConfigProperty(name = "application.version", defaultValue="none") 
	String version;
	
	@ConfigProperty(name = "application.colour", defaultValue="none") 
	String colour;

    @GET
    public Response response() {

        final Response response = new Response(version, colour);

        return response;
    }
}