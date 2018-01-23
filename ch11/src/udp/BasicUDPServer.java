package udp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class BasicUDPServer {

	DatagramSocket dsock;
	DatagramPacket sPack, rPack;
	InetAddress client;
	int sport = 7777, cport;
	
	public BasicUDPServer(int sport) {
		try {
			this.sport = sport;
			System.out.println("서버를 시작합니다.");
			System.out.println("클라이언트가 접속하길 기다리고 있습니다." + "\n");
			this.dsock = new DatagramSocket(sport);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void communicate() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while (true) {
				 byte[] buffer = new byte[1024];
				 rPack = new DatagramPacket(buffer,buffer.length);
				 dsock.receive(rPack);
				 String strIn = new String(rPack.getData(), 0, rPack.getData().length);
				 client = rPack.getAddress();
				 cport = rPack.getPort();
				 System.out.println("[클라이언트" + client + ": " + cport + "]" + strIn);
				 if(strIn.trim().equals("quit")) break;
				 String strOut = br.readLine();
				 sPack = new DatagramPacket(strOut.getBytes(), strOut.getBytes().length, client, cport);
				 dsock.send(sPack);
			}
			System.out.println("UDP 서버를 종료합니다.");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		BasicUDPServer client = new BasicUDPServer(7777);
		client.communicate();
	}
}
