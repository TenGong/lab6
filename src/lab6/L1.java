package lab6;

import java.util.regex.*; ;

public class L1 {
		
	static String Czy_liczba(String a) {
		String t = "";
		boolean liczba = Pattern.matches("[0-9]", a);
		if(liczba!=true) {
			 t = "n";
		} else {
			 t = "t";
		}
			return t;
	}
	
}
