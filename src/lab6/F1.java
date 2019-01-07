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
	frame.setSize(300, 400);
	frame.setResizable(false); /// Mo¿liwoœæ zmiany wielkoœci okna
	frame.setLayout(null);	
	
	JTextField t1 = new JTextField();
	t1.setBounds(110, 50, 130, 30);
	frame.add(t1);
	
	JLabel l1 = new JLabel();
	l1.setBounds(10, 50, 75, 45);
	l1.setText("Zmienna A=");
	frame.add(l1);
	
	JButton b1 = new JButton();
	b1.setBounds(30, 100, 45, 45); //// pozycja x y oraz rozmiar h w
	b1.setText("+");
	frame.add(b1);
	
	frame.setVisible(true);    /// Musi byæ na koñcu
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
