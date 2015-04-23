package cn.edu.ahpu.ws.demo.c_cxf_03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/spring/ClientBeans.xml");
		IExpressService service = (IExpressService) context.getBean("expressService");
		System.out.println(service.showSTODetails("968646983186"));
	}
}
