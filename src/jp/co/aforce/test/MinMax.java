package jp.co.aforce.test;

public class MinMax {
	
	public int  getMaxValue(int a1, int b1, int c1) {
		int max = a1;
		if (max < b1) {
			max = b1;
		}
		if(max < c1){
			max = c1;
		}
		return max;
	}
	
	public int getMinValue(int a1, int b1, int c1) {
		int min = a1;
		if (min > b1) {
			min = b1;
		}
		if(min > c1){
			min = c1;
		}
		return min;
	}


}
