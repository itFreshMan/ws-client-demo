package cn.edu.ahpu.ws.wsimport;

public class App {
	
	/**
	 * ͨ��wsimport����wsdl���ɿͻ��˴������webservice����	
	 * 
	 */
	public static void main(String[] args) {
		HelloServiceService hss = new HelloServiceService();
		HelloService service = hss.getHelloServicePort();
		System.out.println(service.sayHello("����"));
	}
}
