package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class MsgReceiver extends Thread {
	String nickname;
	Socket socket;
	BufferedReader in;

	public MsgReceiver(String nickname, Socket socket) {
		this.nickname ="[" + nickname + "]";
		this.socket = socket;
		try {
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}

	@Override
	public void run() {
		while (in != null) {
			try {
				String msg = in.readLine();
				System.out.println(msg);
				if (msg.equals("quit"));
				in.close();
				in = null;
				System.exit(0);
				
			} catch (IOException e) {
				System.out.println(e.toString());
			}
		}
	}
}
