package cn.edu.ahpu.ws.urlConnection;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnectionTest {
	public static void main(String[] args) throws Exception {
		String soap = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:a=\"http://a_hello.demo.ws.ahpu.edu.cn/\"> "
				+ "<soapenv:Header/>"
				+ "<soapenv:Body>"
				+ "  <a:sayHello>"
				+ "   <!--Optional:-->"
				+ "   <arg0>devil</arg0>"
				+ "</a:sayHello>" + "</soapenv:Body>" + "</soapenv:Envelope>";
		
		// ·þÎñµØÖ·:
		URL url = new URL("http://127.0.0.1:6789/hello");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setDoInput(true);
		conn.setDoOutput(true);
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Content-Type", "text/xml;charset=UTF-8");

		OutputStream os = conn.getOutputStream();
		os.write(soap.getBytes());
		conn.connect();
		
		InputStream is = conn.getInputStream();
		byte b[] = new byte[1024];
		int len = 0 ;
		String s = "";
		while((len = is.read(b)) != -1){
			String ss = new String(b,0,len,"UTF-8");
			s += ss;
		}
		
		System.out.println(s);
		os.close();
		is.close();
	}
}
