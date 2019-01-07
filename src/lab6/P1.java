package lab6;

public class P1 {

	public static void main(String[] args) {
		int a = 1,b = 2;
		System.out.println("############### TEST ###########");         ///Autor Dominik Guzia³ek
		float dodawanie, odejmowanie, mno¿enie, dzielenie;
		dodawanie = P2.dodawanie(a,b);
		odejmowanie = P5.minus(a,b);
		mno¿enie = P3.multi(a,b);
		dzielenie = P4.sqrt(a,b);
		System.out.println("Wynik dodawania " + a + "+" + b + "=" + dodawanie);
		System.out.println("Wynik odejmowania " + a + "-" + b + "=" + odejmowanie);
		System.out.println("Wynik mno¿enia " + a + "*" + b + "=" + mno¿enie);
		System.out.println("Wynik dzielenia " + a + "/" + b + "=" + dzielenie);
		
	}

}
