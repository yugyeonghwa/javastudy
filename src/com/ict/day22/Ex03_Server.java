package com.ict.day22;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Ex03_Server {
	ArrayList<Ex03_ServerClients> list;
	ServerSocket ss;

	public Ex03_Server() {
		list = new ArrayList<Ex03_ServerClients>();
		try {
			ss = new ServerSocket(7777);
			System.out.println("서버 시작 ~~~");

			play();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void play() {
		while (true) {
			try {
				Socket s = ss.accept();
				Ex03_ServerClients sc = new Ex03_ServerClients(s, this);
				new Thread(sc).start();
				list.add(sc);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void sendMsg(Ex03_Protocol p) {
		for (Ex03_ServerClients k : list) {
			try {
				k.out.writeObject(p);
			} catch (Exception e) {
			}
		}
	}

	public void removeClient(Ex03_ServerClients sc) {
		list.remove(sc);
	}

	// 그림그리기
	public void picture(Ex03_Protocol p) {
		for (Ex03_ServerClients k : list) {
			try {
				k.out.writeObject(p);
			} catch (Exception e) {
			}
		}
	}

	public static void main(String[] args) {
		new Ex03_Server();

	}
}
