package org.system;

public class Desktop {
	public void desktopSize() {
		System.out.println("Desktop size is 18inch");

	}
	public static void main(String[] args) {
		Computer com=new Computer(); //Single-level Inheritance
		com.computerModel();
		
		Desktop desk=new Desktop();
		desk.desktopSize();
		
	}
}
