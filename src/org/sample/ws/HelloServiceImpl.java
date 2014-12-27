package org.sample.ws;

import javax.jws.WebService;

@WebService(targetNamespace = "http://ws.sample.org/", portName = "HelloServiceImplPort", serviceName = "HelloServiceImplService")
public class HelloServiceImpl {

	public String getVersion() {
		return "1.0";
	}

	public String hello(String user) {
		return "Hello " + user + "!";
	}
}