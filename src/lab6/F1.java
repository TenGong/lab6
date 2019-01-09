package lab6;

import java.awt.GraphicsConfiguration;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.*;


public class F1 {

	static GraphicsConfiguration gc;
	
	static void cal() {
	JFrame frame= new JFrame(gc);
	frame.setTitle("Kalkulator");
	frame.setSize(450, 150);
	frame.setResizable(false); /// Mozliwosc zmiany wielkosci okna
	frame.setLayout(null);	
	
	JTextField t1 = new JTextField();
	t1.setBounds(10, 10, 50, 30);
	frame.add(t1);							/** stare okna wprowadzania liczb ( Ale Jarê zrobiê inny kod sprawdzaj¹cy czy wprowadzi³eœ liczbe. Poprzednie wywala³o b³¹d z czyszczeniem.   **/
	JTextField t2 = new JTextField();
	t2.setBounds(60, 10, 50, 30);
	frame.add(t2);
	
	JLabel l1 = new JLabel();
	l1.setBounds(120, 10, 400, 30);
	l1.setText("Wynik: ");
	frame.add(l1);							//Wyswietlanie wynikow
	
	JLabel l2 = new JLabel();
	l2.setBounds(10, 90, 275, 30);
	l2.setText("Autorzy: Dominik Guzia³ek, Mariusz Jackowski"); //autorzy
	frame.add(l2);
	
/**################################################# PRZYCISKI ###################################################################**/	
	
	JButton ct = new JButton();				// ct - clear text fields
	ct.setBounds(210, 45, 100, 45);
	ct.setText("Wyczyœæ");
	frame.add(ct);
	JButton b1 = new JButton();
	b1.setBounds(10, 45, 45, 45); 			//(x, y, wysokosc, szerokosc)
	b1.setText("+");
	frame.add(b1);
	JButton b2 = new JButton();
	b2.setBounds(60, 45, 45, 45); 
	b2.setText("-");
	frame.add(b2);							//jak ty se piszesz autora to se tez napisza
	JButton b3 = new JButton();				//autor duzej ilosci zmian w programie
	b3.setBounds(110, 45, 45, 45);			//Mariusz Jackowski xD
	b3.setText("*");
	frame.add(b3);
	JButton b4 = new JButton();
	b4.setBounds(160, 45, 45, 45); 
	b4.setText("/");
	frame.add(b4);

/**################################################# PRZYCISKI_END ###################################################################**/		

	frame.setVisible(true);    /// Musi byc na koncu
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	ct.addActionListener(new ActionListener() {		//usuwanie
        
		@Override
		public void actionPerformed(ActionEvent e) {																	
			t1.setText("");                                          
			t2.setText("");
			l1.setText("Wynik: ");
		}          																  
      });
	
	b1.addActionListener(new ActionListener() {		//dodawanie
        
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if( L1.Czy_liczba(t1.getText()) == "t" && L1.Czy_liczba(t2.getText()) == "t") {
			int a=Integer.parseInt(t1.getText());
			int b=Integer.parseInt(t2.getText());
			l1.setText("Wynik: " + P2.dodaj(a, b));
			} else l1.setText("Wynik: B³¹d, Czy wprowadzi³eœ coœ co nie jest liczb¹?");
		}          
      });
	
	b2.addActionListener(new ActionListener() {		//odejmowanie
        
		@Override
		public void actionPerformed(ActionEvent e) {
			if( L1.Czy_liczba(t1.getText()) == "t" && L1.Czy_liczba(t2.getText()) == "t") {
			int a=Integer.parseInt(t1.getText());
			int b=Integer.parseInt(t2.getText());
			l1.setText("Wynik: " + P5.minus(a, b));			
			}
		}          
      });
	
	b3.addActionListener(new ActionListener() {		//mnozenie
        
		@Override
		public void actionPerformed(ActionEvent e) {
			if( L1.Czy_liczba(t1.getText()) == "t" && L1.Czy_liczba(t2.getText()) == "t") {
			int a=Integer.parseInt(t1.getText());
			int b=Integer.parseInt(t2.getText());
			l1.setText("Wynik: " + P3.multi(a, b));	
			} else l1.setText("Wynik: B³¹d, Czy wprowadzi³eœ coœ co nie jest liczb¹?");
		}          
      });
	
	b4.addActionListener(new ActionListener() {		//dzielenie
        
		@Override
		public void actionPerformed(ActionEvent e) {
		
		if( L1.Czy_liczba(t1.getText()) == "t" && L1.Czy_liczba(t2.getText()) == "t") {
			int a=Integer.parseInt(t1.getText());				
			int b=Integer.parseInt(t2.getText());																																							
				if(b==0) {
				l1.setText("Nie dzieli siê przez zero.");
				}	else {
							l1.setText("Wynik: " + P4.dzielenie(a, b));
						}
		} else l1.setText("Wynik: B³¹d, Czy wprowadzi³eœ coœ co nie jest liczb¹?");
			
			/*int nwd=P6.NWD(ai, bi);
			
			if(nwd==1 && bf != 0) {
			float wynik=af/bf;
			l11.setText(""+wynik);				
			}
			if(nwd !=1 && bf!=0 && af != 0) {					//zostaw to narazie chce pozniej sprobowac zrobic ulamek
				int aa=ai/nwd;									//czyli np 10/15 wynik: 2/3 = 0.66666667
				int bb=bi/nwd;
				float wynik=af/bf;
				l11.setText(""+aa+"/"+bb+" = "+wynik);
			}
			if(bf==0) {
				l11.setText("Nie dzieli siê przez zero.");
			}
			if(af == 0 && bf != 0 && nwd != 1) {
				int wynik=ai/bi;
				l11.setText(""+wynik);
			}*/
		}
      });
	}
}    		


