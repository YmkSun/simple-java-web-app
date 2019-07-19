package com.app.controller.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

/**
 * HomeController
 * @author myokyaw.ye
 *
 */
@Path("/base")
public class HomeController {
	
	Logger logger = Logger.getLogger(HomeController.class);
	
	@GET
	@Path("hello")
	@Produces(MediaType.APPLICATION_JSON)
	public String getOTP() {
		return "Hello";
	}
		
}
