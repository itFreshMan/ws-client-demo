package cn.edu.ahpu.ws.code;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;


/**
 * 编程方式
 * @author <a href="jhuaishuang@gmail.com">JHS</a>
 * @datetime 2015-4-22 上午11:14:40 
 * @description:
 */
public class CodeApp {
	public static void main(String[] args) throws Exception {
		/**
		 * targetNamespace="http://a_hello.demo.ws.ahpu.edu.cn/" name="HelloServiceService"
		 */
		Service service = Service.create(new URL("http://127.0.0.1:6789/hello"), new QName("http://a_hello.demo.ws.ahpu.edu.cn/","HelloServiceService"));
		
		HelloService hs = service.getPort( new QName("http://a_hello.demo.ws.ahpu.edu.cn/","HelloServicePort"), HelloService.class);
		System.out.println(hs.sayHello("张三"));
	}
}
