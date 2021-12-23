package idl1;
import javax.xml.ws.Endpoint;

public class Server {
	static final String URL="http://localhost:8701/";
	public static void main (String[]args) 
	{
		//TODO Auto-generated method stub
		System.out.println("Running...");
		Endpoint.publish(URL, new Client());
	}
}
