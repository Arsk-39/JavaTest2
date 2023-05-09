package jp.co.aforce.test;

public class printRandomMessage {
	public void  printRandomMessage() {
		int n = (int)(3*Math.random());
		switch(n) {
		case 0:
			System.out.println("こんばんは");
			break;
		case 1:
			System.out.println("こんにちは");
			break;
		case 2:
			System.out.println("おはよう");
			break;
		}
	}
	
	
}
