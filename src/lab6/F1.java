package lab6;

import java.awt.GraphicsConfiguration;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;
import javax.swing.text.PlainDocument;

public class F1 {

	static GraphicsConfiguration gc;
	
	static void cal() {
	JFrame frame= new JFrame(gc);
	frame.setTitle("Kalkulator");
	frame.setSize(310, 200);
	frame.setResizable(false); /// Mozliwosc zmiany wielkosci okna
	frame.setLayout(null);	

	 JTextField t1 = new JTextField(10);
	 t1.setBounds(10, 10, 50, 30);
	 frame.add(t1);
     PlainDocument doc = (PlainDocument) t1.getDocument();
     doc.setDocumentFilter(new MyIntFilter());
     															//mozliwosc dodawania tylko typu integer(int)
	 JTextField t2 = new JTextField(10);						//jest jednak problem nie mozna za pomoca backspace
	 t2.setBounds(61, 10, 50, 30);								//usunac wszystkich liczb zostanie 1-na i by ja zmienic
	 frame.add(t2);												//nalezy ja zaznaczyc by zmienic ja na inna
     PlainDocument docc = (PlainDocument) t2.getDocument();		//jak wpadniesz na pomysl jak to naprawic to
     docc.setDocumentFilter(new MyIntFilter());					//prosze bardzo teraz ide robic rownania
	
	/*
	JTextField t1 = new JTextField();
	t1.setBounds(10, 10, 50, 30);
	frame.add(t1);							//stare okna wprowadzania liczb
	JTextField t2 = new JTextField();
	t2.setBounds(60, 10, 50, 30);
	frame.add(t2);
	*/
	JLabel l1 = new JLabel();
	l1.setBounds(120, 26, 45, 30);
	l1.setText("Wynik: ");
	frame.add(l1);							//Wyswietlanie wynikow
	JLabel l11 = new JLabel();
	l11.setBounds(165, 26, 150, 30);
	l11.setText("");
	frame.add(l11);
	
	JLabel l2 = new JLabel();
	l2.setBounds(37, 140, 275, 30);
	l2.setText("Autorzy: Dominik Guzia�ek, Mariusz Jackowski"); //autorzy
	frame.add(l2);
	
	JButton ct = new JButton();				// ct - clear text fields
	ct.setBounds(10, 42, 101, 30);
	ct.setText("Wyczy��");
	frame.add(ct);
	
	JButton b1 = new JButton();
	b1.setBounds(10, 85, 45, 45); 			//(x, y, wysokosc, szerokosc)
	b1.setText("+");
	frame.add(b1);
	JButton b2 = new JButton();
	b2.setBounds(60, 85, 45, 45); 
	b2.setText("-");
	frame.add(b2);							//jak ty se piszesz autora to se tez napisza
	JButton b3 = new JButton();				//autor duzej ilosci zmian w programie
	b3.setBounds(110, 85, 45, 45);			//Mariusz Jackowski xD
	b3.setText("*");
	frame.add(b3);
	JButton b4 = new JButton();
	b4.setBounds(160, 85, 45, 45); 
	b4.setText("/");
	frame.add(b4);
	
	frame.setVisible(true);    /// Musi byc na koncu
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	ct.addActionListener(new ActionListener() {		//usuwanie
        
		@Override
		public void actionPerformed(ActionEvent arg0) {
			t1.setText("");								//chcialem dodac przycisk by usuwac zawartosc pol tekstowych
			t2.setText("");								//jak wpadniesz jak to narawic by dzialalo to super
		}          										//je�eli nie to 5 minut i da si� zmieni� layout to tyle na dzis
      });
	
	b1.addActionListener(new ActionListener() {		//dodawanie
        
		@Override
		public void actionPerformed(ActionEvent arg0) {
			int a=Integer.parseInt(t1.getText());
			int b=Integer.parseInt(t2.getText());
			int wynik=a+b;
			l11.setText(""+wynik);				
		}          
      });
	b2.addActionListener(new ActionListener() {		//odejmowanie
        
		@Override
		public void actionPerformed(ActionEvent arg0) {
			int a=Integer.parseInt(t1.getText());
			int b=Integer.parseInt(t2.getText());
			int wynik=a-b;
			l11.setText(""+wynik);			
		}          
      });
	b3.addActionListener(new ActionListener() {		//mnozenie
        
		@Override
		public void actionPerformed(ActionEvent arg0) {
			int a=Integer.parseInt(t1.getText());
			int b=Integer.parseInt(t2.getText());
			int wynik=a*b;
			l11.setText(""+wynik);		
		}          
      });
	b4.addActionListener(new ActionListener() {		//dzielenie
        
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			int ai=Integer.parseInt(t1.getText());				//ai to wartosc z pierwszego okna textowego jako integer
			int bi=Integer.parseInt(t2.getText());				//ai to samo tylko 2 okno
			
			float af=Float.parseFloat(t1.getText());			//af to wartosc z drugiefo okna textowego jako float
			float bf=Float.parseFloat(t2.getText());			//bf to samo tylko 2 okno
			int nwd=NWD(ai,bi);
			
			if(nwd==1 && bf != 0) {
			float wynik=af/bf;
			l11.setText(""+wynik);				
			}
			if(nwd !=1 && bf!=0 && af != 0) {
				int aa=ai/nwd;
				int bb=bi/nwd;
				float wynik=af/bf;
				l11.setText(""+aa+"/"+bb+" = "+wynik);
			}
			if(bf==0) {
				l11.setText("Nie dzieli si� przez zero.");
			}
			if(af == 0 && bf != 0 && nwd != 1) {
				int wynik=ai/bi;
				l11.setText(""+wynik);
			}
		}
      });
	}
	
	public static int NWD(int pierwsza, int druga) {
	    if (druga == 0) {
	        return pierwsza;  
	    }else {
	        return NWD(druga, pierwsza%druga);  // dw�ch liczb.
	    }
	}
	}    		

