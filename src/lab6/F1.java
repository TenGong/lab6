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
	frame.setSize(300, 150);
	frame.setResizable(false); /// Mozliwosc zmiany wielkosci okna
	frame.setLayout(null);	

	 JTextField t1 = new JTextField(10);
	 t1.setBounds(10, 10, 50, 30);
	 frame.add(t1);
     PlainDocument doc = (PlainDocument) t1.getDocument();
     doc.setDocumentFilter(new MyIntFilter());
     															//mozliwosc dodawania tylko typu integer(int)
	 JTextField t2 = new JTextField(10);						//jest jednak problem nie mozna za pomoca backspace
	 t2.setBounds(60, 10, 50, 30);								//usunac wszystkich liczb zostanie 1-na i by ja zmienic
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
	l1.setBounds(110, 10, 45, 30);
	l1.setText("Wynik: ");
	frame.add(l1);							//Wyswietlanie wynikow
	JLabel l11 = new JLabel();
	l11.setBounds(155, 10, 100, 30);
	l11.setText("");
	frame.add(l11);
	
	JLabel l2 = new JLabel();
	l2.setBounds(40, 90, 250, 30);
	l2.setText("Autor: Dominik Guzia³ek, Mariusz Jackowski"); //autorzy
	frame.add(l2);
	
	JButton b1 = new JButton();
	b1.setBounds(10, 45, 45, 45); //// pozycja x y oraz rozmiar h w
	b1.setText("+");
	frame.add(b1);
	
	JButton b2 = new JButton();
	b2.setBounds(60, 45, 45, 45); 
	b2.setText("-");
	frame.add(b2);
	JButton b3 = new JButton();
	b3.setBounds(110, 45, 45, 45);
	b3.setText("*");
	frame.add(b3);
	JButton b4 = new JButton();
	b4.setBounds(160, 45, 45, 45); 
	b4.setText("/");
	frame.add(b4);
	
	frame.setVisible(true);    /// Musi byc na koncu
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	b1.addActionListener(new ActionListener() {		//dodawanie
        
		@Override
		public void actionPerformed(ActionEvent arg0) {
			/*int a=t1;
			int b=t2;
			int wynik=a+b;*/
			l11.setText("Name has been submitted.");				
		}          
      });
	b2.addActionListener(new ActionListener() {		//odejmowanie
        
		@Override
		public void actionPerformed(ActionEvent arg0) {
				l11.setText("Name has been submitted.");				
		}          
      });
	b3.addActionListener(new ActionListener() {		//mnozenie
        
		@Override
		public void actionPerformed(ActionEvent arg0) {
				l11.setText("Name has been submitted.");				
		}          
      });
	b4.addActionListener(new ActionListener() {		//dzielenie
        
		@Override
		public void actionPerformed(ActionEvent arg0) {
				l11.setText("Name has been submitted.");				
		}          
      });
	}    		
}

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

