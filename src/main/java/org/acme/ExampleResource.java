package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * TODO.
 * <p>
 * Copyright (c) 2020, Swiss Federal Institute of Intellectual Property
 * </p>
 * @author plattner_plu
 */
@Path("/hello")
public class ExampleResource {

  @GET
  @Path("{name}")
  @Produces(MediaType.TEXT_PLAIN)
  public String hello(@PathParam("name") final String name) {
    return "hello from quarkus to " + name;
  }
}
