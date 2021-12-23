package idl1;
import javax.jws.WebMethod;
import javax.jws.WebService;
@WebService
public class Client {
	@WebMethod
	public String sayHello()
	{
		return "Hello YOUAZ Ichrak";
	}
	@WebMethod
	public int somme(@WebParam(name="a")int a,@WebParam(nam="b") int b) 
	{
		return a+b;
	}
	@WebMethod
	public int multiplication(@WebParam(name="a")int a,@WebParam(nam="b") int b) 
	{
		return a*b;
	}
	@WebMethod
	public int soustraction(@WebParam(name="a")int a,@WebParam(nam="b") int b) 
	{
		return a-b;
	}
	@WebMethod
	public int division(@WebParam(name="a")int a,@WebParam(nam="b") int b) 
	{
		return a/b;
	}
}
