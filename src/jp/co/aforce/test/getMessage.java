package jp.co.aforce.test;

public class getMessage {
	public String getMessage(String string,int n1) {
		String name = string;
		
		boolean isKid = n1<20;
		if(isKid) {
			System.out.println("こんにちは。" + name + "ちゃん。");
		}else {
			System.out.println("こんにちは。" + name + "さん。");
		}
		return null;
		
		

	}

}
