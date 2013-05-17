package com.xebia.cd.demo.fitnesse;

import java.net.URI;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ContextHandlerCollection;
import org.eclipse.jetty.util.resource.Resource;
import org.eclipse.jetty.webapp.WebAppContext;
import org.eclipse.jetty.xml.XmlConfiguration;

public class ServerFixture {
	
	private static final String SERVICE_WAR_PATH = "target/dependency/cd-service-war.war";
	
	private static Server httpServer;
	
	private static URI serviceBaseUri;

	public static void startServer() throws Exception {
		ContextHandlerCollection contexts = new ContextHandlerCollection();
		WebAppContext webAppContext = new WebAppContext(SERVICE_WAR_PATH, "/");
		contexts.addHandler(webAppContext);
		
		Resource serverXml = Resource.newSystemResource("jetty.xml");
		httpServer = (Server) new XmlConfiguration(serverXml.getInputStream()).configure();
		httpServer.setHandler(contexts);
		httpServer.start();
		
		int port = httpServer.getConnectors()[0].getLocalPort();
		
		serviceBaseUri = URI.create("http://localhost:" + port + "/");
	}

    public static void stopServer() throws Exception {
		httpServer.stop();
		httpServer.destroy();
	}
    
    public static void setServiceBaseUri(String serviceBaseUri) {
    	ServerFixture.serviceBaseUri = URI.create(serviceBaseUri);
    }
    
    public static URI getServiceUri() {
    	return serviceBaseUri.resolve("service");
    }
}