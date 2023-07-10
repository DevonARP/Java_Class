package calculator;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends  JFrame {
	
	JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, plus, minus, multiply, divide, equal, decimal, clear, signChange;
	JTextField result;

	private String firstTerm = "0";
	private String secondTerm = "0";
	private int change = 0;
	private char symbol = '0';
	
	private static final int FRAME_WIDTH = 200;
	private static final int FRAME_Height = 250;
	
	public Calculator() {
		buttons();
		createPanel();
	}
	
	public void buttons() {
		
		b0 = new JButton("0");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		plus = new JButton("+");
		minus = new JButton("-");
		multiply = new JButton("*");
		divide = new JButton("/");
		equal = new JButton("=");
		decimal = new JButton(".");
		clear = new JButton("C");
		signChange = new JButton("+/-");
		result = new JTextField(16);
		result.setText("0");
		result.setEditable(true);
		
	}
	
	public void createPanel() {
		JPanel superPanel = new JPanel();
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4,4));
		panel.add(b7);
		panel.add(b8);
		panel.add(b9);
		panel.add(divide);
		panel.add(b4);
		panel.add(b5);
		panel.add(b6);
		panel.add(multiply);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(minus);
		panel.add(b0);
		panel.add(decimal);
		panel.add(signChange);
		panel.add(plus);
		JPanel bottomPanel = new JPanel();
		bottomPanel.add(clear);
		bottomPanel.add(equal);
		superPanel.add(result,BorderLayout.NORTH);
		superPanel.add(panel,BorderLayout.CENTER);
		superPanel.add(bottomPanel,BorderLayout.SOUTH);
		this.add(superPanel);
		
		JMenuBar menubar = new JMenuBar();
		JMenu menu = new JMenu("File");
		JMenuItem exit = new JMenuItem("Exit");
		menu.add(exit);
		menubar.add(menu);
		exit.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent event) {
	            System.exit(0);
	        }
	    });
		
		this.setJMenuBar(menubar);
		
        ActionListener A1 = new ActionListener() {
        	
        	
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String s = e.getActionCommand();

				if (Character.isDigit(s.charAt(0))) {
					if(change==0) {
						result.setText(result.getText() + s.charAt(0));
						firstTerm = firstTerm + s.charAt(0);
					}
					else {
						result.setText(result.getText() + s.charAt(0));
						secondTerm = secondTerm + s.charAt(0);
					}

				}
				
				if (s.charAt(0)=='.') {
					if(change==0) {
						if(firstTerm.contains(".")) {
							
						}
						else {
							result.setText(result.getText() + s.charAt(0));
							clear.setText("C");
							firstTerm = firstTerm + s.charAt(0);
						}

					}
					else {
						if(secondTerm.contains(".")) {
							
						}
						else {
							result.setText(result.getText() + s.charAt(0));
							clear.setText("C");
							secondTerm = secondTerm + s.charAt(0);
						}

					}
				}
				if(s.charAt(0)=='+' && s.length()==1) {
					if(change==0) {
						symbol = '+';
						result.setText(result.getText() + s.charAt(0));
						clear.setText("C");
						change = 1;
					}
					
				}
				if(s.charAt(0)=='-') {
					if(change==0) {
						symbol = '-';
						result.setText(result.getText() + s.charAt(0));
						clear.setText("C");
						change = 1;
					}
				}
				if(s.charAt(0)=='/') {
					if(change==0) {
						symbol = '/';
						result.setText(result.getText() + s.charAt(0));
						clear.setText("C");
						change = 1;
					}
				}
				if(s.charAt(0)=='*') {
					if(change==0) {
						symbol = '*';
						result.setText(result.getText() + s.charAt(0));
						clear.setText("C");
						change = 1;
					}
				}
				if(s.length()==3) {
					if(change==0) {
						double dummy = Double.valueOf(firstTerm) * -1;
						firstTerm =  Double.toString(dummy);
						clear.setText("C");
						result.setText(firstTerm);
					}
					else {
						double dummy = Double.valueOf(secondTerm) * -1;
						secondTerm =  Double.toString(dummy);
						clear.setText("C");
						result.setText(firstTerm + symbol + secondTerm);
					}
				}
				if(s.charAt(0)=='=') {
					if(symbol=='+') {
						double dummy = Double.valueOf(firstTerm) + Double.valueOf(secondTerm);
						firstTerm =  Double.toString(dummy);
						secondTerm = "0";
						change = 0;
						symbol = '+';
						clear.setText("C");
						result.setText(firstTerm);
					}
					if(symbol=='-') {
						double dummy = Double.valueOf(firstTerm) - Double.valueOf(secondTerm);
						firstTerm =  Double.toString(dummy);
						secondTerm = "0";
						change = 0;
						symbol = '-';
						clear.setText("C");
						result.setText(firstTerm);
					}
					if(symbol=='*') {
						double dummy = Double.valueOf(firstTerm) * Double.valueOf(secondTerm);
						firstTerm =  Double.toString(dummy);
						secondTerm = "0";
						change = 0;
						symbol = '*';
						clear.setText("C");
						result.setText(firstTerm);
					}
					if(symbol=='/') {
						double dummy = Double.valueOf(firstTerm) / Double.valueOf(secondTerm);
						firstTerm =  Double.toString(dummy);
						secondTerm = "0";
						change = 0;
						symbol = '/';
						clear.setText("C");
						result.setText(firstTerm);
					}
					
				}
				if(s.charAt(0)=='C') {
					secondTerm = "0";
					change = 0;
					symbol = '0';
					clear.setText("AC");;
					result.setText(firstTerm);
				}
				
				if(s.length()==2) {
					secondTerm = "0";
					firstTerm = "0";
					change = 0;
					symbol = '0';
					clear.setText("C");
					result.setText("0");
				}
				
				
			}
        	
        };
		
        b0.addActionListener(A1);
        b1.addActionListener(A1);
        b2.addActionListener(A1);
        b3.addActionListener(A1);
        b4.addActionListener(A1);
        b5.addActionListener(A1);
        b6.addActionListener(A1);
        b7.addActionListener(A1);
        b8.addActionListener(A1);
        b9.addActionListener(A1);
		plus.addActionListener(A1);
		minus.addActionListener(A1);
		multiply.addActionListener(A1);
		divide.addActionListener(A1);
		equal.addActionListener(A1);
		decimal.addActionListener(A1);
		clear.addActionListener(A1);
		signChange.addActionListener(A1);
		
	}
	
	public static void main(String[] args) {
		JFrame frame = new Calculator();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(FRAME_WIDTH,FRAME_Height);
		frame.setVisible(true);
	}
}
