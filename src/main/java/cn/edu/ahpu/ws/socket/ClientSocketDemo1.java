package cn.edu.ahpu.ws.socket;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientSocketDemo1 {
	public static void main(String[] args) throws Exception {
		Socket client = new Socket("192.168.1.108",6789);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
		bw.write("³ÔÁËÂð?");
		
		bw.close();
		client.close();
	}
}
