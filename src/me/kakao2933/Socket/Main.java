package me.kakao2933.Socket;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Process running..");
		
		new Server().start(); // Start Server Thread
		new Client().start(); // Start Client Thread
		
		System.out.println("End of main method");
		
	}
	
}
