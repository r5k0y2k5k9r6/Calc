package jx08;

public class CalcModel {
	private String ans;
	private int n;
	public String calc(int x,int y, int sbl) {

		switch(sbl) {
		case 1:n = x + y;
		break;
		case 2:n = x - y;
		break;
		case 3:n = x * y;
		break;
		case 4:n = x / y;
		break;
		}
		ans = String.valueOf(n);
		return ans;
	}
}