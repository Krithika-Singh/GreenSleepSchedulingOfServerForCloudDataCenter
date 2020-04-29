import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

import javax.swing.*;


public class Cloudserver1 extends JFrame implements ActionListener
{

    Font f1 = new Font("Monaco",Font.BOLD,22);
	JPanel p1;
	JLabel cs1;
        JLabel a3;
	ImageIcon c1;
	
	JButton b1,b2,b3,closebtn;
	
	MenuBar mbr;
	Menu file;
	MenuItem  item1,assign,item2;
	
	JTable table;
	int v,h;
	String s,d,call;
	JScrollPane pane;
	
	Vector heading,data;
	
	JLabel title, active, sleeping;
	ImageIcon c11;
	
	Container c;
	JFrame jf;
	
	Cloudserver1()
	{
		jf = new JFrame("CLOUD SERVER - 1 :: GREEN SLEEP SCHEDULING OF SERVERS FOR CLOUD DATA CENTER");
		c = jf.getContentPane();
		c.setLayout(null);
                c.setSize(200,200);
		c.setBackground(new Color(191, 191, 191));
                
                a3 = new JLabel("CLOUD SERVER 1");
		a3.setFont(f1);
		a3.setBounds(200,20,200,100);
		c.add(a3);
		
                sleeping = new JLabel("Sleeping...!");
		sleeping.setFont(f1);
		sleeping.setBounds(250,50,200,100);
                sleeping.setVisible(false);
                
                active = new JLabel("Active");
		active.setFont(f1);
		active.setBounds(270,50,200,100);
                active.setVisible(true);
                
		mbr = new MenuBar();
		file = new Menu("View details");
		
		item1 = new MenuItem("View Transaction");
		assign= new MenuItem("Virtual Memory");
		item2 = new MenuItem("Data Owner Details");
		
		item1.addActionListener(this);
		assign.addActionListener(this);
		item2.addActionListener(this);
		
		file.add(item1);
//		file.add(assign);
//		file.add(item2);
		
		mbr.add(file);
		jf.setMenuBar(mbr);

		
		b1=new JButton("View Files");
		b1.setBounds(60,150,150,30);
		b1.addActionListener(this);
		b2=new JButton("View Transaction");
		b2.setBounds(240,150,150,30);
		b2.addActionListener(this);
		b3=new JButton("Energy Partitions");
		b3.setBounds(410,150,150,30);
		b3.addActionListener(this);
                closebtn = new JButton("Close");
                closebtn.setBounds(240,300,150,30);
		closebtn.addActionListener(this);
		c.add(b1);
		c.add(b2);
		c.add(b3);
                c.add(closebtn);
                closebtn.setVisible(false);
		         
		
		//p1.add(cs1);
//		p1.add(title);
		 c.add(b1);
		 
		 jf.setBounds(0, 0, 680	,400);
			jf.show();
		//add(p1);
		//setSize(680,400);
		//setVisible(true);
		
		int[] ports = new int[]
			              		{ 1111,4646,9988,1444};

			              		for (int i = 0; i < 4; i++)
			              		{
			              			Thread t = new Thread(new PortListener(ports[i]));
			              			t.setName("Listener-" + ports[i]);
			              			t.start();

			              		}
	}
	
        public void showStatus(boolean act) {
            if(act == true) {
                active.setVisible(true);
		c.add(active);
            } else {
                sleeping.setVisible(true);
                c.add(sleeping);
            }
        }

