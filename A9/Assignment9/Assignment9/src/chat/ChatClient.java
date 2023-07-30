package chat;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class ChatClient extends JFrame  {
  // IO streams
  DataOutputStream toServer = null;
  DataInputStream fromServer = null;
  JTextField textField = null;
  JTextArea textArea = null;
  Socket socket = null;
  JButton openButton;
  JButton closeButton;
  
  public ChatClient() {
	  super("ChatClient");
	  textField = new JTextField(5);
	  textArea = new JTextArea(30,30);
	  JScrollPane sp = new JScrollPane(textArea);
	  
	  this.setLayout(new BorderLayout());
	  //this.add(textField, BorderLayout.NORTH);
	  textField.addActionListener(new TextFieldListener());

	  JPanel topPanel = new JPanel(new GridLayout(2,1));
	  JPanel controlPanel = new JPanel();
	  topPanel.add(textField);
	  openButton = new JButton("Open Connection");
	  closeButton = new JButton("Close Connection");
	  controlPanel.add(openButton);
	  controlPanel.add(closeButton);
	  topPanel.add(controlPanel);
	  this.add(topPanel, BorderLayout.NORTH);

	  this.add(sp, BorderLayout.CENTER);
	  closeButton.addActionListener((e) -> { try { socket.close(); textArea.append("connection closed" + '\n');} catch (Exception e1) {System.err.println("error"); }});
	  openButton.addActionListener(new OpenConnectionListener());
      setSize(400, 200);
  }
  
  class OpenConnectionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
			socket = new Socket("localhost", 9898);
			textArea.append("connected" + '\n');
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			textArea.append("connection Failure" + '\n');
		}
	}
	  
  }
  
  class TextFieldListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		//Socket socket = null;
	    try {
		      // Create a socket to connect to the server
		      //socket = new Socket("localhost", 8000);
		      // Socket socket = new Socket("130.254.204.36", 8000);
		      // Socket socket = new Socket("drake.Armstrong.edu", 8000);

		      // Create an input stream to receive data from the server
		      fromServer = new DataInputStream(socket.getInputStream());

		      // Create an output stream to send data to the server
		      toServer = new DataOutputStream(socket.getOutputStream());
		    }
		    catch (IOException ex) {
		      textArea.append(ex.toString() + '\n');
		    }
	    
	    try {
	        // Get the radius from the text field
	        String msg = textField.getText().trim();
	  
	        // Send the radius to the server
	        toServer.writeUTF(msg);
	        toServer.flush();
	  
	        // Get area from the server
	        String out = fromServer.readUTF();
	  
	        // Display to the text area
	        textArea.setText(out);
	        //textArea.append(out);
	        //socket.close();
	      }
	      catch (IOException ex) {
	        System.err.println(ex);
	      }
	    
	  

		
	}
  }
  
  
	  

  public static void main(String[] args) {
    ChatClient c = new ChatClient();
    c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    c.setVisible(true);
  }
}
