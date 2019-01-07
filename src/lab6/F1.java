package lab6;

import java.awt.GraphicsConfiguration;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class F1 {

	static GraphicsConfiguration gc;
	
	static void cal() {
	JFrame frame= new JFrame(gc);
	frame.setTitle("Kalkulator");
	frame.setSize(300, 150);
	frame.setResizable(false); /// Mo¿liwoœæ zmiany wielkoœci okna
	frame.setLayout(null);	
	
	JTextField t1 = new JTextField();
	t1.setBounds(10, 10, 50, 30);
	frame.add(t1);
	JTextField t2 = new JTextField();
	t2.setBounds(60, 10, 50, 30);
	frame.add(t2);
	
	JLabel l1 = new JLabel();
	l1.setBounds(110, 10, 100, 30);
	l1.setText("Wynik: ");
	frame.add(l1);
	JLabel l2 = new JLabel();
	l2.setBounds(150, 90, 150, 30);
	l2.setText("Autor: Dominik Guzia³ek");
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
	
	frame.setVisible(true);    /// Musi byæ na koñcu
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
