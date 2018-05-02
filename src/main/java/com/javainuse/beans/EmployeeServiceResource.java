package com.javainuse.beans;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

public class EmployeeServiceResource {
	
	public EmployeeServiceResource() {
		// TODO Auto-generated constructor stub
	}
	
	@GET
	@Path("/employee/{name}")
	public String getCustomer(@PathParam("name") String name) {
		return "Welcome " + name;
	}

}
