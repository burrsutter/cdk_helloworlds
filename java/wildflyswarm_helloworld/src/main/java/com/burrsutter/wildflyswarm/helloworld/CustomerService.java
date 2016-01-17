package com.burrsutter.wildflyswarm.helloworld;

import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

/**
 * REST Web Service
 *
 */
@Path("customer")
public class CustomerService {

    @Context
    UriInfo context;

    /**
     * Creates a new instance of CustomerService
     */
    public CustomerService() {
    }

    /**
     * Simple example to output request URI and hostname
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getJson() {
        String text = "WildFly Swarm Docker REST Endpoint " + context.getBaseUri() + " - Hostname: " + System.getenv().get("HOSTNAME") + "";
        return "{\"text\":\"" + text + "\"}";

    }

}
