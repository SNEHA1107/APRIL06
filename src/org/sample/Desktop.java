package org.sample;

public class Desktop extends Computer {
	private void desktopSize() {
		System.out.println("Desktop size: 15 inch");
	}
	public static void main(String[] args) {
		Desktop D = new Desktop();
		D.computerModel();
		D.desktopSize();
	}
}
