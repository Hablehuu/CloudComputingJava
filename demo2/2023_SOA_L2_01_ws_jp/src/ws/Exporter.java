package ws;

import jakarta.xml.ws.Endpoint;

public class Exporter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endpoint.publish("http://localhost:8080/MySimpleWS/mySOAPService", new MySOAPImpl());
	}

}
