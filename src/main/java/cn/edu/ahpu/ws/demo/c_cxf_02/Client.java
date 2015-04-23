package cn.edu.ahpu.ws.demo.c_cxf_02;

public class Client {
	public static void main(String[] args) {
		IHelloServiceService ihss = new IHelloServiceService();
		IHelloService service = ihss.getIHelloServicePort();
		System.out.println(service.sayHello("¡Ù√˚"));
	}
}
