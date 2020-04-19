package jx08;

public class CalcCtrl {
	private CalcModel mdl;
	
	CalcCtrl(){
		mdl = new CalcModel();
	}
	
	public String calc(String a,String b,String c) {
		int x = Integer.parseInt(a);
		int y = Integer.parseInt(c);
		int sbl=1;
		String ans;
		
		if(b.equals("+")) {
			sbl = 1;
		}else if(b.equals("-")) {
			sbl = 2;
		}else if(b.equals("*")) {
			sbl = 3;
		}else if(b.equals("/")) {
			sbl = 4;
		}
		
		ans = mdl.calc(x,y,sbl);
		return ans;
	}
}


