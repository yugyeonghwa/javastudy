package com.ict.day22;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Ex01_ServerClients implements Runnable {
	Socket s;
	Ex01_Server server;

	// 직렬화 (대상클래스(vo), ObjectInputStream, ObjectOutputStream)
	ObjectInputStream in;
	ObjectOutputStream out;
	String nickName;

	public Ex01_ServerClients(Socket s, Ex01_Server server) {
		this.s = s;
		this.server = server;
		try {
			in = new ObjectInputStream(s.getInputStream());
			out = new ObjectOutputStream(s.getOutputStream());

		} catch (Exception e) {
		}
	}
	
	// 클라이언트가 보낸 프로토콜, 메세지 받기
	@Override
	public void run() {
		esc : while (true) {
			try {
				// 역직렬화
				Object obj = in.readObject();
				if (obj != null) {
					Ex01_Protocol p = (Ex01_Protocol) obj;
					switch (p.getCmd()) {
					case 0:	// 접속해제 (while 문 밖에서 처리)
						// 받은 정보는 그대로 자신에게 보냄
						out.writeObject(p);
						break esc;
					case 1:	// 대화명
						nickName = p.getMsg();
						// 메세지 전달
						p.setCmd(2);
						p.setMsg(nickName + "님 입장");
						server.sendMsg(p);
						break;
					case 2:
						p.setMsg(nickName + " : " + p.getMsg());
						server.sendMsg(p);
						break;

					}
				}
			} catch (Exception e) {
			}
		}
		try {
			// cmd = 0 이면 접속해제이므로 아래 코딩을 실행
			out.close();
			in.close();
			s.close();
			
			// 자기자신은 리스트에서 제외
			server.removeClient(this);
			// 자신을 제외한 사람들에게는 메세지 전달을 하자
			Ex01_Protocol p = new Ex01_Protocol(2, nickName + "님 퇴장");
		
			server.sendMsg(p);
		} catch (Exception e) {
		}
	}
}
