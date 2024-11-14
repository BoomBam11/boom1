package practice2;

class Toggle{
	
public static void main(String[] args) {
	// TODO Auto-generated method stub
	String s ="AppA CHa ViSay LAy HaRD YE";
	String res ="";
	
	for(int i = 0;i<s.length();i++) {
		char ch = s.charAt(i);
		if(ch>='a' && ch<='z') {
			res = res + (char) (ch-32);
		}else if(ch>='A' && ch<='Z'){
			res = res + (char) (ch+32);
		}
		else {
			res = res+ch;
		}
		
	}
	System.out.println(res);

}

}