	public void actionPerformed(ActionEvent a1)
	{
		if(a1.getSource()==b1)
		{
			try
			{
                            Dbcon db=new Dbcon();
                            Connection connect=db.getConnection();
                            Statement stmt = connect.createStatement();
            
                            heading = new Vector();
   		 
                            heading.addElement("Owner Name");
                            heading.addElement("File Name");
                            heading.addElement("Secret Key");
                            heading.addElement("Date");
                            data=new Vector();
	     	  
                            String query = "SELECT * FROM CloudServer1";
                            ResultSet rs = stmt.executeQuery(query);
                            ResultSetMetaData rsm=rs.getMetaData();
                            int col=rsm.getColumnCount();

                            while(rs.next()) {
                                Vector row = new Vector();
                                for(int i = 1; i <=col; i++) {
                                    row.addElement(rs.getObject(i));
                                }
                                data.addElement(row);
                            }
                            table = new JTable(data,heading);
                            pane = new JScrollPane(table);
                            pane.setBounds(30,50,600,200);
                            c.add(pane);
                            
                            a3.setVisible(false);
                            b1.setVisible(false);
                            b2.setVisible(false);
                            b3.setVisible(false);
                            closebtn.setVisible(true);
                    } catch(Exception ex) {ex.printStackTrace();}
            }
                
             if(a1.getSource() == closebtn) {
                 CloseFrame closeFrame = new CloseFrame(jf);
                 closeFrame.windowClosing(null);
                 Cloudserver1 cd = new Cloudserver1();
  
             }
		
		if(a1.getSource()==b2)
		{
			/*try
			{
			Dbcon db=new Dbcon();
			Connection connect=db.getConnection();
            Statement stmt = connect.createStatement();
            
            heading = new Vector();
   		 
   		 heading.addElement("User Name");
   		 heading.addElement("File Name");
   		 heading.addElement("Secret Key");
   		heading.addElement("Date");
            data=new Vector();
	     	  
            String query = "SELECT * FROM Attacker";
            ResultSet rs = stmt.executeQuery(query);
            ResultSetMetaData rsm=rs.getMetaData();
            int col=rsm.getColumnCount();

            while(rs.next())
            {
        	   Vector row = new Vector();
        	   for(int i = 1; i <=col; i++)
        	   {
               row.addElement(rs.getObject(i));

        	   }

        	   data.addElement(row);
            }
		  
           table = new JTable(data,heading);
		  
           pane = new JScrollPane(table);
		 
           pane.setBounds(30,50,600,200);
           c.add(pane);
            a3.setVisible(false);
                            b1.setVisible(false);
                            b2.setVisible(false);
                            b3.setVisible(false);
                            closebtn.setVisible(true);
		 
			} catch(Exception ex) {ex.printStackTrace();}*/
                    try
			{
				String ip = JOptionPane.showInputDialog(null, "Enter The IP Address of Cloud");
				ValidateIPAddress vp = new ValidateIPAddress(ip);
                                if(vp.isValidInet4Address() == false) {
                                    JOptionPane.showMessageDialog(null, "Not a valid IP address");
                                    ip = JOptionPane.showInputDialog(null, "Enter valid IP Address of Cloud");
                                }	
					Socket stm=new Socket(ip,4455);
					ObjectOutputStream dos3=new ObjectOutputStream(stm.getOutputStream()); 
					dos3.writeObject("CS1"); 
						
					ObjectInputStream ins=new ObjectInputStream(stm.getInputStream());
					Vector a11=(Vector) ins.readObject();
					System.out.println(a11);
						
					ViewPartitionTransaction v = new ViewPartitionTransaction(a11);
					v.setSize(580,400);
					v.setVisible(true);
						
				}catch (Exception e) {
				// TODO: handle exception
			}
		}
		if(a1.getSource()==b3)
		{
			try
			{
				 String ip = JOptionPane.showInputDialog(null, "Enter The IP Address of Cloud");
				ValidateIPAddress vp = new ValidateIPAddress(ip);
                                if(vp.isValidInet4Address() == false) {
                                    JOptionPane.showMessageDialog(null, "Not a valid IP address");
                                    ip = JOptionPane.showInputDialog(null, "Enter valid IP Address of Cloud");
                                }	
				Socket stm=new Socket(ip,3555);
				ObjectOutputStream dos3=new ObjectOutputStream(stm.getOutputStream()); 
				dos3.writeObject("Partition1"); 
					
				ObjectInputStream ins=new ObjectInputStream(stm.getInputStream());
				Vector a11=(Vector) ins.readObject();
				System.out.println(a11);
					
				/*ViewPartition v = new ViewPartition(a11);
				v.setSize(580,400);
				v.setVisible(true);*/
                                ViewPartitionDetails v =new ViewPartitionDetails();
				v.setSize(600, 400);
				v.setVisible(true);
					
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
			
			if(a1.getSource()==assign)
			{
				try
				{
					Dbcon db=new Dbcon();
					Connection connect=db.getConnection();
		            Statement stmt = connect.createStatement();
		            
		            heading = new Vector();
		   		 
		   		 heading.addElement("Memory");
		            data=new Vector();
			     	  
		            String query = "SELECT * FROM VM1";
		            ResultSet rs = stmt.executeQuery(query);
		            ResultSetMetaData rsm=rs.getMetaData();
		            int col=rsm.getColumnCount();

		            while(rs.next())
		            {
		        	   Vector row = new Vector();
		        	   for(int i = 1; i <=col; i++)
		        	   {
		               row.addElement(rs.getObject(i));

		        	   }

		        	   data.addElement(row);
		            }
				  
		           table = new JTable(data,heading);
				  
		           pane = new JScrollPane(table);
				 
		           pane.setBounds(30,50,600,200);
		           c.add(pane);
				 
					}catch (Exception e) {
					// TODO: handle exception
				}
			}	
			if(a1.getSource()==item2)
			{}	
		if(a1.getSource()==item1)
		{
			try
			{
				String ip = JOptionPane.showInputDialog(null, "Enter The IP Address of Cloud");
				ValidateIPAddress vp = new ValidateIPAddress(ip);
                                if(vp.isValidInet4Address() == false) {
                                    JOptionPane.showMessageDialog(null, "Not a valid IP address");
                                    ip = JOptionPane.showInputDialog(null, "Enter valid IP Address of Cloud");
                                }	
					Socket stm=new Socket(ip,4455);
					ObjectOutputStream dos3=new ObjectOutputStream(stm.getOutputStream()); 
					dos3.writeObject("CS1"); 
						
					ObjectInputStream ins=new ObjectInputStream(stm.getInputStream());
					Vector a11=(Vector) ins.readObject();
					System.out.println(a11);
						
					ViewPartitionTransaction v = new ViewPartitionTransaction(a11);
					v.setSize(580,400);
					v.setVisible(true);
						
				}catch (Exception e) {
				// TODO: handle exception
			}
		}
	
	}
	
	
	class PortListener implements Runnable
	{

		BufferedOutputStream bos = null;
		ServerSocket ss1, ss2;
		Socket s1, s2;
		ServerSocket server, server1,server2,server3;
		Socket connection, so;
		BufferedReader br = null;
		int port;

		public PortListener(int port)
		{
			this.port = port;
		}

		public void run()
		{
			Dbcon done=new Dbcon();
			Connection connect = done.getConnection();
			
			if(this.port==1111)
			{
				
				
				String mac=null;
				try
				{
					
					ServerSocket server1 = new ServerSocket(1111);
	                Socket con5;
					while (true) 
					{
						con5 = server1.accept();
						DataInputStream din = new DataInputStream(con5.getInputStream());
						
						String owner = din.readUTF();
						String fname = din.readUTF();
						String sk = din.readUTF();
						String content = din.readUTF();
						String dt = din.readUTF();
						
						PrintStream out1 = null;
						try {
							   out1 = new PrintStream(new FileOutputStream("C:\\Users\\HOME\\OneDrive\\Desktop\\major\\src\\CloudServer1\\"+fname));
							   out1.print(content);
							    
							}
							finally {
							    if (out1 != null) out1.close();
							}
							
							Statement stmt = connect.createStatement();
						
							String query1 = "insert into CloudServer1 values('"+owner+"','"+fname+"','"+ sk+"','"+dt+"')";
							stmt.executeUpdate(query1);
							
							String task="Upload";
							String cloud="CS1";
							connect.createStatement().executeUpdate("insert into transaction values ('"+owner+"','"+fname+"','"+task+"','"+cloud+"','"+dt+"')");
							
							
							DataOutputStream dos3=new DataOutputStream(con5.getOutputStream());
							dos3.writeUTF("success");
							
					}
				}catch(Exception es){System.out.println(es);}
			}
			
			if (this.port == 4646)
			{
				try
				{
					ServerSocket server909 = new ServerSocket(4646);
					Socket con777;

					while (true) 
					{
						
					con777 = server909.accept();
					
					DataInputStream dis = new DataInputStream(con777.getInputStream());
					String file	= dis.readUTF();
					
					ResultSet r1=connect.createStatement().executeQuery("select * from CloudServer1 where fname='"+file+"'");
					
					if(r1.next()==true)
					{
						String k= r1.getString("sk");
						
						DataOutputStream dos1 = new DataOutputStream(con777.getOutputStream());
						
						dos1.writeUTF("key");
						dos1.writeUTF(k);
							
					}
					if(r1.next()==false)
					{
						DataOutputStream dos1 = new DataOutputStream(con777.getOutputStream());
						dos1.writeUTF("no");
						dos1.writeUTF("no");
							
					}
					
					}
					
					}catch (Exception e) {
					
				}
			
			}
			
			if (this.port == 9988)
			{
				try
				{
					ServerSocket server909 = new ServerSocket(9988);
					Socket con777;

					while (true) 
					{
						
					con777 = server909.accept();
					
					DataInputStream dis = new DataInputStream(con777.getInputStream());
					String user	= dis.readUTF();
					String file	= dis.readUTF();
					String sk	= dis.readUTF();
					
//	/				long  start = System.currentTimeMillis();
				
					SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");	
					Date d = new Date();	
					String dt = sd.format(d);

					ResultSet r1=connect.createStatement().executeQuery("select * from CloudServer1 where fname='"+file+"'");
					
					if(r1.next()==true)
					{
						ResultSet r2=connect.createStatement().executeQuery("select * from CloudServer1 where fname='"+file+"' and sk='"+sk+"'");
						
						if(r2.next()==true)
						{
//							long  end = System.currentTimeMillis();
//							String cpu = Long.toString(end-start);
							AES a = new AES();
							String keyWord = "ef50a0ef2c3e3a5fdf803ae9752c8c66";
							
							FileInputStream fs = new FileInputStream("C:\\Users\\HOME\\OneDrive\\Desktop\\major\\src\\CloudServer1\\"+file);
							byte bs1[] = new byte[fs.available()];
							fs.read(bs1);
							String content = new String(bs1);
							
							String task="Download";
							String cloud="CS1";
							connect.createStatement().executeUpdate("insert into transaction values ('"+user+"','"+file+"','"+task+"','"+cloud+"','"+dt+"')");
							
							DataOutputStream dos1 = new DataOutputStream(con777.getOutputStream());
							dos1.writeUTF("success");
							dos1.writeUTF(a.decrypt(content, keyWord));
						}
						else
						{
							connect.createStatement().executeUpdate("insert into Attacker values ('"+user+"','"+file+"','"+sk+"','"+dt+"')");
							
							DataOutputStream dos1 = new DataOutputStream(con777.getOutputStream());
							dos1.writeUTF("failure");
							dos1.writeUTF("failure");
							
						}
							
					}
					if(r1.next()!=true)
						{
						
						DataOutputStream dos1 = new DataOutputStream(con777.getOutputStream());
						dos1.writeUTF("nofile");
						dos1.writeUTF("nofile");
						
							
						}		
						
					
					}
					
					}catch (Exception e) {
					
				}
		}
		
			if (this.port == 1444)
			{
				try
				{
					ServerSocket server909 = new ServerSocket(1444);
					Socket con777;

					while (true) 
					{
							
						con777 = server909.accept();
						
						ObjectInputStream in3=new ObjectInputStream(con777.getInputStream());
						
						String cs=in3.readObject().toString();
						
						Vector data = new Vector();
						
						
						ResultSet r1=connect.createStatement().executeQuery("select owner,fname,task,cloud,dt from transaction where cloud='"+cs+"'");

						ResultSetMetaData rsm=r1.getMetaData();
						int col=rsm.getColumnCount();
						
						while(r1.next()==true)
						{
							Vector row = new Vector();
			            	for(int i = 1; i <=col; i++){
			                row.addElement(r1.getObject(i));
			                
			             }
			            	data.addElement(row);
						}
						
						ObjectOutputStream dout = new ObjectOutputStream(con777.getOutputStream());
						dout.writeObject(data);
						
						}
					
					}catch (Exception e) {
					
				}
		}
			
	}
	}
	
	
	public static void main(String[] args) 
	{
		new Cloudserver1();
	}
	
}
