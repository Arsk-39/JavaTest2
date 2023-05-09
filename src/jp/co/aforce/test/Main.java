package jp.co.aforce.test;

public class Main {
	public static void main(String[] args) {
	printHello hello = new printHello();
	printRandomMessage Rmessage = new printRandomMessage();
	printMessage printMessage = new printMessage(); 
	printRectangleArea printRectangleArea = new printRectangleArea();
	getWeatherForecast Weather = new getWeatherForecast();
	isWcenNumber wcen = new isWcenNumber();
	getMessage Message = new getMessage();
	getLongestString Longest = new getLongestString();
	Person person = new Person("有坂",20);
	//練習問題1
	hello.printHello();
	//練習問題2
	Rmessage.printRandomMessage();
	//練習問題4
	printMessage.printMessage("Hello",5);
	//練習問題5
	printRectangleArea.printRectangleArea(10.5, 5);
	//練習問題6
	Weather.getWeatherForecast();
	//練習問題7
	wcen.isEvenNumber(3);
	//練習問題8
	Message.getMessage("佐藤", 19);
	//練習問題9
	Longest.getLongestString("みかん","なし","りんご");
	//練習問題10 
	person.isAdult();
	
	}
}
