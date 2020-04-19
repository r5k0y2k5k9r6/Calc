package jx08;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class CalcView extends JFrame implements ActionListener {
	private CalcCtrl ctrl;
	private Container c;
	private JLabel  l1,l2;
	JTextField tf1,tf2,tf3;
	private JButton b1, b2;
	
	public CalcView() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(180, 100);
        setTitle("CalcView");		
        
        ctrl = new CalcCtrl();

        c = getContentPane();

        l1 = new JLabel("=");
        l2 = new JLabel ("");
        tf1 = new JTextField ("",3);
        tf2 = new JTextField ("",1);
        tf3 = new JTextField ("",3);
        b1 = new JButton("Calc");
        b2 = new JButton("Clear");
        
        c.setLayout(new FlowLayout());
        c.add(tf1);
        c.add(tf2);
        c.add(tf3);
        c.add(l1);
        c.add(l2);
        c.add(b1);
        c.add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1){
			String a = tf1.getText();
			String b = tf2.getText();
			String c = tf3.getText();
			l2.setText(ctrl.calc(a,b,c));
		}else if(e.getSource() == b2){
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
			l2.setText("");
		}
	}
	
	public static void main(String[] args) {
		CalcView cv =new CalcView();
		
		cv.setVisible(true);
	}
}


