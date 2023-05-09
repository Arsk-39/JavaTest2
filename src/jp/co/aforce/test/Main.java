package jp.co.aforce.test;

public class Main {
	public static void main(String[] args) {
	PracticeTest8 hello = new PracticeTest8();
	Person person = new Person("有坂" , 19);
	//練習問題1
	hello.printHello();
	//練習問題2
	hello.printRandomMessage();
	//練習問題4
	hello.printMessage("Hello",5);
	//練習問題5
	hello.printRectangleArea(10.5, 5);
	//練習問題6
	hello.getWeatherForecast();
	//練習問題7
	hello.isEvenNumber(3);
	//練習問題8
	hello.getMessage("佐藤", 19);
	//練習問題9
	hello.getLongestString("みかん","なし","りんご");
	//練習問題10 
	person.isAdult();
	
	}
}
