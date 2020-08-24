package webService;

import javax.xml.ws.Endpoint;

public class MainWS {

	public static void main(String[] args) {
		ConsultaExameWS service = new ConsultaExameWS();
		String url = "http://localhost:8080/SOCTest";
		
		Endpoint.publish(url, service);
	}

}