/****************************************klasa do filtru Integer(int)*******************************************/

class MyIntFilter extends DocumentFilter {				//found on stackoverflow by user 'Hovercraft Full Of Eels' I think
	   @Override
	   public void insertString(FilterBypass fb, int offset, String string,
	         AttributeSet attr) throws BadLocationException {

	      Document doc = fb.getDocument();
	      StringBuilder sb = new StringBuilder();
	      sb.append(doc.getText(0, doc.getLength()));
	      sb.insert(offset, string);

	      if (test(sb.toString())) {
	         super.insertString(fb, offset, string, attr);
	      } else {
	         // warn the user and don't allow the insert
	      }
	   }

	   private boolean test(String text) {
	      try {
	         Integer.parseInt(text);
	         return true;
	      } catch (NumberFormatException e) {
	         return false;
	      }
	   }

	   @Override
	   public void replace(FilterBypass fb, int offset, int length, String text,
	         AttributeSet attrs) throws BadLocationException {

	      Document doc = fb.getDocument();
	      StringBuilder sb = new StringBuilder();
	      sb.append(doc.getText(0, doc.getLength()));
	      sb.replace(offset, offset + length, text);

	      if (test(sb.toString())) {
	         super.replace(fb, offset, length, text, attrs);
	      } else {
	         // warn the user and don't allow the insert
	      }

	   }

	   @Override
	   public void remove(FilterBypass fb, int offset, int length)
	         throws BadLocationException {
	      Document doc = fb.getDocument();
	      StringBuilder sb = new StringBuilder();
	      sb.append(doc.getText(0, doc.getLength()));
	      sb.delete(offset, offset + length);

	      if (test(sb.toString())) {
	         super.remove(fb, offset, length);
	      } else {
	         // warn the user and don't allow the insert
	      }

	   }
	}

