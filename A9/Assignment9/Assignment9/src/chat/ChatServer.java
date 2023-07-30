package chat;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.*;




public class ChatServer extends JFrame implements Runnable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int port = 9898;
	private static int WIDTH = 400;
	private static int HEIGHT = 300;
	private JTextArea ta;
	private int clientNo = 0;
	private String allMessages = "";
	
	public ChatServer() {
		super("Chat Server");
		this.setSize(ChatServer.WIDTH, ChatServer.HEIGHT);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu();
		ta = new JTextArea(10,10);
		JScrollPane sp = new JScrollPane(ta);
		this.add(sp);
		this.setVisible(true);
		Thread t = new Thread(this);
		t.start();
		
	}
	
	private void createMenu() {
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("File");
		JMenuItem exitItem = new JMenuItem("Exit");
		exitItem.addActionListener((e) -> System.exit(0));
		menu.add(exitItem);
		menuBar.add(menu);
		this.setJMenuBar(menuBar);
	}
	
	

	public static void main(String[] args) throws IOException {
		
		ChatServer chatServer = new ChatServer();
		
	}

	@Override
	public void run() {
		
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(port);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        ta.append("MultiThreadServer started at " 
          + new Date() + '\n');
		
        
        while(true) {
        	try {
				Socket socket = serverSocket.accept();
				clientNo++;
				ta.append("Starting thread for client " + clientNo + " at " + new Date() + '\n');
				InetAddress inetAddress = socket.getInetAddress();
	            ta.append("Client " + clientNo + "'s host name is " + inetAddress.getHostName() + "\n");
	            ta.append("Client " + clientNo + "'s IP Address is " + inetAddress.getHostAddress() + "\n");
	            
	            new Thread(new HandleAClient(socket, clientNo)).start();
	            
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }

        
        
        
        
	}
	
	  class HandleAClient implements Runnable {
		    private Socket socket; // A connected socket
		    private int clientNum;
		    
		    /** Construct a thread */
		    public HandleAClient(Socket socket, int clientNum) {
		      this.socket = socket;
		      this.clientNum = clientNum;
		    }

		    /** Run a thread */
		    public void run() {
		      try {
		        // Create data input and output streams
		        DataInputStream inputFromClient = new DataInputStream(socket.getInputStream());
		        DataOutputStream outputToClient = new DataOutputStream(socket.getOutputStream());

		        // Continuously serve the client
		        while (true) {
		          // Receive radius from the client
		        	String msg = inputFromClient.readUTF();
		        	
		        	if(msg.isEmpty()) {
		        		ta.append("Client " + this.clientNum + ": " +
		  		              msg + '\n');
		        		outputToClient.writeUTF(allMessages);
		        	}
		        	else {
		          ta.append("Client " + this.clientNum + ": " + msg + '\n');
			          
			          allMessages+=("Client " + this.clientNum + ": " + msg + '\n');
			          
			          outputToClient.writeUTF(allMessages);
		        	}

		        
		        	//outputToClient.writeUTF("Client " + this.clientNum + ": " + msg + '\n');
		        	
		        	
		        


	

		        }
		      }
		      catch(IOException ex) {
		        ex.printStackTrace();
		      }
		    }
		  }
}


