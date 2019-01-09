package lab6;

public class P6 { //zostaw to narazie zawsze mozna usunac pozniej
	public static int NWD(int pierwsza, int druga) {
	    if (druga == 0) {
	        return pierwsza;  
	    }else {
	        return NWD(druga, pierwsza%druga);  // dwóch liczb.
	    }
	}
}
