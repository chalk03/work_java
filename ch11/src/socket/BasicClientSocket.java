package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class BasicClientSocket {

	public static void main(String[] args) {
		try {
			Socket mySocket = new Socket("127.0.0.1", 7070);
			System.out.println(">> 서버 접속에 성공했습니다.");
			
			BufferedReader in = new BufferedReader(new InputStreamReader(mySocket.getInputStream()));
			PrintWriter out = new PrintWriter(new OutputStreamWriter(mySocket.getOutputStream()));
			
			String msg = "안녕하세요? 클라이언트입니다.";
			out.println(msg);
			out.flush();
			System.out.println("[클라이언트]" + msg);
			
			System.out.println("[서버] " + in.readLine());
			
			mySocket.close();
		} catch(IOException e) {
			System.out.println(e.toString());
		}
	}
}
