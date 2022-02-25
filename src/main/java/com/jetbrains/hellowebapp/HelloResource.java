package com.jetbrains.hellowebapp;

import jakarta.ws.rs.*;

@Path("/hello-world")
public class HelloResource {
    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello, World!";
    }

    @POST
    @Path("/{name}")
    @Produces("text/plain")
    public String customWelcome(@PathParam("name") String name) {
        return "Welcome " + name + "! We're happy you're here!";
    }
}