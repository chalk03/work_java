package udp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class BasicUDPClient {

	DatagramSocket dsock;
	DatagramPacket sPack, rPack;
	InetAddress server;
	int port = 8888;

	public BasicUDPClient(String ip, int port) {
		try {
			server = InetAddress.getByName(ip);
			this.port = port;
			this.dsock = new DatagramSocket();
			System.out.println("서버를 접속합니다.");
			System.out.println("서버에 전달할 메시지를 쓰고 Enter를 누르세요.");
			System.out.println("종료하려면 quit를 쓰고 Enter를 누루세요." + "\n");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void communicate() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String strOut = null;
			while ((strOut = br.readLine()) != null) {
				sPack = new DatagramPacket(strOut.getBytes(), strOut.getBytes().length, server, port);
				dsock.send(sPack);
				if (strOut.equals("quit"))
					break;
				
				byte[] buffer = new byte[1024];
				rPack = new DatagramPacket(buffer, buffer.length);
				dsock.receive(rPack);
				String strIn = new String(rPack.getData(), 0, rPack.getData().length);
				System.out.println("[서버" + server + ": " + port + "]" + strIn);
			}
			System.out.println("UDP 클라이언트를 종료합니다.");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		BasicUDPClient client = new BasicUDPClient("127.0.0.1", 7777);
		client.communicate();
	}
}
