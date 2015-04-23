package cn.edu.ahpu.ws.wsimport;

public class App {
	
	/**
	 * 通过wsimport解析wsdl生成客户端代码调用webservice服务	
	 * 
	 */
	public static void main(String[] args) {
		HelloServiceService hss = new HelloServiceService();
		HelloService service = hss.getHelloServicePort();
		System.out.println(service.sayHello("张三"));
	}
}
