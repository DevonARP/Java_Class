package PartIV;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RollDice extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int FRAME_WIDTH = 500;
	private static final int FRAME_Height = 500;
	private static int min = 1;
	private static int max = 6;
	public int n1,n2,n3;
	JButton b0;
	JLabel result;
	
	ImagePanel graphics1;
	ImagePanel graphics2;

	
	public RollDice() {
		
		b0 = new JButton("Roll Dice");
		
		Random random=new Random();
		n1 = random.nextInt(max-min)+min;
		n2 = random.nextInt(max-min)+min;
		n3 = n1 + n2;
		String s1 = "die" + n1 + ".png";
		String s2 = "die" + n2 + ".png";
		
		JPanel superPanel = new JPanel(new BorderLayout());
		
		graphics1 = new ImagePanel(s1);
		graphics2 = new ImagePanel(s2);
		
		JPanel g1 = new JPanel();
		g1.add(graphics1);
		JPanel g2 = new JPanel();
		g2.add(graphics2);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(FRAME_WIDTH,FRAME_Height);
		setVisible(true);
		
		result = new JLabel();
		result.setText("             Result: " + n3);
		
		JPanel bottomPanel = new JPanel(new BorderLayout());
		bottomPanel.add(b0,BorderLayout.PAGE_END);
		
		superPanel.add(g1,BorderLayout.LINE_START);
		superPanel.add(g2,BorderLayout.LINE_END);
		superPanel.add(result,BorderLayout.CENTER);
		superPanel.add(bottomPanel,BorderLayout.PAGE_END);
		
		this.add(superPanel);
		
        ActionListener A1 = new ActionListener() {
        	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				n1 = random.nextInt(max-min)+min;
				n2 = random.nextInt(max-min)+min;
				n3 = n2 + n1;
				String s1 = "die" + n1 + ".png";
				String s2 = "die" + n2 + ".png";				
				result.setText("             Result: " + n3);
				
				g1.removeAll();
				g2.removeAll();
				graphics1 = new ImagePanel(s1);
				graphics2 = new ImagePanel(s2);
				g1.add(graphics1);
				g2.add(graphics2);
			}
        	
        };
        
        b0.addActionListener(A1);
        
        g1.addMouseListener(new MouseAdapter() {
        	public void mouseClicked(MouseEvent me) { 
        		n1 = random.nextInt(max-min)+min;
				n3 = n2 + n1;
				String s1 = "die" + n1 + ".png";				
				result.setText("             Result: " + n3);
				
				g1.removeAll();
				graphics1 = new ImagePanel(s1);
				g1.add(graphics1);
              } 
            }); 
        
        g2.addMouseListener(new MouseAdapter() {
        	public void mouseClicked(MouseEvent me) { 
        		n2 = random.nextInt(max-min)+min;
				n3 = n2 + n1;
				String s2 = "die" + n2 + ".png";				
				result.setText("             Result: " + n3);
				
				g2.removeAll();
				graphics2 = new ImagePanel(s2);
				g2.add(graphics2);
              } 
            }); 
        
	}

	public static void main(String[] args) {
		RollDice rollDice = new RollDice();

	
	}
}
