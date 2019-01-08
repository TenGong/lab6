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
	frame.setSize(300, 150);
	frame.setResizable(false); /// Mozliwosc zmiany wielkosci okna
	frame.setLayout(null);	
	
	JTextField t1 = new JTextField();
	t1.setBounds(10, 10, 50, 30);
	frame.add(t1);
	JTextField t2 = new JTextField();
	t2.setBounds(60, 10, 50, 30);
	frame.add(t2);
	
	JLabel l1 = new JLabel();
	l1.setBounds(110, 10, 45, 30);
	l1.setText("Wynik: ");
	frame.add(l1);							//Wyswietlanie wynikow
	JLabel l11 = new JLabel();
	l11.setBounds(155, 10, 100, 30);
	l11.setText("cos");
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
				
			l1.setText("Name has been submitted.");				
		}          
      });
	b2.addActionListener(new ActionListener() {		//odejmowanie
        
		@Override
		public void actionPerformed(ActionEvent arg0) {
				l1.setText("Name has been submitted.");				
		}          
      });
	b3.addActionListener(new ActionListener() {		//mnozenie
        
		@Override
		public void actionPerformed(ActionEvent arg0) {
				l1.setText("Name has been submitted.");				
		}          
      });
	b4.addActionListener(new ActionListener() {		//dzielenie
        
		@Override
		public void actionPerformed(ActionEvent arg0) {
				l1.setText("Name has been submitted.");				
		}          
      });
	}    		
}

