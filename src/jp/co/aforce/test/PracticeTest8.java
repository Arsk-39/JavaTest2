package jp.co.aforce.test;

public class PracticeTest8 {
	//練習問題１
	public void printHello() {
		System.out.println("Hello");
	}
	//練習問題２
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
	//練習問題3,4
	
	 void printMessage(String string, int n1) {
		 String Hello = "Hello";
		int i = n1;
		for (int count = 1; count <= i; count++) {
			System.out.println(Hello);
			}
	}
	//練習問題5
	 
		void printRectangleArea(double n1, double n2) {
			double height,widht;
			height = n1;
			widht= n2;
			System.out.println(height * widht);
		}
	//練習問題6
		
		public String day() {
			int n = (int)(3*Math.random());
			String day = "";
			switch(n) {
			case 0:
				day = "今日";
				break;
			case 1:
				day = "明日";
				break;
			case 2:
				day = "明後日";
				break;
				}
			return day;
		}
		public String wea() {
			int n = (int)(4*Math.random());
			String wea = "";
			switch(n) {
			case 0:
				wea = "晴れ";
				break;
			case 1:
				wea = "曇り";
				break;
			case 2:
				wea = "雨";
				break;
			case 3:
				wea = "雪";
				}
			return wea;
		}
		public String getWeatherForecast() {
			String a = day() + "の天気は" + wea()+ "でしょう。";
			System.out.println(a);
			return a;
		}

		//練習問題7
		
		public boolean isEvenNumber(int n1) {
			int value = n1;
			if(value % 2 ==0) {
				System.out.println("true");
			}else {
				System.out.println("false");
			}
			return false;

		}

		//練習問題8
		
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
		//練習問題9
		public String getLongestString(String string, String string2, String string3) {
			String strs[] = {string, string2 ,string3};
			
			for(int i = 0; i< strs.length; i++) {
				System.out.println(strs[i]);
			}
			return null;
			}
				
			
}
