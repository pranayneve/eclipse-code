package com.lti.webservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class WebService1 {
	@GET
	@Produces(MediaType.TEXT_XML)
	@Path("/p1")
	public String showmessage1() {
		return "<?xml version=\"1.0\"?>"+ "<hello>Hello Jersey some changes now thode changes aur daal diye jaye"+"</hello>";	
	}
	@GET
	@Path("/p2")
	@Produces(MediaType.TEXT_PLAIN)
	public String sayXMLhello() {
		return "Hello";
	}
	@GET
	@Path("/p3")
	@Produces(MediaType.TEXT_HTML)
	public String sayHTMLhello() {
		return "<html> "+" <title> "+"Hello Jersey"+"</title>"+"<body><h1>"+"Hello Jersey html"+"</h1></body>"+"</html>";
	}
	@GET
	@Path("/p4")
	public int showmessage4(@QueryParam("num1") int num1,@QueryParam("num2") int num2) {
		int c;
		c=num1+num2;
		return c;
	}
	
}
