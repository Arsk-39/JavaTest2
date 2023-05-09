package jp.co.aforce.test;

public class getWeatherForecast {
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

	}


