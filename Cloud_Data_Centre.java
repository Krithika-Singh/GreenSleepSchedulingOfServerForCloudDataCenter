import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
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
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.border.Border;

public class Cloud_Data_Centre implements ActionListener {
	JFrame jf;
	Container c;
	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12,heading, database;
	JPanel p1;
	JButton b2, b3, b4;
	JScrollPane sp;
	JTextArea ta;
	JTextField t1;
	MenuBar mbr;
	Menu file;
	MenuItem  assign,item2, users,csfile,kdc,server,trans,audit,aud,key,exit;
	Border b11, b22, b33;
	JScrollPane pane;
	String Scheme1;
	String f1 = "", f2 = "", f3 = "", f4 = "", f5 = "", f6 = "", f7 = "",f8 = "";
	int count = 0;
	Timer timer;
	double cc=0;
	String dt="";
	public Font f = new Font("Times new roman", Font.BOLD, 15);
	public Font font = new Font("Times new roman", Font.BOLD, 18);
	public Font f11 = new Font("Times new roman", Font.BOLD, 15);
	String cs="";String content=""; String fname="";
	String owner=""; String sk="";
	JLabel mg1, mg2, mg3, mg4, mg5, mg6, mg7, mg8, mg9, mg10, g11, g22, g33,
			g44, g55, g66, g77;
	
	String part1="Partition1";
	String part2="Partition2";
	String part3="Partition3";
	

	String e1 = "";
	String e2 = "";
	String e3 = "";
	
	String st1 = "";
	String st2 = "";
	String st3 = "";
	
	int ct=0;
	
        Font fontStyle  = new Font("Monaco",Font.BOLD,22);
	String keyWord = "ef50a0ef2c3e3a5fdf803ae9752c8c66";
	ImageIcon one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelve,thirteen;
        ImageIcon arrow1,arrow2,arrow3,arrow4,arrow5,arrow6,arrow7,arrow8,arrow9,arrow10,arrow11,arrow12,end,end1,fileArrow;
        ImageIcon databaseIcon,dbarrow1,dbarrow2,dbarrow3,fileIcon;
	JLabel onel,twol,threel,fourl,fivel,sixl,sevenl,eightl,ninel,tenl,elevenl,twelvel,thirteenl;
        JLabel arrow1l,arrow2l,arrow3l,arrow4l,arrow5l,arrow6l,arrow7l,arrow8l,arrow9l,arrow10l,arrow11l,arrow12l,endl,end1l,fileArrow1;
        JLabel databaseIcon1,dbarrow11,dbarrow21,dbarrow31, fileIcon1;
	JLabel lab1,lab2,lab3,lab4,lab5,lab6,lab7,lab8,lab9,lab10,lab11;
	
	Cloud_Data_Centre() {
		jf = new JFrame("GREEN SLEEP SCHEDULING OF SERVERS FOR CLOUD DATA CENTER");
		c = jf.getContentPane();
		c.setLayout(null);
		
		c.setBackground(Color.WHITE);
		timer = new Timer(0, null);
		
                //file icon
                fileIcon = new ImageIcon(this.getClass().getResource("FileImage.png"));
		fileIcon1=new JLabel();
		fileIcon1.setIcon(fileIcon);
		fileIcon1.setBounds(10, 155, 300, 200);
		c.add(fileIcon1);
        
                // arrow from file to balancer
                fileArrow = new ImageIcon(this.getClass().getResource("a2.png"));
		fileArrow1=new JLabel();
		fileArrow1.setIcon(fileArrow);
		fileArrow1.setBounds(70, 150, 300, 200);
		c.add(fileArrow1);
               
                //balancer 
		one = new ImageIcon(this.getClass().getResource("balancer1.png"));
		onel=new JLabel();
		onel.setIcon(one);
		onel.setBounds(120, 150, 300, 200);
		c.add(onel);
		
                //Segmentations
		two = new ImageIcon(this.getClass().getResource("p11.png"));
		twol=new JLabel();
		twol.setIcon(two);
		twol.setBounds(350, 10, 300, 200);
		c.add(twol);
		
		three = new ImageIcon(this.getClass().getResource("p2.png"));
		threel=new JLabel();
		threel.setIcon(three);
		threel.setBounds(360, 150, 300, 200);
		c.add(threel);

		four = new ImageIcon(this.getClass().getResource("p33.jpg"));
		fourl=new JLabel();
		fourl.setIcon(four);
		fourl.setBounds(360, 289, 300, 200);
		c.add(fourl);
		
                //cloud server of partition1
		five = new ImageIcon(this.getClass().getResource("cs1.png"));
		fivel=new JLabel();
		fivel.setIcon(five);
		fivel.setBounds(570, -50, 300, 200);
		c.add(fivel);
		
		six = new ImageIcon(this.getClass().getResource("cs2.png"));
		sixl=new JLabel();
		sixl.setIcon(six);
		sixl.setBounds(570, 0, 300, 200);
		c.add(sixl);
                        
		seven = new ImageIcon(this.getClass().getResource("cs3.png"));
		sevenl=new JLabel();
		sevenl.setIcon(seven);
		sevenl.setBounds(570, 50, 300, 200);
		c.add(sevenl);
		
                //CS of partition2
		eight = new ImageIcon(this.getClass().getResource("cs1.png"));
		eightl=new JLabel();
		eightl.setIcon(eight);
		eightl.setBounds(570, 95, 300, 200);
		c.add(eightl);
		
		nine = new ImageIcon(this.getClass().getResource("cs2.png"));
		ninel=new JLabel();
		ninel.setIcon(nine);
		ninel.setBounds(570, 140, 300, 200);
		c.add(ninel);
		
		ten = new ImageIcon(this.getClass().getResource("cs3.png"));
		tenl=new JLabel();
		tenl.setIcon(ten);
		tenl.setBounds(570, 190, 300, 200);
		c.add(tenl);
		
                //CS of partition3
		eleven = new ImageIcon(this.getClass().getResource("cs1.png"));
		elevenl=new JLabel();
		elevenl.setIcon(eleven);
		elevenl.setBounds(570, 240, 300, 200);
		c.add(elevenl);
		
		twelve = new ImageIcon(this.getClass().getResource("cs2.png"));
		twelvel=new JLabel();
		twelvel.setIcon(twelve);
		twelvel.setBounds(570, 290, 300, 200);
		c.add(twelvel);
		
		thirteen = new ImageIcon(this.getClass().getResource("cs3.png"));
		thirteenl=new JLabel();
		thirteenl.setIcon(thirteen);
		thirteenl.setBounds(570, 340, 300, 200);
		c.add(thirteenl);
		
                //Heading at bottom
                heading = new JLabel("CLOUD DATA CENTER");
		heading.setFont(fontStyle);
		heading.setBounds(310,380, 300, 200);
		c.add(heading);
                
                //arrows from balancer to partitions
		arrow1 = new ImageIcon(this.getClass().getResource("a1.png"));
		arrow1l=new JLabel();
		arrow1l.setIcon(arrow1);
		arrow1l.setBounds(260, 70, 300, 200);
		c.add(arrow1l);
		
		arrow2 = new ImageIcon(this.getClass().getResource("a2.png"));
		arrow2l=new JLabel();
		arrow2l.setIcon(arrow2);
		arrow2l.setBounds(270, 150, 300, 200);
		c.add(arrow2l);
		
		arrow3 = new ImageIcon(this.getClass().getResource("a3.png"));
		arrow3l=new JLabel();
		arrow3l.setIcon(arrow3);
		arrow3l.setBounds(250, 230, 300, 200);
		c.add(arrow3l);
		
                //arrow from partition 1 to cs
		arrow4 = new ImageIcon(this.getClass().getResource("a11.png"));
		arrow4l=new JLabel();
		arrow4l.setIcon(arrow4);
		arrow4l.setBounds(480, -30, 300, 200);
		c.add(arrow4l);
		
		arrow5 = new ImageIcon(this.getClass().getResource("a2.png"));
		arrow5l=new JLabel();
		arrow5l.setIcon(arrow5);
		arrow5l.setBounds(490, 0, 300, 200);
		c.add(arrow5l);
		
		arrow6 = new ImageIcon(this.getClass().getResource("a33.png"));
		arrow6l=new JLabel();
		arrow6l.setIcon(arrow6);
		arrow6l.setBounds(480, 30, 300, 200);
		c.add(arrow6l);
		
                //arrow from partition2 to cs
		arrow7 = new ImageIcon(this.getClass().getResource("a11.png"));
		arrow7l=new JLabel();
		arrow7l.setIcon(arrow7);
		arrow7l.setBounds(480, 110, 300, 200);
		c.add(arrow7l);
		
		arrow8 = new ImageIcon(this.getClass().getResource("a2.png"));
		arrow8l=new JLabel();
		arrow8l.setIcon(arrow8);
		arrow8l.setBounds(490, 140, 300, 200);
		c.add(arrow8l);
		
		arrow9 = new ImageIcon(this.getClass().getResource("a33.png"));
		arrow9l=new JLabel();
		arrow9l.setIcon(arrow9);
		arrow9l.setBounds(480, 170, 300, 200);
		c.add(arrow9l);
		
                // arrows from partution3 to cs
		arrow10 = new ImageIcon(this.getClass().getResource("a11.png"));
		arrow10l=new JLabel();
		arrow10l.setIcon(arrow10);
		arrow10l.setBounds(490, 250, 300, 200);
		c.add(arrow10l);
		
		arrow11 = new ImageIcon(this.getClass().getResource("a2.png"));
		arrow11l=new JLabel();
		arrow11l.setIcon(arrow11);
		arrow11l.setBounds(490, 280, 300, 200);
		c.add(arrow11l);
		
		arrow12 = new ImageIcon(this.getClass().getResource("a33.png"));
		arrow12l=new JLabel();
		arrow12l.setIcon(arrow12);
		arrow12l.setBounds(480, 310, 300, 200);
		c.add(arrow12l);
		
                //Normal arrows towards dabtabase
                dbarrow1 = new ImageIcon(this.getClass().getResource("a3.png"));
		dbarrow11=new JLabel();
		dbarrow11.setIcon(dbarrow1);
		dbarrow11.setBounds(620, 30, 300, 200);
		c.add(dbarrow11);

                dbarrow2 = new ImageIcon(this.getClass().getResource("a2.png"));
		dbarrow21=new JLabel();
		dbarrow21.setIcon(dbarrow2);
		dbarrow21.setBounds(625, 145, 300, 200);
		c.add(dbarrow21);

                dbarrow3 = new ImageIcon(this.getClass().getResource("a1.png"));
		dbarrow31=new JLabel();
		dbarrow31.setIcon(dbarrow3);
		dbarrow31.setBounds(625, 255, 300, 200);
		c.add(dbarrow31);
           
                //database icon
                databaseIcon = new ImageIcon(this.getClass().getResource("database.png"));
		databaseIcon1=new JLabel();
		databaseIcon1.setIcon(databaseIcon);
		databaseIcon1.setBounds(680, 140, 300, 200);
		c.add(databaseIcon1);

                //IDLE labels for partition with red color
		lab1 = new JLabel("Power insufficient");
		lab1.setFont(f);
		lab1.setBounds(380, 62, 300, 200);
		lab1.setForeground(Color.red);
		lab1.setVisible(false);
		c.add(lab1);
		
		lab2 = new JLabel("Power insufficient");
		lab2.setFont(f);
		lab2.setBounds(380, 210, 300, 200);
		lab2.setForeground(Color.red);
		lab2.setVisible(false);
		c.add(lab2);
		
		lab3 = new JLabel("Power insufficient");
		lab3.setFont(f);
		lab3.setBounds(380, 330, 300, 200);
		lab3.setForeground(Color.red);
		lab3.setVisible(false);
		c.add(lab3);

                //No labels with green color
		lab4 = new JLabel("");
		lab4.setFont(f);
		lab4.setBounds(380, 60, 300, 200);
		lab4.setForeground(Color.green);
		c.add(lab4);
		lab4.setVisible(false);
		
		lab5 = new JLabel("");
		lab5.setFont(f);
		lab5.setBounds(380, 210, 300, 200);
		lab5.setForeground(Color.green);
		c.add(lab5);
		lab5.setVisible(false);
		
		lab6 = new JLabel("");
		lab6.setFont(f);
		lab6.setBounds(380, 330, 300, 200);
		lab6.setForeground(Color.green);
		c.add(lab6);
		lab6.setVisible(false);
		
		lab7 = new JLabel("ASSIGNING ENERGY");
		lab7.setFont(f);
		lab7.setBounds(130, 230, 300, 200);
		lab7.setForeground(Color.green);
		c.add(lab7);
		lab7.setVisible(false);
		
		mbr = new MenuBar();
//		csfile = new MenuItem("Schedule Key Exchange");
		file = new Menu("File");
		kdc = new MenuItem("Update power supply");
		assign= new MenuItem("Energy Partition Details");
		item2 = new MenuItem("View Transaction");
		users = new MenuItem("View Users");
		server= new MenuItem("View Attackers");
		trans= new MenuItem("View BackUp Keys");
		audit= new MenuItem("View Audit Result");
		aud= new MenuItem("View Audit Date");
		key= new MenuItem("View Key Update Date");
		exit = new MenuItem("Exit");
		
		assign.addActionListener(this);
		kdc.addActionListener(this);
		item2.addActionListener(this);
		users.addActionListener(this);
//		csfile.addActionListener(this);
		server.addActionListener(this);
		trans.addActionListener(this);
		audit.addActionListener(this);
		aud.addActionListener(this);
		key.addActionListener(this);
		exit.addActionListener(this);
		
		file.add(kdc);
		file.add(assign);
		file.add(item2);
		file.add(users);
		file.add(exit);
		mbr.add(file);
		jf.setMenuBar(mbr);


		jf.setBounds(40, 0, 850	,550);
		jf.show();

		int[] ports = new int[] {1234,3090,4090,5757,7373,4747,9999,2555,3555,4555,4455,4466,4477,3009};
		
		for (int i = 0; i < 14; i++) {
			Thread t2 = new Thread(new PortListener(ports[i]));
			t2.start();
		}
	}

	public static void main(String args[])
	{
//		new CloudServer();
		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Cloud_Data_Centre();
			}
		});
	}
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		Dbcon db=new Dbcon();
		Connection con=db.getConnection();
		if (o == assign) {
			try {
                                ViewPartitionDetails v =new ViewPartitionDetails();
				v.setSize(600, 400);
				v.setVisible(true);
				
			}catch(Exception es){System.out.println(es);}
			
		}
                if (o == users) {
			try {
                                System.out.println("All the users are : ");
				ViewUsers v1 =new ViewUsers();
				v1.setSize(600, 400);
				v1.setVisible(true);	
			}catch(Exception es){System.out.println(es);}
		}	
		if (o == kdc) {
			try{
				String nname="";
				String cn4[]={"Partition1","Partition2","Partition3"};
				JComboBox clust4=new JComboBox(cn4);
				JOptionPane.showMessageDialog(null,clust4,"Update power supply",JOptionPane.QUESTION_MESSAGE);
				nname=clust4.getSelectedItem().toString();
						
				String Ener=JOptionPane.showInputDialog(null,"Enter power in watts");
                                System.out.println("Updated energy of " + nname + " is = " + Ener);
				Statement st=con.createStatement();
				String cname="CSDetails";
				String normal="Normal";
				String n1="update "+cname+" set energy="+Ener+",status='"+normal+"' where csname='"+nname+"' ";
				st.executeUpdate(n1);

				JOptionPane.showMessageDialog(null,"Energy Updated Successfully");
	
			}catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		if (o == item2) {
			try
			{
				String[] dsn = { "Select", "CS1", "CS2", "CS3"};
				
				 String cs = (String) JOptionPane.showInputDialog(null,
						"Select Cloud Server", " CloudServer",
						JOptionPane.QUESTION_MESSAGE, null,  dsn,  dsn[0]);
				 
				 if(cs.equalsIgnoreCase("CS1"))
				 {
					 String ip = JOptionPane.showInputDialog(null, "Enter The IP Address of Cloud Server");
						ValidateIPAddress vp = new ValidateIPAddress(ip);
                                                if(vp.isValidInet4Address() == false) {
                                                    JOptionPane.showMessageDialog(null, "Not a valid IP address");
                                                    ip = JOptionPane.showInputDialog(null, "Enter valid IP Address of Cloud Server");
                                                }
						Socket stm=new Socket(ip,1444);
						ObjectOutputStream dos3=new ObjectOutputStream(stm.getOutputStream()); 
						dos3.writeObject("CS1"); 
						
						ObjectInputStream ins=new ObjectInputStream(stm.getInputStream());
						Vector a1=(Vector) ins.readObject();
						System.out.println(a1);
						
						ViewTransaction v = new ViewTransaction(a1);
						v.setSize(580,400);
						v.setVisible(true);
					 
				 }
				 if(cs.equalsIgnoreCase("CS2"))
				 {

					 String ip = JOptionPane.showInputDialog(null, "Enter The IP Address of Cloud Server");
						ValidateIPAddress vp = new ValidateIPAddress(ip);
                                                if(vp.isValidInet4Address() == false) {
                                                    JOptionPane.showMessageDialog(null, "Not a valid IP address");
                                                    ip = JOptionPane.showInputDialog(null, "Enter valid IP Address of Cloud Server");
                                                }
						Socket stm=new Socket(ip,1555);
						ObjectOutputStream dos3=new ObjectOutputStream(stm.getOutputStream()); 
						dos3.writeObject("CS2"); 
						
						ObjectInputStream ins=new ObjectInputStream(stm.getInputStream());
						Vector a1=(Vector) ins.readObject();
						System.out.println(a1);
						
						ViewTransaction v = new ViewTransaction(a1);
						v.setSize(580,400);
						v.setVisible(true);
					 
				 
				 }
				 if(cs.equalsIgnoreCase("CS3"))
				 {

					 String ip = JOptionPane.showInputDialog(null, "Enter The IP Address of Cloud Server");
						ValidateIPAddress vp = new ValidateIPAddress(ip);
                                                if(vp.isValidInet4Address() == false) {
                                                    JOptionPane.showMessageDialog(null, "Not a valid IP address");
                                                    ip = JOptionPane.showInputDialog(null, "Enter valid IP Address of Cloud Server");
                                                }
						Socket stm=new Socket(ip,1666);
						ObjectOutputStream dos3=new ObjectOutputStream(stm.getOutputStream()); 
						dos3.writeObject("CS3"); 
						
						ObjectInputStream ins=new ObjectInputStream(stm.getInputStream());
						Vector a1=(Vector) ins.readObject();
						System.out.println(a1);
						
						ViewTransaction v = new ViewTransaction(a1);
						v.setSize(580,400);
						v.setVisible(true);
					 
				 
				 } 
			}catch (Exception e4) {
				// TODO: handle exception
			}
			
		}
		if(o == exit)
		{
			System.exit(0);
		}
	}

class PortListener implements Runnable {
		
		int port;

		public PortListener(int port) {
			this.port = port;
		}

		public void run() {
			try{
			Class.forName("com.mysql.jdbc.Driver");
			Dbcon db=new Dbcon();
			Connection connect=db.getConnection();
			Socket s;
		
			
			if(this.port==1234)
			{
                System.out.println("Entered port 3009 which is changed to 1234");
				ServerSocket sc =new ServerSocket(1234);
				
				while(true)
				{
				
				s = sc.accept();
				
				DataInputStream din = new DataInputStream(s.getInputStream());
				
				owner = din.readUTF();
				fname = din.readUTF();
				sk = din.readUTF();
				cs = din.readUTF();
				content = din.readUTF();
				dt= din.readUTF();

				ct = content.length();
                                System.out.println("Ct value is " + ct);
				
				
				String over = "Idle";
				
				
				ResultSet rs=connect.createStatement().executeQuery("select * from CSDetails where csname='"+part1+"'");
				if(rs.next()==true)
				{
					e1=rs.getString(2);
					st1=rs.getString(3);
                                        System.out.println("e1 = " + e1 + " st1 = " + st1);
				}
				
				ResultSet rs1=connect.createStatement().executeQuery("select * from CSDetails where csname='"+part2+"'");
				if(rs1.next()==true)
				{
					e2=rs1.getString(2);
					st2=rs1.getString(3);
                                        System.out.println("e2 = " + e2 + " st2 = " + st2);
				}
				
				ResultSet rs2=connect.createStatement().executeQuery("select * from CSDetails where csname='"+part3+"'");
				if(rs2.next()==true)
				{
					e3=rs2.getString(2);
					st3=rs2.getString(3);
                                        System.out.println("e3 = " + e3 + " st3 = " + st3);
				}
				
                System.out.println("Uploading process of file is visulaized here");
				Thread.sleep(2000);
				onel.setVisible(false);
				Thread.sleep(1000);
				onel.setVisible(true);
				Thread.sleep(1000);
				onel.setVisible(false);
				Thread.sleep(1000);
				onel.setVisible(true);
				
				Thread.sleep(1000);
				arrow1 = new ImageIcon(this.getClass().getResource("a1g.png"));
				arrow1l.setIcon(arrow1);
				
				Thread.sleep(2000);
				twol.setVisible(false);
				Thread.sleep(1000);
				twol.setVisible(true);
				Thread.sleep(1000);
				twol.setVisible(false);
				Thread.sleep(1000);
				twol.setVisible(true);
				
				if(st1.equalsIgnoreCase("Normal"))
				{
					System.out.println("Entered port 3009 st1");
					if(Integer.parseInt(e1)>=ct)
					{
						System.out.println("Entered port 3009 st1 e1 >= ct");
						int ene = Integer.parseInt(e1)-ct;
						connect.createStatement().executeUpdate("update CSDetails set energy='"+ene+"' where csname='"+part1+"'");
						
						if(cs.equalsIgnoreCase("CS1"))
						{
							Thread.sleep(1000);
							arrow4 = new ImageIcon(this.getClass().getResource("a11g.png"));
							arrow4l.setIcon(arrow4);
							
							Thread.sleep(2000);
							fivel.setVisible(false);
							Thread.sleep(1000);
							fivel.setVisible(true);
							Thread.sleep(1000);
							fivel.setVisible(false);
							Thread.sleep(1000);
							fivel.setVisible(true);
							
							clear();
							
							connect.createStatement().executeUpdate("insert into Part values('"+owner+"','"+part1+"','"+cs+"','"+dt+"')");
							
							Socket soc = new Socket("localhost",1111);
							DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
							dos.writeUTF(owner);
							dos.writeUTF(fname);
							dos.writeUTF(sk);
							dos.writeUTF(content);
							dos.writeUTF(dt);
							
							DataInputStream di =new DataInputStream(soc.getInputStream());
							String msg=di.readUTF();
							
							DataOutputStream dout =new DataOutputStream(s.getOutputStream());
							dout.writeUTF(msg);
						}
						else if(cs.equalsIgnoreCase("CS2"))
						{
							Thread.sleep(1000);
							arrow5 = new ImageIcon(this.getClass().getResource("a2g.png"));
							arrow5l.setIcon(arrow5);
							
							Thread.sleep(2000);
							sixl.setVisible(false);
							Thread.sleep(1000);
							sixl.setVisible(true);
							Thread.sleep(1000);
							sixl.setVisible(false);
							Thread.sleep(1000);
							sixl.setVisible(true);
							
							clear();
							
							connect.createStatement().executeUpdate("insert into Part values('"+owner+"','"+part1+"','"+cs+"','"+dt+"')");
							
							Socket soc = new Socket("localhost",2222);
							DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
							dos.writeUTF(owner);
							dos.writeUTF(fname);
							dos.writeUTF(sk);
							dos.writeUTF(content);
							dos.writeUTF(dt);
							
							DataInputStream di =new DataInputStream(soc.getInputStream());
							String msg=di.readUTF();
							
							DataOutputStream dout =new DataOutputStream(s.getOutputStream());
							dout.writeUTF(msg);
						}
						else if(cs.equalsIgnoreCase("CS3"))
						{
							Thread.sleep(1000);
							arrow6 = new ImageIcon(this.getClass().getResource("a33g.png"));
							arrow6l.setIcon(arrow6);
							
							Thread.sleep(2000);
							sevenl.setVisible(false);
							Thread.sleep(1000);
							sevenl.setVisible(true);
							Thread.sleep(1000);
							sevenl.setVisible(false);
							Thread.sleep(1000);
							sevenl.setVisible(true);
							
							clear();
							
							connect.createStatement().executeUpdate("insert into Part values('"+owner+"','"+part1+"','"+cs+"','"+dt+"')");
							
							Socket soc = new Socket("localhost",3333);
							DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
							dos.writeUTF(owner);
							dos.writeUTF(fname);
							dos.writeUTF(sk);
							dos.writeUTF(content);
							dos.writeUTF(dt);
							
							DataInputStream di =new DataInputStream(soc.getInputStream());
							String msg=di.readUTF();
							
							DataOutputStream dout =new DataOutputStream(s.getOutputStream());
							dout.writeUTF(msg);
							
						}
					}
					if(Integer.parseInt(e1)<=ct)
					{
						System.out.println("Entered port 3009 st1 e1 <= ct");
						Thread.sleep(2000);
						lab1.setVisible(false);
						Thread.sleep(1000);
						lab1.setVisible(true);
						Thread.sleep(1000);
						lab1.setVisible(false);
						Thread.sleep(1000);
						lab1.setVisible(true);
						
						connect.createStatement().executeUpdate("update CSDetails set status='"+over+"' where csname='"+part1+"'");
						System.out.println("Entered port 3009 st1 e1 <= ct updated partition 1 value to be idle");
						Thread.sleep(2000);
						arrow2 = new ImageIcon(this.getClass().getResource("a2g.png"));
						arrow2l.setIcon(arrow2);
						
						Thread.sleep(2000);
						threel.setVisible(false);
						Thread.sleep(1000);
						threel.setVisible(true);
						Thread.sleep(1000);
						threel.setVisible(false);
						Thread.sleep(1000);
						threel.setVisible(true);
						
						if(st2.equalsIgnoreCase("Normal"))
						{
							System.out.println("Entered port 3009 st2");
							if(Integer.parseInt(e2)>=ct)
							{
								System.out.println("Entered port 3009 st1 e2 >= ct");
								int ene = Integer.parseInt(e2)-ct;
								connect.createStatement().executeUpdate("update CSDetails set energy='"+ene+"' where csname='"+part2+"'");
								connect.createStatement().executeUpdate("insert into Part values('"+owner+"','"+part2+"','"+cs+"','"+dt+"')");
								
								if(cs.equalsIgnoreCase("CS1"))
								{
									Thread.sleep(1000);
									arrow7 = new ImageIcon(this.getClass().getResource("a11g.png"));
									arrow7l.setIcon(arrow7);

									Thread.sleep(2000);
									eightl.setVisible(false);
									Thread.sleep(1000);
									eightl.setVisible(true);
									Thread.sleep(1000);
									eightl.setVisible(false);
									Thread.sleep(1000);
									eightl.setVisible(true);

									clear();
									
									Socket soc = new Socket("localhost",1111);
									DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
									dos.writeUTF(owner);
									dos.writeUTF(fname);
									dos.writeUTF(sk);
									dos.writeUTF(content);
									dos.writeUTF(dt);
									
									DataInputStream di =new DataInputStream(soc.getInputStream());
									String msg=di.readUTF();
									
									DataOutputStream dout =new DataOutputStream(s.getOutputStream());
									dout.writeUTF(msg);
								}
								else if(cs.equalsIgnoreCase("CS2"))
								{
									Thread.sleep(1000);
									arrow8 = new ImageIcon(this.getClass().getResource("a2g.png"));
									arrow8l.setIcon(arrow8);

									Thread.sleep(2000);
									ninel.setVisible(false);
									Thread.sleep(1000);
									ninel.setVisible(true);
									Thread.sleep(1000);
									ninel.setVisible(false);
									Thread.sleep(1000);
									ninel.setVisible(true);

									clear();
									
									connect.createStatement().executeUpdate("insert into Part values('"+owner+"','"+part2+"','"+cs+"','"+dt+"')");
									
									Socket soc = new Socket("localhost",2222);
									DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
									dos.writeUTF(owner);
									dos.writeUTF(fname);
									dos.writeUTF(sk);
									dos.writeUTF(content);
									dos.writeUTF(dt);
									
									DataInputStream di =new DataInputStream(soc.getInputStream());
									String msg=di.readUTF();
									
									DataOutputStream dout =new DataOutputStream(s.getOutputStream());
									dout.writeUTF(msg);
								}
								else if(cs.equalsIgnoreCase("CS3"))
								{
									Thread.sleep(1000);
									arrow9 = new ImageIcon(this.getClass().getResource("a33g.png"));
									arrow9l.setIcon(arrow9);

									Thread.sleep(2000);
									tenl.setVisible(false);
									Thread.sleep(1000);
									tenl.setVisible(true);
									Thread.sleep(1000);
									tenl.setVisible(false);
									Thread.sleep(1000);
									tenl.setVisible(true);

									clear();
									
									connect.createStatement().executeUpdate("insert into Part values('"+owner+"','"+part2+"','"+cs+"','"+dt+"')");
									
									Socket soc = new Socket("localhost",3333);
									DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
									dos.writeUTF(owner);
									dos.writeUTF(fname);
									dos.writeUTF(sk);
									dos.writeUTF(content);
									dos.writeUTF(dt);
									
									DataInputStream di =new DataInputStream(soc.getInputStream());
									String msg=di.readUTF();
									
									DataOutputStream dout =new DataOutputStream(s.getOutputStream());
									dout.writeUTF(msg);
									
								}
							}
							if(Integer.parseInt(e2)<=ct)
							{
								System.out.println("Entered port 3009 st1 e2 <= ct");
								Thread.sleep(2000);
								lab2.setVisible(false);
								Thread.sleep(1000);
								lab2.setVisible(true);
								Thread.sleep(1000);
								lab2.setVisible(false);
								Thread.sleep(1000);
								lab2.setVisible(true);
								
								Thread.sleep(2000);
								arrow3 = new ImageIcon(this.getClass().getResource("a3g.png"));
								arrow3l.setIcon(arrow3);
								
								Thread.sleep(2000);
								fourl.setVisible(false);
								Thread.sleep(1000);
								fourl.setVisible(true);
								Thread.sleep(1000);
								fourl.setVisible(false);
								Thread.sleep(1000);
								fourl.setVisible(true);
								
								connect.createStatement().executeUpdate("update CSDetails set status='"+over+"' where csname='"+part2+"'");
								System.out.println("Entered port 3009 st1 e1 <= ct updated partion2 as idle");
								if(st3.equalsIgnoreCase("Normal"))
								{
									System.out.println("Entered port 3009 st3");
									if(Integer.parseInt(e3)>=ct)
									{
										System.out.println("Entered port 3009 st1 e3 >= ct");
										int ene = Integer.parseInt(e3)-ct;
										connect.createStatement().executeUpdate("update CSDetails set energy='"+ene+"' where csname='"+part3+"'");
										
										if(cs.equalsIgnoreCase("CS1"))
										{
											Thread.sleep(1000);
											arrow10 = new ImageIcon(this.getClass().getResource("a11g.png"));
											arrow10l.setIcon(arrow10);

											Thread.sleep(2000);
											elevenl.setVisible(false);
											Thread.sleep(1000);
											elevenl.setVisible(true);
											Thread.sleep(1000);
											elevenl.setVisible(false);
											Thread.sleep(1000);
											elevenl.setVisible(true);

											clear();
											
											connect.createStatement().executeUpdate("insert into Part values('"+owner+"','"+part3+"','"+cs+"','"+dt+"')");
											
											Socket soc = new Socket("localhost",1111);
											DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
											dos.writeUTF(owner);
											dos.writeUTF(fname);
											dos.writeUTF(sk);
											dos.writeUTF(content);
											dos.writeUTF(dt);
											
											DataInputStream di =new DataInputStream(soc.getInputStream());
											String msg=di.readUTF();
											
											DataOutputStream dout =new DataOutputStream(s.getOutputStream());
											dout.writeUTF(msg);
										}
										else if(cs.equalsIgnoreCase("CS2"))
										{
											Thread.sleep(1000);
											arrow11 = new ImageIcon(this.getClass().getResource("a2g.png"));
											arrow11l.setIcon(arrow11);

											Thread.sleep(2000);
											twelvel.setVisible(false);
											Thread.sleep(1000);
											twelvel.setVisible(true);
											Thread.sleep(1000);
											twelvel.setVisible(false);
											Thread.sleep(1000);
											twelvel.setVisible(true);

											clear();
											
											connect.createStatement().executeUpdate("insert into Part values('"+owner+"','"+part3+"','"+cs+"','"+dt+"')");
											
											Socket soc = new Socket("localhost",2222);
											DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
											dos.writeUTF(owner);
											dos.writeUTF(fname);
											dos.writeUTF(sk);
											dos.writeUTF(content);
											dos.writeUTF(dt);
											
											DataInputStream di =new DataInputStream(soc.getInputStream());
											String msg=di.readUTF();
											
											DataOutputStream dout =new DataOutputStream(s.getOutputStream());
											dout.writeUTF(msg);
										}
										else if(cs.equalsIgnoreCase("CS3"))
										{
											Thread.sleep(1000);
											arrow12 = new ImageIcon(this.getClass().getResource("a33g.png"));
											arrow12l.setIcon(arrow12);

											Thread.sleep(2000);
											thirteenl.setVisible(false);
											Thread.sleep(1000);
											thirteenl.setVisible(true);
											Thread.sleep(1000);
											thirteenl.setVisible(false);
											Thread.sleep(1000);
											thirteenl.setVisible(true);

											clear();
											
											connect.createStatement().executeUpdate("insert into Part values('"+owner+"','"+part3+"','"+cs+"','"+dt+"')");
											
											Socket soc = new Socket("localhost",3333);
											DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
											dos.writeUTF(owner);
											dos.writeUTF(fname);
											dos.writeUTF(sk);
											dos.writeUTF(content);
											dos.writeUTF(dt);
											
											DataInputStream di =new DataInputStream(soc.getInputStream());
											String msg=di.readUTF();
											
											DataOutputStream dout =new DataOutputStream(s.getOutputStream());
											dout.writeUTF(msg);
											
										}
									}
									if(Integer.parseInt(e3)<=ct)
									{
										System.out.println("Entered port 3009 st1 e3 <= ct");
										Thread.sleep(2000);
										lab3.setVisible(false);
										Thread.sleep(1000);
										lab3.setVisible(true);
										Thread.sleep(1000);
										lab3.setVisible(false);
										Thread.sleep(1000);
										lab3.setVisible(true);
										
										String clouds1="CS3";
										connect.createStatement().executeUpdate("update CSDetails set status='"+over+"' where csname='"+part3+"'");
										System.out.println("Entered port 3009 st1 e3 <= ct updated partition 3 idle");
										call(s);
									}
								}
								else
								{
									System.out.println("Entered port 3009 st3 where st3 is not Normal");
									Thread.sleep(2000);
									lab3.setVisible(false);
									Thread.sleep(1000);
									lab3.setVisible(true);
									Thread.sleep(1000);
									lab3.setVisible(false);
									Thread.sleep(1000);
									lab3.setVisible(true);
									
									String clouds1="CS3";
									connect.createStatement().executeUpdate("update CSDetails set status='"+over+"' where csname='"+part3+"'");
									
									call(s);
								}
								
							}
						}
						else
						{
							System.out.println("Entered port 3009 st3 when st2 is not Normal and checking if st3 is normal");
							Thread.sleep(2000);
							lab2.setVisible(false);
							Thread.sleep(1000);
							lab2.setVisible(true);
							Thread.sleep(1000);
							lab2.setVisible(false);
							Thread.sleep(1000);
							lab2.setVisible(true);
							
							Thread.sleep(2000);
							arrow3 = new ImageIcon(this.getClass().getResource("a3g.png"));
							arrow3l.setIcon(arrow3);
							
							Thread.sleep(2000);
							fourl.setVisible(false);
							Thread.sleep(1000);
							fourl.setVisible(true);
							Thread.sleep(1000);
							fourl.setVisible(false);
							Thread.sleep(1000);
							fourl.setVisible(true);
							
							connect.createStatement().executeUpdate("update CSDetails set status='"+over+"' where csname='"+part2+"'");
							System.out.println("Entered port 3009 st2 is not normal and set to idle");
							if(st3.equalsIgnoreCase("Normal"))
							{
								System.out.println("Entered port 3009 st2 is not normal so s3 is noraml and being checked");
								if(Integer.parseInt(e3)>=ct)
								{
									System.out.println("Entered port 3009 st3 e3 >= ct");
									int ene = Integer.parseInt(e3)-ct;
									connect.createStatement().executeUpdate("update CSDetails set energy='"+ene+"' where csname='"+part3+"'");
									
									if(cs.equalsIgnoreCase("CS1"))
									{
										Thread.sleep(1000);
										arrow10 = new ImageIcon(this.getClass().getResource("a11g.png"));
										arrow10l.setIcon(arrow10);

										Thread.sleep(2000);
										elevenl.setVisible(false);
										Thread.sleep(1000);
										elevenl.setVisible(true);
										Thread.sleep(1000);
										elevenl.setVisible(false);
										Thread.sleep(1000);
										elevenl.setVisible(true);

										clear();
										
										connect.createStatement().executeUpdate("insert into Part values('"+owner+"','"+part3+"','"+cs+"','"+dt+"')");
										
										Socket soc = new Socket("localhost",1111);
										DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
										dos.writeUTF(owner);
										dos.writeUTF(fname);
										dos.writeUTF(sk);
										dos.writeUTF(content);
										dos.writeUTF(dt);
										
										DataInputStream di =new DataInputStream(soc.getInputStream());
										String msg=di.readUTF();
										
										DataOutputStream dout =new DataOutputStream(s.getOutputStream());
										dout.writeUTF(msg);
									}
									else if(cs.equalsIgnoreCase("CS2"))
									{
										Thread.sleep(1000);
										arrow11 = new ImageIcon(this.getClass().getResource("a2g.png"));
										arrow11l.setIcon(arrow11);

										Thread.sleep(2000);
										twelvel.setVisible(false);
										Thread.sleep(1000);
										twelvel.setVisible(true);
										Thread.sleep(1000);
										twelvel.setVisible(false);
										Thread.sleep(1000);
										twelvel.setVisible(true);

										clear();
										
										connect.createStatement().executeUpdate("insert into Part values('"+owner+"','"+part3+"','"+cs+"','"+dt+"')");
										
										Socket soc = new Socket("localhost",2222);
										DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
										dos.writeUTF(owner);
										dos.writeUTF(fname);
										dos.writeUTF(sk);
										dos.writeUTF(content);
										dos.writeUTF(dt);
										
										DataInputStream di =new DataInputStream(soc.getInputStream());
										String msg=di.readUTF();
										
										DataOutputStream dout =new DataOutputStream(s.getOutputStream());
										dout.writeUTF(msg);
									}
									else if(cs.equalsIgnoreCase("CS3"))
									{
										Thread.sleep(1000);
										arrow12 = new ImageIcon(this.getClass().getResource("a33g.png"));
										arrow12l.setIcon(arrow12);

										Thread.sleep(2000);
										thirteenl.setVisible(false);
										Thread.sleep(1000);
										thirteenl.setVisible(true);
										Thread.sleep(1000);
										thirteenl.setVisible(false);
										Thread.sleep(1000);
										thirteenl.setVisible(true);

										clear();
										
										connect.createStatement().executeUpdate("insert into Part values('"+owner+"','"+part3+"','"+cs+"','"+dt+"')");
										
										Socket soc = new Socket("localhost",3333);
										DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
										dos.writeUTF(owner);
										dos.writeUTF(fname);
										dos.writeUTF(sk);
										dos.writeUTF(content);
										dos.writeUTF(dt);
										
										DataInputStream di =new DataInputStream(soc.getInputStream());
										String msg=di.readUTF();
										
										DataOutputStream dout =new DataOutputStream(s.getOutputStream());
										dout.writeUTF(msg);
										
									}
								}
								else
								{
									System.out.println("Entered port 3009 st2 is not noral , st3 is normal but et3 <= ct");
									Thread.sleep(2000);
									lab3.setVisible(false);
									Thread.sleep(1000);
									lab3.setVisible(true);
									Thread.sleep(1000);
									lab3.setVisible(false);
									Thread.sleep(1000);
									lab3.setVisible(true);
									
									String clouds1="CS3";
									connect.createStatement().executeUpdate("update CSDetails set status='"+over+"' where csname='"+part3+"'");
									System.out.println("Entered port 3009 st2 is not noral , st3 is normal but et3 <= ct updated idle");
									call(s);
								}
							}
							else
							{
								System.out.println("Entered port 3009 st2 is not normal , st3 is not normal");
								Thread.sleep(2000);
								lab3.setVisible(false);
								Thread.sleep(1000);
								lab3.setVisible(true);
								Thread.sleep(1000);
								lab3.setVisible(false);
								Thread.sleep(1000);
								lab3.setVisible(true);
								
								String clouds1="CS3";
								connect.createStatement().executeUpdate("update CSDetails set status='"+over+"' where csname='"+part3+"'");
								
								call(s);
							}
							
						}
					
					}
				}
				else
				{
					System.out.println("Entered port 3009 st1 is not normal, so checking st2 and st3 if they are normal");
					Thread.sleep(2000);
					lab1.setVisible(false);
					Thread.sleep(1000);
					lab1.setVisible(true);
					Thread.sleep(1000);
					lab1.setVisible(false);
					Thread.sleep(1000);
					lab1.setVisible(true);
					
					connect.createStatement().executeUpdate("update CSDetails set status='"+over+"' where csname='"+part1+"'");
					
					Thread.sleep(2000);
					arrow2 = new ImageIcon(this.getClass().getResource("a2g.png"));
					arrow2l.setIcon(arrow2);
					
					Thread.sleep(2000);
					threel.setVisible(false);
					Thread.sleep(1000);
					threel.setVisible(true);
					Thread.sleep(1000);
					threel.setVisible(false);
					Thread.sleep(1000);
					threel.setVisible(true);
					
					if(st2.equalsIgnoreCase("Normal"))
					{
						System.out.println("Entered port 3009 st1 is not normal, so checking st2 is normal");
						if(Integer.parseInt(e2)>=ct)
						{
							System.out.println("Entered port 3009 st1 is not normal, st2 normal, e2 >= ct");
							int ene = Integer.parseInt(e2)-ct;
							connect.createStatement().executeUpdate("update CSDetails set energy='"+ene+"' where csname='"+part2+"'");
							connect.createStatement().executeUpdate("insert into Part values('"+owner+"','"+part2+"','"+cs+"','"+dt+"')");
							
							if(cs.equalsIgnoreCase("CS1"))
							{
								Thread.sleep(1000);
								arrow7 = new ImageIcon(this.getClass().getResource("a11g.png"));
								arrow7l.setIcon(arrow7);

								Thread.sleep(2000);
								eightl.setVisible(false);
								Thread.sleep(1000);
								eightl.setVisible(true);
								Thread.sleep(1000);
								eightl.setVisible(false);
								Thread.sleep(1000);
								eightl.setVisible(true);

								clear();
								
								Socket soc = new Socket("localhost",1111);
								DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
								dos.writeUTF(owner);
								dos.writeUTF(fname);
								dos.writeUTF(sk);
								dos.writeUTF(content);
								dos.writeUTF(dt);
								
								DataInputStream di =new DataInputStream(soc.getInputStream());
								String msg=di.readUTF();
								
								DataOutputStream dout =new DataOutputStream(s.getOutputStream());
								dout.writeUTF(msg);
							}
							else if(cs.equalsIgnoreCase("CS2"))
							{
								Thread.sleep(1000);
								arrow8 = new ImageIcon(this.getClass().getResource("a2g.png"));
								arrow8l.setIcon(arrow8);

								Thread.sleep(2000);
								ninel.setVisible(false);
								Thread.sleep(1000);
								ninel.setVisible(true);
								Thread.sleep(1000);
								ninel.setVisible(false);
								Thread.sleep(1000);
								ninel.setVisible(true);

								clear();
								
								connect.createStatement().executeUpdate("insert into Part values('"+owner+"','"+part2+"','"+cs+"','"+dt+"')");
								
								Socket soc = new Socket("localhost",2222);
								DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
								dos.writeUTF(owner);
								dos.writeUTF(fname);
								dos.writeUTF(sk);
								dos.writeUTF(content);
								dos.writeUTF(dt);
								
								DataInputStream di =new DataInputStream(soc.getInputStream());
								String msg=di.readUTF();
								
								DataOutputStream dout =new DataOutputStream(s.getOutputStream());
								dout.writeUTF(msg);
							}
							else if(cs.equalsIgnoreCase("CS3"))
							{
								Thread.sleep(1000);
								arrow9 = new ImageIcon(this.getClass().getResource("a33g.png"));
								arrow9l.setIcon(arrow9);

								Thread.sleep(2000);
								tenl.setVisible(false);
								Thread.sleep(1000);
								tenl.setVisible(true);
								Thread.sleep(1000);
								tenl.setVisible(false);
								Thread.sleep(1000);
								tenl.setVisible(true);

								clear();
								
								connect.createStatement().executeUpdate("insert into Part values('"+owner+"','"+part2+"','"+cs+"','"+dt+"')");
								
								Socket soc = new Socket("localhost",3333);
								DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
								dos.writeUTF(owner);
								dos.writeUTF(fname);
								dos.writeUTF(sk);
								dos.writeUTF(content);
								dos.writeUTF(dt);
								
								DataInputStream di =new DataInputStream(soc.getInputStream());
								String msg=di.readUTF();
								
								DataOutputStream dout =new DataOutputStream(s.getOutputStream());
								dout.writeUTF(msg);
								
							}
						}
						if(Integer.parseInt(e2)<=ct)
						{
							System.out.println("Entered port 3009 st1 is not normal, st2 normal, e2 <= ct upadted partition 2 idle");
							Thread.sleep(2000);
							lab2.setVisible(false);
							Thread.sleep(1000);
							lab2.setVisible(true);
							Thread.sleep(1000);
							lab2.setVisible(false);
							Thread.sleep(1000);
							lab2.setVisible(true);
							
							Thread.sleep(2000);
							arrow3 = new ImageIcon(this.getClass().getResource("a3g.png"));
							arrow3l.setIcon(arrow3);
							
							Thread.sleep(2000);
							fourl.setVisible(false);
							Thread.sleep(1000);
							fourl.setVisible(true);
							Thread.sleep(1000);
							fourl.setVisible(false);
							Thread.sleep(1000);
							fourl.setVisible(true);
							
							connect.createStatement().executeUpdate("update CSDetails set status='"+over+"' where csname='"+part2+"'");
							
							if(st3.equalsIgnoreCase("Normal"))
							{
								System.out.println("Entered port 3009 st1 is not normal, st2 normal, e2 <= ct , st3 is normal");
								if(Integer.parseInt(e3)>=ct)
								{
									System.out.println("Entered port 3009 st1 is not normal, st2 normal, e2 <= ct , st3 is normal, e3 >= ct");
									int ene = Integer.parseInt(e3)-ct;
									connect.createStatement().executeUpdate("update CSDetails set energy='"+ene+"' where csname='"+part3+"'");
									
									if(cs.equalsIgnoreCase("CS1"))
									{
										Thread.sleep(1000);
										arrow10 = new ImageIcon(this.getClass().getResource("a11g.png"));
										arrow10l.setIcon(arrow10);

										Thread.sleep(2000);
										elevenl.setVisible(false);
										Thread.sleep(1000);
										elevenl.setVisible(true);
										Thread.sleep(1000);
										elevenl.setVisible(false);
										Thread.sleep(1000);
										elevenl.setVisible(true);

										clear();
										
										connect.createStatement().executeUpdate("insert into Part values('"+owner+"','"+part3+"','"+cs+"','"+dt+"')");
										
										Socket soc = new Socket("localhost",1111);
										DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
										dos.writeUTF(owner);
										dos.writeUTF(fname);
										dos.writeUTF(sk);
										dos.writeUTF(content);
										dos.writeUTF(dt);
										
										DataInputStream di =new DataInputStream(soc.getInputStream());
										String msg=di.readUTF();
										
										DataOutputStream dout =new DataOutputStream(s.getOutputStream());
										dout.writeUTF(msg);
									}
									else if(cs.equalsIgnoreCase("CS2"))
									{
										Thread.sleep(1000);
										arrow11 = new ImageIcon(this.getClass().getResource("a2g.png"));
										arrow11l.setIcon(arrow11);

										Thread.sleep(2000);
										twelvel.setVisible(false);
										Thread.sleep(1000);
										twelvel.setVisible(true);
										Thread.sleep(1000);
										twelvel.setVisible(false);
										Thread.sleep(1000);
										twelvel.setVisible(true);

										clear();
										
										connect.createStatement().executeUpdate("insert into Part values('"+owner+"','"+part3+"','"+cs+"','"+dt+"')");
										
										Socket soc = new Socket("localhost",2222);
										DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
										dos.writeUTF(owner);
										dos.writeUTF(fname);
										dos.writeUTF(sk);
										dos.writeUTF(content);
										dos.writeUTF(dt);
										
										DataInputStream di =new DataInputStream(soc.getInputStream());
										String msg=di.readUTF();
										
										DataOutputStream dout =new DataOutputStream(s.getOutputStream());
										dout.writeUTF(msg);
									}
									else if(cs.equalsIgnoreCase("CS3"))
									{
										Thread.sleep(1000);
										arrow12 = new ImageIcon(this.getClass().getResource("a33g.png"));
										arrow12l.setIcon(arrow12);

										Thread.sleep(2000);
										thirteenl.setVisible(false);
										Thread.sleep(1000);
										thirteenl.setVisible(true);
										Thread.sleep(1000);
										thirteenl.setVisible(false);
										Thread.sleep(1000);
										thirteenl.setVisible(true);

										clear();
										
										connect.createStatement().executeUpdate("insert into Part values('"+owner+"','"+part3+"','"+cs+"','"+dt+"')");
										
										Socket soc = new Socket("localhost",3333);
										DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
										dos.writeUTF(owner);
										dos.writeUTF(fname);
										dos.writeUTF(sk);
										dos.writeUTF(content);
										dos.writeUTF(dt);
										
										DataInputStream di =new DataInputStream(soc.getInputStream());
										String msg=di.readUTF();
										
										DataOutputStream dout =new DataOutputStream(s.getOutputStream());
										dout.writeUTF(msg);
										
									}
								}
								else
								{
									Thread.sleep(2000);
									lab3.setVisible(false);
									Thread.sleep(1000);
									lab3.setVisible(true);
									Thread.sleep(1000);
									lab3.setVisible(false);
									Thread.sleep(1000);
									lab3.setVisible(true);
									
									String clouds1="CS3";
									connect.createStatement().executeUpdate("update CSDetails set status='"+over+"' where csname='"+part3+"'");
									
									call(s);
								}
							}
							else
							{
								System.out.println("Entered port 3009 st1 is not normal, st2 normal, e2 <= ct , st3 is normal, e3 <= ct updated partition 3 idle");

								Thread.sleep(2000);
								lab3.setVisible(false);
								Thread.sleep(1000);
								lab3.setVisible(true);
								Thread.sleep(1000);
								lab3.setVisible(false);
								Thread.sleep(1000);
								lab3.setVisible(true);
								
								String clouds1="CS3";
								connect.createStatement().executeUpdate("update CSDetails set status='"+over+"' where csname='"+part3+"'");
								
								call(s);
							}
							
						}
					}
					else
					{
						System.out.println("Entered port 3009 st1 is not normal, st2 not normal checking if st3 is noraml");

						Thread.sleep(2000);
						lab2.setVisible(false);
						Thread.sleep(1000);
						lab2.setVisible(true);
						Thread.sleep(1000);
						lab2.setVisible(false);
						Thread.sleep(1000);
						lab2.setVisible(true);
						
						Thread.sleep(2000);
						arrow3 = new ImageIcon(this.getClass().getResource("a3g.png"));
						arrow3l.setIcon(arrow3);
						
						Thread.sleep(2000);
						fourl.setVisible(false);
						Thread.sleep(1000);
						fourl.setVisible(true);
						Thread.sleep(1000);
						fourl.setVisible(false);
						Thread.sleep(1000);
						fourl.setVisible(true);
						
						connect.createStatement().executeUpdate("update CSDetails set status='"+over+"' where csname='"+part2+"'");
						
						if(st3.equalsIgnoreCase("Normal"))
						{
							System.out.println("Entered port 3009 st1 is not normal, st2 not normal, st3 is noraml");
							if(Integer.parseInt(e3)>=ct)
							{
								System.out.println("Entered port 3009 st1 is not normal, st2 not normal, st3 is noraml e3 >= ct ");
								int ene = Integer.parseInt(e3)-ct;
								connect.createStatement().executeUpdate("update CSDetails set energy='"+ene+"' where csname='"+part3+"'");
								
								if(cs.equalsIgnoreCase("CS1"))
								{
									Thread.sleep(1000);
									arrow10 = new ImageIcon(this.getClass().getResource("a11g.png"));
									arrow10l.setIcon(arrow10);

									Thread.sleep(2000);
									elevenl.setVisible(false);
									Thread.sleep(1000);
									elevenl.setVisible(true);
									Thread.sleep(1000);
									elevenl.setVisible(false);
									Thread.sleep(1000);
									elevenl.setVisible(true);

									clear();
									
									connect.createStatement().executeUpdate("insert into Part values('"+owner+"','"+part3+"','"+cs+"','"+dt+"')");
									
									Socket soc = new Socket("localhost",1111);
									DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
									dos.writeUTF(owner);
									dos.writeUTF(fname);
									dos.writeUTF(sk);
									dos.writeUTF(content);
									dos.writeUTF(dt);
									
									DataInputStream di =new DataInputStream(soc.getInputStream());
									String msg=di.readUTF();
									
									DataOutputStream dout =new DataOutputStream(s.getOutputStream());
									dout.writeUTF(msg);
								}
								else if(cs.equalsIgnoreCase("CS2"))
								{
									Thread.sleep(1000);
									arrow11 = new ImageIcon(this.getClass().getResource("a2g.png"));
									arrow11l.setIcon(arrow11);

									Thread.sleep(2000);
									twelvel.setVisible(false);
									Thread.sleep(1000);
									twelvel.setVisible(true);
									Thread.sleep(1000);
									twelvel.setVisible(false);
									Thread.sleep(1000);
									twelvel.setVisible(true);

									clear();
									
									connect.createStatement().executeUpdate("insert into Part values('"+owner+"','"+part3+"','"+cs+"','"+dt+"')");
									
									Socket soc = new Socket("localhost",2222);
									DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
									dos.writeUTF(owner);
									dos.writeUTF(fname);
									dos.writeUTF(sk);
									dos.writeUTF(content);
									dos.writeUTF(dt);
									
									DataInputStream di =new DataInputStream(soc.getInputStream());
									String msg=di.readUTF();
									
									DataOutputStream dout =new DataOutputStream(s.getOutputStream());
									dout.writeUTF(msg);
								}
								else if(cs.equalsIgnoreCase("CS3"))
								{
									Thread.sleep(1000);
									arrow12 = new ImageIcon(this.getClass().getResource("a33g.png"));
									arrow12l.setIcon(arrow12);

									Thread.sleep(2000);
									thirteenl.setVisible(false);
									Thread.sleep(1000);
									thirteenl.setVisible(true);
									Thread.sleep(1000);
									thirteenl.setVisible(false);
									Thread.sleep(1000);
									thirteenl.setVisible(true);

									clear();
									
									connect.createStatement().executeUpdate("insert into Part values('"+owner+"','"+part3+"','"+cs+"','"+dt+"')");
									
									Socket soc = new Socket("localhost",3333);
									DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
									dos.writeUTF(owner);
									dos.writeUTF(fname);
									dos.writeUTF(sk);
									dos.writeUTF(content);
									dos.writeUTF(dt);
									
									DataInputStream di =new DataInputStream(soc.getInputStream());
									String msg=di.readUTF();
									
									DataOutputStream dout =new DataOutputStream(s.getOutputStream());
									dout.writeUTF(msg);
									
								}
							}
							if(Integer.parseInt(e3)<=ct)
							{
								System.out.println("Entered port 3009 st1 is not normal, st2 not normal, st3 is noraml e3 <= ct upadted partition 3 idle");
								Thread.sleep(2000);
								lab3.setVisible(false);
								Thread.sleep(1000);
								lab3.setVisible(true);
								Thread.sleep(1000);
								lab3.setVisible(false);
								Thread.sleep(1000);
								lab3.setVisible(true);
								
								String clouds1="CS3";
								connect.createStatement().executeUpdate("update CSDetails set status='"+over+"' where csname='"+part3+"'");
								
								call(s);
							}
						}
						else
						{
							System.out.println("Entered port 3009 st1 is not normal, st2 not normal, st3 is not noraml");
							Thread.sleep(2000);
							lab3.setVisible(false);
							Thread.sleep(1000);
							lab3.setVisible(true);
							Thread.sleep(1000);
							lab3.setVisible(false);
							Thread.sleep(1000);
							lab3.setVisible(true);
							
							String clouds1="CS3";
							connect.createStatement().executeUpdate("update CSDetails set status='"+over+"' where csname='"+part3+"'");
							
							call(s);
						}
						
					}
				
				}
				}
				
			}
			
			if(this.port==3090)
			{
				try {
						ServerSocket sc =new ServerSocket(3090);
						
						while(true)
						{
							
							s = sc.accept();
							
							DataInputStream din = new DataInputStream(s.getInputStream());
							
							String name = din.readUTF();
							String pass = din.readUTF();
							String email = din.readUTF();
							String mob = din.readUTF();
							String address = din.readUTF();
							String dataowner="Data Owner";
							

							connect.createStatement().executeUpdate("insert into Register(name,pass,email,mobile,address,user) values('"+name+"','"+pass+"','"+email+"','"+mob+"','"+address+"','"+dataowner+"')");
							
							DataOutputStream dout =new DataOutputStream(s.getOutputStream());
							dout.writeUTF("success");
							}
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				
			}
			if (this.port == 4090) {
				 
				try {
					
						ServerSocket sc =new ServerSocket(4090);
						
						while(true)
						{
							
							s = sc.accept();
							
							DataInputStream din = new DataInputStream(s.getInputStream());
							String name = din.readUTF();
							String pass = din.readUTF();
							
					
							
							String user="Data Owner";
							ResultSet rs=connect.createStatement().executeQuery("select * from Register where name='"+name+"' and pass='"+pass+"' and user='"+user+"'");
							if(rs.next()==true)
							{
								DataOutputStream dout =new DataOutputStream(s.getOutputStream());
								dout.writeUTF("yes");
							}
							else
							{
								DataOutputStream dout =new DataOutputStream(s.getOutputStream());
								dout.writeUTF("no");
							}
							
						}
				}	
						catch (Exception e) {
						e.printStackTrace();
					}
						
						
				}
			if (this.port == 5757) {
				 
				try {
					
						ServerSocket sc =new ServerSocket(5757);
						
						while(true)
						{
						
						s = sc.accept();
						
						DataInputStream din = new DataInputStream(s.getInputStream());
						
						
						String name = din.readUTF();
						String pass = din.readUTF();
						String email = din.readUTF();
						String mob = din.readUTF();
						String address = din.readUTF();
						String enduser="End User";
						
//						
						connect.createStatement().executeUpdate("insert into Register(name,pass,email,mobile,address,user) values('"+name+"','"+pass+"','"+email+"','"+mob+"','"+address+"','"+enduser+"')");
						
						DataOutputStream dout =new DataOutputStream(s.getOutputStream());
						dout.writeUTF("success");
						}
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				
				} 
			
			if(this.port==7373)
			{
				try {
						ServerSocket sc =new ServerSocket(7373);
						
						while(true)
						{
						
						s = sc.accept();
						
						DataInputStream din = new DataInputStream(s.getInputStream());
						String name = din.readUTF();
						String pass = din.readUTF();

						
						String data="End User";
						ResultSet rs=connect.createStatement().executeQuery("select * from Register where name='"+name+"' and pass='"+pass+"' and user='"+data+"'");
						if(rs.next()==true)
						{
							DataOutputStream dout =new DataOutputStream(s.getOutputStream());
							dout.writeUTF("yes");
						}
						else
						{
							DataOutputStream dout =new DataOutputStream(s.getOutputStream());
							dout.writeUTF("no");
						}
						
					}
				}	
						catch (Exception e) {
						e.printStackTrace();
					}
						
			}
			
			
			/*if(this.port==1234)
			{
				System.out.println("Entered port 1234");
				try {
						ServerSocket sc =new ServerSocket(1234);
						
						while(true)
						{
						
						s = sc.accept();
						
						DataInputStream din = new DataInputStream(s.getInputStream());
						
						owner = din.readUTF();
						fname = din.readUTF();
						sk = din.readUTF();
						cs = din.readUTF();
						content = din.readUTF();
						dt= din.readUTF();

						ct = content.length();
						
						
						String over = "Idle";
						
						
						ResultSet rs=connect.createStatement().executeQuery("select * from CSDetails where csname='"+part1+"'");
						if(rs.next()==true)
						{
							e1=rs.getString(2);
							st1=rs.getString(3);
						}
						
						ResultSet rs1=connect.createStatement().executeQuery("select * from CSDetails where csname='"+part2+"'");
						if(rs1.next()==true)
						{
							e2=rs1.getString(2);
							st2=rs1.getString(3);
						}
						
						ResultSet rs2=connect.createStatement().executeQuery("select * from CSDetails where csname='"+part3+"'");
						if(rs2.next()==true)
						{
							e3=rs2.getString(2);
							st3=rs2.getString(3);
						}
						
						Thread.sleep(2000);
						onel.setVisible(false);
						Thread.sleep(1000);
						onel.setVisible(true);
						Thread.sleep(1000);
						onel.setVisible(false);
						Thread.sleep(1000);
						onel.setVisible(true);
						
						Thread.sleep(1000);
						arrow1 = new ImageIcon(this.getClass().getResource("a1g.png"));
						arrow1l.setIcon(arrow1);
						
						Thread.sleep(2000);
						twol.setVisible(false);
						Thread.sleep(1000);
						twol.setVisible(true);
						Thread.sleep(1000);
						twol.setVisible(false);
						Thread.sleep(1000);
						twol.setVisible(true);
						
						if(st1.equalsIgnoreCase("Normal"))
						{
							if(Integer.parseInt(e1)>=ct)
							{
								int ene = Integer.parseInt(e1)-ct;
								connect.createStatement().executeUpdate("update CSDetails set energy='"+ene+"' where csname='"+part1+"'");
								
								if(cs.equalsIgnoreCase("CS1"))
								{
									Thread.sleep(1000);
									arrow4 = new ImageIcon(this.getClass().getResource("a11g.png"));
									arrow4l.setIcon(arrow4);
									
									Thread.sleep(2000);
									fivel.setVisible(false);
									Thread.sleep(1000);
									fivel.setVisible(true);
									Thread.sleep(1000);
									fivel.setVisible(false);
									Thread.sleep(1000);
									fivel.setVisible(true);
									
									clear();
									
									connect.createStatement().executeUpdate("insert into Part values('"+owner+"','"+part1+"','"+cs+"','"+dt+"')");
									
									Socket soc = new Socket("localhost",1111);
									DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
									dos.writeUTF(owner);
									dos.writeUTF(fname);
									dos.writeUTF(sk);
									dos.writeUTF(content);
									dos.writeUTF(dt);
									
									DataInputStream di =new DataInputStream(soc.getInputStream());
									String msg=di.readUTF();
									
									DataOutputStream dout =new DataOutputStream(s.getOutputStream());
									dout.writeUTF(msg);
								}
								else if(cs.equalsIgnoreCase("CS2"))
								{
									Thread.sleep(1000);
									arrow5 = new ImageIcon(this.getClass().getResource("a2g.png"));
									arrow5l.setIcon(arrow5);
									
									Thread.sleep(2000);
									sixl.setVisible(false);
									Thread.sleep(1000);
									sixl.setVisible(true);
									Thread.sleep(1000);
									sixl.setVisible(false);
									Thread.sleep(1000);
									sixl.setVisible(true);
									
									clear();
									
									connect.createStatement().executeUpdate("insert into Part values('"+owner+"','"+part1+"','"+cs+"','"+dt+"')");
									
									Socket soc = new Socket("localhost",2222);
									DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
									dos.writeUTF(owner);
									dos.writeUTF(fname);
									dos.writeUTF(sk);
									dos.writeUTF(content);
									dos.writeUTF(dt);
									
									DataInputStream di =new DataInputStream(soc.getInputStream());
									String msg=di.readUTF();
									
									DataOutputStream dout =new DataOutputStream(s.getOutputStream());
									dout.writeUTF(msg);
								}
								else if(cs.equalsIgnoreCase("CS3"))
								{
									Thread.sleep(1000);
									arrow6 = new ImageIcon(this.getClass().getResource("a33g.png"));
									arrow6l.setIcon(arrow6);
									
									Thread.sleep(2000);
									sevenl.setVisible(false);
									Thread.sleep(1000);
									sevenl.setVisible(true);
									Thread.sleep(1000);
									sevenl.setVisible(false);
									Thread.sleep(1000);
									sevenl.setVisible(true);
									
									clear();
									
									connect.createStatement().executeUpdate("insert into Part values('"+owner+"','"+part1+"','"+cs+"','"+dt+"')");
									
									Socket soc = new Socket("localhost",3333);
									DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
									dos.writeUTF(owner);
									dos.writeUTF(fname);
									dos.writeUTF(sk);
									dos.writeUTF(content);
									dos.writeUTF(dt);
									
									DataInputStream di =new DataInputStream(soc.getInputStream());
									String msg=di.readUTF();
									
									DataOutputStream dout =new DataOutputStream(s.getOutputStream());
									dout.writeUTF(msg);
									
								}
							}
							if(Integer.parseInt(e1)<=ct)
							{

								Thread.sleep(2000);
								lab1.setVisible(false);
								Thread.sleep(1000);
								lab1.setVisible(true);
								Thread.sleep(1000);
								lab1.setVisible(false);
								Thread.sleep(1000);
								lab1.setVisible(true);
								
								connect.createStatement().executeUpdate("update CSDetails set status='"+over+"' where csname='"+part1+"'");
								
								Thread.sleep(2000);
								arrow2 = new ImageIcon(this.getClass().getResource("a2g.png"));
								arrow2l.setIcon(arrow2);
								
								Thread.sleep(2000);
								threel.setVisible(false);
								Thread.sleep(1000);
								threel.setVisible(true);
								Thread.sleep(1000);
								threel.setVisible(false);
								Thread.sleep(1000);
								threel.setVisible(true);
								
								if(st2.equalsIgnoreCase("Normal"))
								{
									if(Integer.parseInt(e2)>=ct)
									{
										int ene = Integer.parseInt(e2)-ct;
										connect.createStatement().executeUpdate("update CSDetails set energy='"+ene+"' where csname='"+part2+"'");
										connect.createStatement().executeUpdate("insert into Part values('"+owner+"','"+part2+"','"+cs+"','"+dt+"')");
										
										if(cs.equalsIgnoreCase("CS1"))
										{
											Thread.sleep(1000);
											arrow7 = new ImageIcon(this.getClass().getResource("a11g.png"));
											arrow7l.setIcon(arrow7);

											Thread.sleep(2000);
											eightl.setVisible(false);
											Thread.sleep(1000);
											eightl.setVisible(true);
											Thread.sleep(1000);
											eightl.setVisible(false);
											Thread.sleep(1000);
											eightl.setVisible(true);

											clear();
											
											Socket soc = new Socket("localhost",1111);
											DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
											dos.writeUTF(owner);
											dos.writeUTF(fname);
											dos.writeUTF(sk);
											dos.writeUTF(content);
											dos.writeUTF(dt);
											
											DataInputStream di =new DataInputStream(soc.getInputStream());
											String msg=di.readUTF();
											
											DataOutputStream dout =new DataOutputStream(s.getOutputStream());
											dout.writeUTF(msg);
										}
										else if(cs.equalsIgnoreCase("CS2"))
										{
											Thread.sleep(1000);
											arrow8 = new ImageIcon(this.getClass().getResource("a2g.png"));
											arrow8l.setIcon(arrow8);

											Thread.sleep(2000);
											ninel.setVisible(false);
											Thread.sleep(1000);
											ninel.setVisible(true);
											Thread.sleep(1000);
											ninel.setVisible(false);
											Thread.sleep(1000);
											ninel.setVisible(true);

											clear();
											
											connect.createStatement().executeUpdate("insert into Part values('"+owner+"','"+part2+"','"+cs+"','"+dt+"')");
											
											Socket soc = new Socket("localhost",2222);
											DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
											dos.writeUTF(owner);
											dos.writeUTF(fname);
											dos.writeUTF(sk);
											dos.writeUTF(content);
											dos.writeUTF(dt);
											
											DataInputStream di =new DataInputStream(soc.getInputStream());
											String msg=di.readUTF();
											
											DataOutputStream dout =new DataOutputStream(s.getOutputStream());
											dout.writeUTF(msg);
										}
										else if(cs.equalsIgnoreCase("CS3"))
										{
											Thread.sleep(1000);
											arrow9 = new ImageIcon(this.getClass().getResource("a33g.png"));
											arrow9l.setIcon(arrow9);

											Thread.sleep(2000);
											tenl.setVisible(false);
											Thread.sleep(1000);
											tenl.setVisible(true);
											Thread.sleep(1000);
											tenl.setVisible(false);
											Thread.sleep(1000);
											tenl.setVisible(true);

											clear();
											
											connect.createStatement().executeUpdate("insert into Part values('"+owner+"','"+part2+"','"+cs+"','"+dt+"')");
											
											Socket soc = new Socket("localhost",3333);
											DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
											dos.writeUTF(owner);
											dos.writeUTF(fname);
											dos.writeUTF(sk);
											dos.writeUTF(content);
											dos.writeUTF(dt);
											
											DataInputStream di =new DataInputStream(soc.getInputStream());
											String msg=di.readUTF();
											
											DataOutputStream dout =new DataOutputStream(s.getOutputStream());
											dout.writeUTF(msg);
											
										}
									}
									if(Integer.parseInt(e2)<=ct)
									{
										Thread.sleep(2000);
										lab2.setVisible(false);
										Thread.sleep(1000);
										lab2.setVisible(true);
										Thread.sleep(1000);
										lab2.setVisible(false);
										Thread.sleep(1000);
										lab2.setVisible(true);
										
										Thread.sleep(2000);
										arrow3 = new ImageIcon(this.getClass().getResource("a3g.png"));
										arrow3l.setIcon(arrow3);
										
										Thread.sleep(2000);
										fourl.setVisible(false);
										Thread.sleep(1000);
										fourl.setVisible(true);
										Thread.sleep(1000);
										fourl.setVisible(false);
										Thread.sleep(1000);
										fourl.setVisible(true);
										
										connect.createStatement().executeUpdate("update CSDetails set status='"+over+"' where csname='"+part2+"'");
										
										if(st3.equalsIgnoreCase("Normal"))
										{
											if(Integer.parseInt(e3)>=ct)
											{
												int ene = Integer.parseInt(e3)-ct;
												connect.createStatement().executeUpdate("update CSDetails set energy='"+ene+"' where csname='"+part3+"'");
												
												if(cs.equalsIgnoreCase("CS1"))
												{
													Thread.sleep(1000);
													arrow10 = new ImageIcon(this.getClass().getResource("a11g.png"));
													arrow10l.setIcon(arrow10);

													Thread.sleep(2000);
													elevenl.setVisible(false);
													Thread.sleep(1000);
													elevenl.setVisible(true);
													Thread.sleep(1000);
													elevenl.setVisible(false);
													Thread.sleep(1000);
													elevenl.setVisible(true);

													clear();
													
													connect.createStatement().executeUpdate("insert into Part values('"+owner+"','"+part3+"','"+cs+"','"+dt+"')");
													
													Socket soc = new Socket("localhost",1111);
													DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
													dos.writeUTF(owner);
													dos.writeUTF(fname);
													dos.writeUTF(sk);
													dos.writeUTF(content);
													dos.writeUTF(dt);
													
													DataInputStream di =new DataInputStream(soc.getInputStream());
													String msg=di.readUTF();
													
													DataOutputStream dout =new DataOutputStream(s.getOutputStream());
													dout.writeUTF(msg);
												}
												else if(cs.equalsIgnoreCase("CS2"))
												{
													Thread.sleep(1000);
													arrow11 = new ImageIcon(this.getClass().getResource("a2g.png"));
													arrow11l.setIcon(arrow11);

													Thread.sleep(2000);
													twelvel.setVisible(false);
													Thread.sleep(1000);
													twelvel.setVisible(true);
													Thread.sleep(1000);
													twelvel.setVisible(false);
													Thread.sleep(1000);
													twelvel.setVisible(true);

													clear();
													
													connect.createStatement().executeUpdate("insert into Part values('"+owner+"','"+part3+"','"+cs+"','"+dt+"')");
													
													Socket soc = new Socket("localhost",2222);
													DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
													dos.writeUTF(owner);
													dos.writeUTF(fname);
													dos.writeUTF(sk);
													dos.writeUTF(content);
													dos.writeUTF(dt);
													
													DataInputStream di =new DataInputStream(soc.getInputStream());
													String msg=di.readUTF();
													
													DataOutputStream dout =new DataOutputStream(s.getOutputStream());
													dout.writeUTF(msg);
												}
												else if(cs.equalsIgnoreCase("CS3"))
												{
													Thread.sleep(1000);
													arrow12 = new ImageIcon(this.getClass().getResource("a33g.png"));
													arrow12l.setIcon(arrow12);

													Thread.sleep(2000);
													thirteenl.setVisible(false);
													Thread.sleep(1000);
													thirteenl.setVisible(true);
													Thread.sleep(1000);
													thirteenl.setVisible(false);
													Thread.sleep(1000);
													thirteenl.setVisible(true);

													clear();
													
													connect.createStatement().executeUpdate("insert into Part values('"+owner+"','"+part3+"','"+cs+"','"+dt+"')");
													
													Socket soc = new Socket("localhost",3333);
													DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
													dos.writeUTF(owner);
													dos.writeUTF(fname);
													dos.writeUTF(sk);
													dos.writeUTF(content);
													dos.writeUTF(dt);
													
													DataInputStream di =new DataInputStream(soc.getInputStream());
													String msg=di.readUTF();
													
													DataOutputStream dout =new DataOutputStream(s.getOutputStream());
													dout.writeUTF(msg);
													
												}
											}
											if(Integer.parseInt(e3)<=ct)
											{
												Thread.sleep(2000);
												lab3.setVisible(false);
												Thread.sleep(1000);
												lab3.setVisible(true);
												Thread.sleep(1000);
												lab3.setVisible(false);
												Thread.sleep(1000);
												lab3.setVisible(true);
												
												String clouds1="CS3";
												connect.createStatement().executeUpdate("update CSDetails set status='"+over+"' where csname='"+part3+"'");
												
												call(s);
											}
										}
										else
										{
											Thread.sleep(2000);
											lab3.setVisible(false);
											Thread.sleep(1000);
											lab3.setVisible(true);
											Thread.sleep(1000);
											lab3.setVisible(false);
											Thread.sleep(1000);
											lab3.setVisible(true);
											
											String clouds1="CS3";
											connect.createStatement().executeUpdate("update CSDetails set status='"+over+"' where csname='"+part3+"'");
											
											call(s);
										}
										
									}
								}
								else
								{
									Thread.sleep(2000);
									lab2.setVisible(false);
									Thread.sleep(1000);
									lab2.setVisible(true);
									Thread.sleep(1000);
									lab2.setVisible(false);
									Thread.sleep(1000);
									lab2.setVisible(true);
									
									Thread.sleep(2000);
									arrow3 = new ImageIcon(this.getClass().getResource("a3g.png"));
									arrow3l.setIcon(arrow3);
									
									Thread.sleep(2000);
									fourl.setVisible(false);
									Thread.sleep(1000);
									fourl.setVisible(true);
									Thread.sleep(1000);
									fourl.setVisible(false);
									Thread.sleep(1000);
									fourl.setVisible(true);
									
									connect.createStatement().executeUpdate("update CSDetails set status='"+over+"' where csname='"+part2+"'");
									
									if(st3.equalsIgnoreCase("Normal"))
									{
										if(Integer.parseInt(e3)>=ct)
										{
											int ene = Integer.parseInt(e3)-ct;
											connect.createStatement().executeUpdate("update CSDetails set energy='"+ene+"' where csname='"+part3+"'");
											
											if(cs.equalsIgnoreCase("CS1"))
											{
												Thread.sleep(1000);
												arrow10 = new ImageIcon(this.getClass().getResource("a11g.png"));
												arrow10l.setIcon(arrow10);

												Thread.sleep(2000);
												elevenl.setVisible(false);
												Thread.sleep(1000);
												elevenl.setVisible(true);
												Thread.sleep(1000);
												elevenl.setVisible(false);
												Thread.sleep(1000);
												elevenl.setVisible(true);

												clear();
												
												connect.createStatement().executeUpdate("insert into Part values('"+owner+"','"+part3+"','"+cs+"','"+dt+"')");
												
												Socket soc = new Socket("localhost",1111);
												DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
												dos.writeUTF(owner);
												dos.writeUTF(fname);
												dos.writeUTF(sk);
												dos.writeUTF(content);
												dos.writeUTF(dt);
												
												DataInputStream di =new DataInputStream(soc.getInputStream());
												String msg=di.readUTF();
												
												DataOutputStream dout =new DataOutputStream(s.getOutputStream());
												dout.writeUTF(msg);
											}
											else if(cs.equalsIgnoreCase("CS2"))
											{
												Thread.sleep(1000);
												arrow11 = new ImageIcon(this.getClass().getResource("a2g.png"));
												arrow11l.setIcon(arrow11);

												Thread.sleep(2000);
												twelvel.setVisible(false);
												Thread.sleep(1000);
												twelvel.setVisible(true);
												Thread.sleep(1000);
												twelvel.setVisible(false);
												Thread.sleep(1000);
												twelvel.setVisible(true);

												clear();
												
												connect.createStatement().executeUpdate("insert into Part values('"+owner+"','"+part3+"','"+cs+"','"+dt+"')");
												
												Socket soc = new Socket("localhost",2222);
												DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
												dos.writeUTF(owner);
												dos.writeUTF(fname);
												dos.writeUTF(sk);
												dos.writeUTF(content);
												dos.writeUTF(dt);
												
												DataInputStream di =new DataInputStream(soc.getInputStream());
												String msg=di.readUTF();
												
												DataOutputStream dout =new DataOutputStream(s.getOutputStream());
												dout.writeUTF(msg);
											}
											else if(cs.equalsIgnoreCase("CS3"))
											{
												Thread.sleep(1000);
												arrow12 = new ImageIcon(this.getClass().getResource("a33g.png"));
												arrow12l.setIcon(arrow12);

												Thread.sleep(2000);
												thirteenl.setVisible(false);
												Thread.sleep(1000);
												thirteenl.setVisible(true);
												Thread.sleep(1000);
												thirteenl.setVisible(false);
												Thread.sleep(1000);
												thirteenl.setVisible(true);

												clear();
												
												connect.createStatement().executeUpdate("insert into Part values('"+owner+"','"+part3+"','"+cs+"','"+dt+"')");
												
												Socket soc = new Socket("localhost",3333);
												DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
												dos.writeUTF(owner);
												dos.writeUTF(fname);
												dos.writeUTF(sk);
												dos.writeUTF(content);
												dos.writeUTF(dt);
												
												DataInputStream di =new DataInputStream(soc.getInputStream());
												String msg=di.readUTF();
												
												DataOutputStream dout =new DataOutputStream(s.getOutputStream());
												dout.writeUTF(msg);
												
											}
										}
										else
										{
											Thread.sleep(2000);
											lab3.setVisible(false);
											Thread.sleep(1000);
											lab3.setVisible(true);
											Thread.sleep(1000);
											lab3.setVisible(false);
											Thread.sleep(1000);
											lab3.setVisible(true);
											
											String clouds1="CS3";
											connect.createStatement().executeUpdate("update CSDetails set status='"+over+"' where csname='"+part3+"'");
											
											call(s);
										}
									}
									else
									{
										Thread.sleep(2000);
										lab3.setVisible(false);
										Thread.sleep(1000);
										lab3.setVisible(true);
										Thread.sleep(1000);
										lab3.setVisible(false);
										Thread.sleep(1000);
										lab3.setVisible(true);
										
										String clouds1="CS3";
										connect.createStatement().executeUpdate("update CSDetails set status='"+over+"' where csname='"+part3+"'");
										
										call(s);
									}
									
								}
							
							}
						}
						else
						{

							Thread.sleep(2000);
							lab1.setVisible(false);
							Thread.sleep(1000);
							lab1.setVisible(true);
							Thread.sleep(1000);
							lab1.setVisible(false);
							Thread.sleep(1000);
							lab1.setVisible(true);
							
							connect.createStatement().executeUpdate("update CSDetails set status='"+over+"' where csname='"+part1+"'");
							
							Thread.sleep(2000);
							arrow2 = new ImageIcon(this.getClass().getResource("a2g.png"));
							arrow2l.setIcon(arrow2);
							
							Thread.sleep(2000);
							threel.setVisible(false);
							Thread.sleep(1000);
							threel.setVisible(true);
							Thread.sleep(1000);
							threel.setVisible(false);
							Thread.sleep(1000);
							threel.setVisible(true);
							
							if(st2.equalsIgnoreCase("Normal"))
							{
								if(Integer.parseInt(e2)>=ct)
								{
									int ene = Integer.parseInt(e2)-ct;
									connect.createStatement().executeUpdate("update CSDetails set energy='"+ene+"' where csname='"+part2+"'");
									connect.createStatement().executeUpdate("insert into Part values('"+owner+"','"+part2+"','"+cs+"','"+dt+"')");
									
									if(cs.equalsIgnoreCase("CS1"))
									{
										Thread.sleep(1000);
										arrow7 = new ImageIcon(this.getClass().getResource("a11g.png"));
										arrow7l.setIcon(arrow7);

										Thread.sleep(2000);
										eightl.setVisible(false);
										Thread.sleep(1000);
										eightl.setVisible(true);
										Thread.sleep(1000);
										eightl.setVisible(false);
										Thread.sleep(1000);
										eightl.setVisible(true);

										clear();
										
										Socket soc = new Socket("localhost",1111);
										DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
										dos.writeUTF(owner);
										dos.writeUTF(fname);
										dos.writeUTF(sk);
										dos.writeUTF(content);
										dos.writeUTF(dt);
										
										DataInputStream di =new DataInputStream(soc.getInputStream());
										String msg=di.readUTF();
										
										DataOutputStream dout =new DataOutputStream(s.getOutputStream());
										dout.writeUTF(msg);
									}
									else if(cs.equalsIgnoreCase("CS2"))
									{
										Thread.sleep(1000);
										arrow8 = new ImageIcon(this.getClass().getResource("a2g.png"));
										arrow8l.setIcon(arrow8);

										Thread.sleep(2000);
										ninel.setVisible(false);
										Thread.sleep(1000);
										ninel.setVisible(true);
										Thread.sleep(1000);
										ninel.setVisible(false);
										Thread.sleep(1000);
										ninel.setVisible(true);

										clear();
										
										connect.createStatement().executeUpdate("insert into Part values('"+owner+"','"+part2+"','"+cs+"','"+dt+"')");
										
										Socket soc = new Socket("localhost",2222);
										DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
										dos.writeUTF(owner);
										dos.writeUTF(fname);
										dos.writeUTF(sk);
										dos.writeUTF(content);
										dos.writeUTF(dt);
										
										DataInputStream di =new DataInputStream(soc.getInputStream());
										String msg=di.readUTF();
										
										DataOutputStream dout =new DataOutputStream(s.getOutputStream());
										dout.writeUTF(msg);
									}
									else if(cs.equalsIgnoreCase("CS3"))
									{
										Thread.sleep(1000);
										arrow9 = new ImageIcon(this.getClass().getResource("a33g.png"));
										arrow9l.setIcon(arrow9);

										Thread.sleep(2000);
										tenl.setVisible(false);
										Thread.sleep(1000);
										tenl.setVisible(true);
										Thread.sleep(1000);
										tenl.setVisible(false);
										Thread.sleep(1000);
										tenl.setVisible(true);

										clear();
										
										connect.createStatement().executeUpdate("insert into Part values('"+owner+"','"+part2+"','"+cs+"','"+dt+"')");
										
										Socket soc = new Socket("localhost",3333);
										DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
										dos.writeUTF(owner);
										dos.writeUTF(fname);
										dos.writeUTF(sk);
										dos.writeUTF(content);
										dos.writeUTF(dt);
										
										DataInputStream di =new DataInputStream(soc.getInputStream());
										String msg=di.readUTF();
										
										DataOutputStream dout =new DataOutputStream(s.getOutputStream());
										dout.writeUTF(msg);
										
									}
								}
								if(Integer.parseInt(e2)<=ct)
								{
									Thread.sleep(2000);
									lab2.setVisible(false);
									Thread.sleep(1000);
									lab2.setVisible(true);
									Thread.sleep(1000);
									lab2.setVisible(false);
									Thread.sleep(1000);
									lab2.setVisible(true);
									
									Thread.sleep(2000);
									arrow3 = new ImageIcon(this.getClass().getResource("a3g.png"));
									arrow3l.setIcon(arrow3);
									
									Thread.sleep(2000);
									fourl.setVisible(false);
									Thread.sleep(1000);
									fourl.setVisible(true);
									Thread.sleep(1000);
									fourl.setVisible(false);
									Thread.sleep(1000);
									fourl.setVisible(true);
									
									connect.createStatement().executeUpdate("update CSDetails set status='"+over+"' where csname='"+part2+"'");
									
									if(st3.equalsIgnoreCase("Normal"))
									{
										if(Integer.parseInt(e3)>=ct)
										{
											int ene = Integer.parseInt(e3)-ct;
											connect.createStatement().executeUpdate("update CSDetails set energy='"+ene+"' where csname='"+part3+"'");
											
											if(cs.equalsIgnoreCase("CS1"))
											{
												Thread.sleep(1000);
												arrow10 = new ImageIcon(this.getClass().getResource("a11g.png"));
												arrow10l.setIcon(arrow10);

												Thread.sleep(2000);
												elevenl.setVisible(false);
												Thread.sleep(1000);
												elevenl.setVisible(true);
												Thread.sleep(1000);
												elevenl.setVisible(false);
												Thread.sleep(1000);
												elevenl.setVisible(true);

												clear();
												
												connect.createStatement().executeUpdate("insert into Part values('"+owner+"','"+part3+"','"+cs+"','"+dt+"')");
												
												Socket soc = new Socket("localhost",1111);
												DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
												dos.writeUTF(owner);
												dos.writeUTF(fname);
												dos.writeUTF(sk);
												dos.writeUTF(content);
												dos.writeUTF(dt);
												
												DataInputStream di =new DataInputStream(soc.getInputStream());
												String msg=di.readUTF();
												
												DataOutputStream dout =new DataOutputStream(s.getOutputStream());
												dout.writeUTF(msg);
											}
											else if(cs.equalsIgnoreCase("CS2"))
											{
												Thread.sleep(1000);
												arrow11 = new ImageIcon(this.getClass().getResource("a2g.png"));
												arrow11l.setIcon(arrow11);

												Thread.sleep(2000);
												twelvel.setVisible(false);
												Thread.sleep(1000);
												twelvel.setVisible(true);
												Thread.sleep(1000);
												twelvel.setVisible(false);
												Thread.sleep(1000);
												twelvel.setVisible(true);

												clear();
												
												connect.createStatement().executeUpdate("insert into Part values('"+owner+"','"+part3+"','"+cs+"','"+dt+"')");
												
												Socket soc = new Socket("localhost",2222);
												DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
												dos.writeUTF(owner);
												dos.writeUTF(fname);
												dos.writeUTF(sk);
												dos.writeUTF(content);
												dos.writeUTF(dt);
												
												DataInputStream di =new DataInputStream(soc.getInputStream());
												String msg=di.readUTF();
												
												DataOutputStream dout =new DataOutputStream(s.getOutputStream());
												dout.writeUTF(msg);
											}
											else if(cs.equalsIgnoreCase("CS3"))
											{
												Thread.sleep(1000);
												arrow12 = new ImageIcon(this.getClass().getResource("a33g.png"));
												arrow12l.setIcon(arrow12);

												Thread.sleep(2000);
												thirteenl.setVisible(false);
												Thread.sleep(1000);
												thirteenl.setVisible(true);
												Thread.sleep(1000);
												thirteenl.setVisible(false);
												Thread.sleep(1000);
												thirteenl.setVisible(true);

												clear();
												
												connect.createStatement().executeUpdate("insert into Part values('"+owner+"','"+part3+"','"+cs+"','"+dt+"')");
												
												Socket soc = new Socket("localhost",3333);
												DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
												dos.writeUTF(owner);
												dos.writeUTF(fname);
												dos.writeUTF(sk);
												dos.writeUTF(content);
												dos.writeUTF(dt);
												
												DataInputStream di =new DataInputStream(soc.getInputStream());
												String msg=di.readUTF();
												
												DataOutputStream dout =new DataOutputStream(s.getOutputStream());
												dout.writeUTF(msg);
												
											}
										}
										else
										{
											Thread.sleep(2000);
											lab3.setVisible(false);
											Thread.sleep(1000);
											lab3.setVisible(true);
											Thread.sleep(1000);
											lab3.setVisible(false);
											Thread.sleep(1000);
											lab3.setVisible(true);
											
											String clouds1="CS3";
											connect.createStatement().executeUpdate("update CSDetails set status='"+over+"' where csname='"+part3+"'");
											
											call(s);
										}
									}
									else
									{
										Thread.sleep(2000);
										lab3.setVisible(false);
										Thread.sleep(1000);
										lab3.setVisible(true);
										Thread.sleep(1000);
										lab3.setVisible(false);
										Thread.sleep(1000);
										lab3.setVisible(true);
										
										String clouds1="CS3";
										connect.createStatement().executeUpdate("update CSDetails set status='"+over+"' where csname='"+part3+"'");
										
										call(s);
									}
									
								}
							}
							else
							{
								Thread.sleep(2000);
								lab2.setVisible(false);
								Thread.sleep(1000);
								lab2.setVisible(true);
								Thread.sleep(1000);
								lab2.setVisible(false);
								Thread.sleep(1000);
								lab2.setVisible(true);
								
								Thread.sleep(2000);
								arrow3 = new ImageIcon(this.getClass().getResource("a3g.png"));
								arrow3l.setIcon(arrow3);
								
								Thread.sleep(2000);
								fourl.setVisible(false);
								Thread.sleep(1000);
								fourl.setVisible(true);
								Thread.sleep(1000);
								fourl.setVisible(false);
								Thread.sleep(1000);
								fourl.setVisible(true);
								
								connect.createStatement().executeUpdate("update CSDetails set status='"+over+"' where csname='"+part2+"'");
								
								if(st3.equalsIgnoreCase("Normal"))
								{
									if(Integer.parseInt(e3)>=ct)
									{
										int ene = Integer.parseInt(e3)-ct;
										connect.createStatement().executeUpdate("update CSDetails set energy='"+ene+"' where csname='"+part3+"'");
										
										if(cs.equalsIgnoreCase("CS1"))
										{
											Thread.sleep(1000);
											arrow10 = new ImageIcon(this.getClass().getResource("a11g.png"));
											arrow10l.setIcon(arrow10);

											Thread.sleep(2000);
											elevenl.setVisible(false);
											Thread.sleep(1000);
											elevenl.setVisible(true);
											Thread.sleep(1000);
											elevenl.setVisible(false);
											Thread.sleep(1000);
											elevenl.setVisible(true);

											clear();
											
											connect.createStatement().executeUpdate("insert into Part values('"+owner+"','"+part3+"','"+cs+"','"+dt+"')");
											
											Socket soc = new Socket("localhost",1111);
											DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
											dos.writeUTF(owner);
											dos.writeUTF(fname);
											dos.writeUTF(sk);
											dos.writeUTF(content);
											dos.writeUTF(dt);
											
											DataInputStream di =new DataInputStream(soc.getInputStream());
											String msg=di.readUTF();
											
											DataOutputStream dout =new DataOutputStream(s.getOutputStream());
											dout.writeUTF(msg);
										}
										else if(cs.equalsIgnoreCase("CS2"))
										{
											Thread.sleep(1000);
											arrow11 = new ImageIcon(this.getClass().getResource("a2g.png"));
											arrow11l.setIcon(arrow11);

											Thread.sleep(2000);
											twelvel.setVisible(false);
											Thread.sleep(1000);
											twelvel.setVisible(true);
											Thread.sleep(1000);
											twelvel.setVisible(false);
											Thread.sleep(1000);
											twelvel.setVisible(true);

											clear();
											
											connect.createStatement().executeUpdate("insert into Part values('"+owner+"','"+part3+"','"+cs+"','"+dt+"')");
											
											Socket soc = new Socket("localhost",2222);
											DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
											dos.writeUTF(owner);
											dos.writeUTF(fname);
											dos.writeUTF(sk);
											dos.writeUTF(content);
											dos.writeUTF(dt);
											
											DataInputStream di =new DataInputStream(soc.getInputStream());
											String msg=di.readUTF();
											
											DataOutputStream dout =new DataOutputStream(s.getOutputStream());
											dout.writeUTF(msg);
										}
										else if(cs.equalsIgnoreCase("CS3"))
										{
											Thread.sleep(1000);
											arrow12 = new ImageIcon(this.getClass().getResource("a33g.png"));
											arrow12l.setIcon(arrow12);

											Thread.sleep(2000);
											thirteenl.setVisible(false);
											Thread.sleep(1000);
											thirteenl.setVisible(true);
											Thread.sleep(1000);
											thirteenl.setVisible(false);
											Thread.sleep(1000);
											thirteenl.setVisible(true);

											clear();
											
											connect.createStatement().executeUpdate("insert into Part values('"+owner+"','"+part3+"','"+cs+"','"+dt+"')");
											
											Socket soc = new Socket("localhost",3333);
											DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
											dos.writeUTF(owner);
											dos.writeUTF(fname);
											dos.writeUTF(sk);
											dos.writeUTF(content);
											dos.writeUTF(dt);
											
											DataInputStream di =new DataInputStream(soc.getInputStream());
											String msg=di.readUTF();
											
											DataOutputStream dout =new DataOutputStream(s.getOutputStream());
											dout.writeUTF(msg);
											
										}
									}
									if(Integer.parseInt(e3)<=ct)
									{
										Thread.sleep(2000);
										lab3.setVisible(false);
										Thread.sleep(1000);
										lab3.setVisible(true);
										Thread.sleep(1000);
										lab3.setVisible(false);
										Thread.sleep(1000);
										lab3.setVisible(true);
										
										String clouds1="CS3";
										connect.createStatement().executeUpdate("update CSDetails set status='"+over+"' where csname='"+part3+"'");
										
										call(s);
									}
								}
								else
								{
									Thread.sleep(2000);
									lab3.setVisible(false);
									Thread.sleep(1000);
									lab3.setVisible(true);
									Thread.sleep(1000);
									lab3.setVisible(false);
									Thread.sleep(1000);
									lab3.setVisible(true);
									
									String clouds1="CS3";
									connect.createStatement().executeUpdate("update CSDetails set status='"+over+"' where csname='"+part3+"'");
									
									call(s);
								}
								
							}
						
						}
						}
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				
			}*/
			
			if(this.port==4747)
			{
				try {
						ServerSocket sc =new ServerSocket(4747);
						
						while(true)
						{
						
						s = sc.accept();
						
						DataInputStream din = new DataInputStream(s.getInputStream());
						String file = din.readUTF();
						String cs = din.readUTF();
						
						if(cs.equalsIgnoreCase("CS1"))
						{
							Socket soc = new Socket("localhost",4646);
							DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
							dos.writeUTF(file);
							
							DataInputStream di =new DataInputStream(soc.getInputStream());
							String msg = di.readUTF();
							String sk = di.readUTF();
							
							DataOutputStream dout =new DataOutputStream(s.getOutputStream());
							dout.writeUTF(msg);
							dout.writeUTF(sk);
						}
						if(cs.equalsIgnoreCase("CS2"))
						{
							Socket soc = new Socket("localhost",8484);
							DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
							dos.writeUTF(file);
							
							DataInputStream di =new DataInputStream(soc.getInputStream());
							String msg = di.readUTF();
							String sk = di.readUTF();
							
							DataOutputStream dout =new DataOutputStream(s.getOutputStream());
							dout.writeUTF(msg);
							dout.writeUTF(sk);
						}
						if(cs.equalsIgnoreCase("CS3"))
						{
							Socket soc = new Socket("localhost",7474);
							DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
							dos.writeUTF(file);
							
							DataInputStream di =new DataInputStream(soc.getInputStream());
							String msg = di.readUTF();
							String sk = di.readUTF();
							
							DataOutputStream dout =new DataOutputStream(s.getOutputStream());
							dout.writeUTF(msg);
							dout.writeUTF(sk);
						}
						
						
					}
				}	
						catch (Exception e) {
						e.printStackTrace();
					}
						
			}
			
			if(this.port==9999)
			{
				try {
						ServerSocket sc =new ServerSocket(9999);
						
						while(true)
						{
						
						s = sc.accept();
						
						DataInputStream din = new DataInputStream(s.getInputStream());
						String user = din.readUTF();
						String file= din.readUTF();
						String sk = din.readUTF();
						String cs = din.readUTF();
						
						
						if(cs.equalsIgnoreCase("CS1"))
						{
							Socket soc = new Socket("localhost",9988);
							DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
							dos.writeUTF(user);
							dos.writeUTF(file);
							dos.writeUTF(sk);
							
							DataInputStream dinn =new DataInputStream(soc.getInputStream());
							String msg = dinn.readUTF();
							String content = dinn.readUTF();
							
							DataOutputStream dout =new DataOutputStream(s.getOutputStream());
							dout.writeUTF(msg);
							dout.writeUTF(content);
							
						}
						if(cs.equalsIgnoreCase("CS2"))
						{
							Socket soc = new Socket("localhost",9989);
							DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
							dos.writeUTF(user);
							dos.writeUTF(file);
							dos.writeUTF(sk);
							
							DataInputStream di =new DataInputStream(soc.getInputStream());
							String msg = di.readUTF();
							String content = di.readUTF();
							
							DataOutputStream dout =new DataOutputStream(s.getOutputStream());
							dout.writeUTF(msg);
							dout.writeUTF(content);
						}
						if(cs.equalsIgnoreCase("CS3"))
						{
							Socket soc = new Socket("localhost",9990);
							DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
							dos.writeUTF(user);
							dos.writeUTF(file);
							dos.writeUTF(sk);
							
							DataInputStream di =new DataInputStream(soc.getInputStream());
							String msg = di.readUTF();
							String content = di.readUTF();
							
							DataOutputStream dout =new DataOutputStream(s.getOutputStream());
							dout.writeUTF(msg);
							dout.writeUTF(content);
						}
						
						
					}
				}	
						catch (Exception e) {
						e.printStackTrace();
					}
						
			}
			
			if (this.port == 2555)
			{
				try
				{
					ServerSocket server909 = new ServerSocket(2555);
					Socket con777;

					while (true) 
					{
							
						con777 = server909.accept();
						
						ObjectInputStream in3=new ObjectInputStream(con777.getInputStream());
						
						String cs=in3.readObject().toString();
						
						Vector data = new Vector();
						
						
						ResultSet r1=connect.createStatement().executeQuery("select * from csdetails");

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
			if (this.port == 3555)
			{
				try
				{
					ServerSocket server909 = new ServerSocket(3555);
					Socket con777;

					while (true) 
					{
							
						con777 = server909.accept();
						
						ObjectInputStream in3=new ObjectInputStream(con777.getInputStream());
						
						String cs=in3.readObject().toString();
						
						Vector data = new Vector();
						
						
						ResultSet r1=connect.createStatement().executeQuery("select * from csdetails");

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
			if (this.port == 4455)
			{
				try
				{
					ServerSocket server909 = new ServerSocket(4455);
					Socket con777;

					while (true) 
					{
							
						con777 = server909.accept();
						
						ObjectInputStream in3=new ObjectInputStream(con777.getInputStream());
						
						String cs=in3.readObject().toString();
						
						Vector data = new Vector();
						
						
						ResultSet r1=connect.createStatement().executeQuery("select owner,pname,cs,dt from part where cs='"+cs+"'");

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
		
			if (this.port == 4466)
			{
				try
				{
					ServerSocket server909 = new ServerSocket(4466);
					Socket con777;

					while (true) 
					{
							
						con777 = server909.accept();
						
						ObjectInputStream in3=new ObjectInputStream(con777.getInputStream());
						
						String cs=in3.readObject().toString();
						
						Vector data = new Vector();
						
						
						ResultSet r1=connect.createStatement().executeQuery("select owner,pname,cs,dt from part where cs='"+cs+"'");

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
			if (this.port == 4477)
			{
				try
				{
					ServerSocket server909 = new ServerSocket(4477);
					Socket con777;

					while (true) 
					{
							
						con777 = server909.accept();
						
						ObjectInputStream in3=new ObjectInputStream(con777.getInputStream());
						
						String cs=in3.readObject().toString();
						
						Vector data = new Vector();
						
						
						ResultSet r1=connect.createStatement().executeQuery("select owner,pname,cs,dt from part where cs='"+cs+"'");

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
			if (this.port == 4555)
			{
				try
				{
					ServerSocket server909 = new ServerSocket(4555);
					Socket con777;

					while (true) 
					{
							
						con777 = server909.accept();
						
						ObjectInputStream in3=new ObjectInputStream(con777.getInputStream());
						
						String cs=in3.readObject().toString();
						
						Vector data = new Vector();
						
						
						ResultSet r1=connect.createStatement().executeQuery("select * from csdetails");

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
			
			}catch (Exception e) {
			// TODO: handle exception
		}
		}


		 void call(Socket s) throws SQLException, IOException, InterruptedException {

			 	Dbcon done=new Dbcon();
				Connection connect = done.getConnection();
			//	JOptionPane.showMessageDialog(null,"All The Cloud Servers Are In IDLE State \n Please Resend The Data");
			 
				String st="Normal";
				String cs="Partition1";
				String cs1="Partition2";
				String cs2="Partition3";
				
				Random r = new Random();
				
				String a = String.valueOf(r.nextInt(100000));
				String b = String.valueOf(r.nextInt(100000));
				String c = String.valueOf(r.nextInt(100000));
				
				connect.createStatement().executeUpdate("update CSDetails set energy='"+a+"',status='"+st+"' where csname='"+cs+"'");
				connect.createStatement().executeUpdate("update CSDetails set energy='"+b+"',status='"+st+"' where csname='"+cs1+"'");
				connect.createStatement().executeUpdate("update CSDetails set energy='"+c+"',status='"+st+"' where csname='"+cs2+"'");
		
				clear();
				
				Thread.sleep(2000);
				lab7.setVisible(true);
				Thread.sleep(1000);
				lab7.setVisible(false);
				Thread.sleep(1000);
				lab7.setVisible(true);
				Thread.sleep(1000);
				lab7.setVisible(false);
				Thread.sleep(1000);
				lab7.setVisible(true);
				
				Thread.sleep(1500);
				lab4.setVisible(true);
				lab4.setText(a);
				lab5.setVisible(true);
				lab5.setText(b);
				lab6.setVisible(true);
				lab6.setText(c);
				
				Thread.sleep(2000);
				lab4.setVisible(false);
				lab5.setVisible(false);
				lab6.setVisible(false);
				
				
				Thread.sleep(500);
				JOptionPane.showMessageDialog(null, "Energy Reassigned \n Sending the Data Again");
				
				/*if(cs.equalsIgnoreCase("CS1"))
				{
					int ene = Integer.parseInt(e1)-ct;
					connect.createStatement().executeUpdate("update CSDetails set energy='"+ene+"' where csname='"+part1+"'");
					
					
					Thread.sleep(1000);
					arrow4 = new ImageIcon(this.getClass().getResource("a11g.png"));
					arrow4l.setIcon(arrow4);
					
					Thread.sleep(2000);
					fivel.setVisible(false);
					Thread.sleep(1000);
					fivel.setVisible(true);
					Thread.sleep(1000);
					fivel.setVisible(false);
					Thread.sleep(1000);
					fivel.setVisible(true);
					
					clear();
					
					connect.createStatement().executeUpdate("insert into Part values('"+owner+"','"+part1+"','"+cs+"','"+dt+"')");
					
					Socket soc = new Socket("localhost",1111);
					DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
					dos.writeUTF(owner);
					dos.writeUTF(fname);
					dos.writeUTF(sk);
					dos.writeUTF(content);
					dos.writeUTF(dt);
					
					DataInputStream di =new DataInputStream(soc.getInputStream());
					String msg=di.readUTF();
					
					DataOutputStream dout =new DataOutputStream(s.getOutputStream());
					dout.writeUTF(msg);
				}
				else if(cs.equalsIgnoreCase("CS2"))
				{
					Thread.sleep(1000);
					arrow5 = new ImageIcon(this.getClass().getResource("a2g.png"));
					arrow5l.setIcon(arrow5);
					
					Thread.sleep(2000);
					sixl.setVisible(false);
					Thread.sleep(1000);
					sixl.setVisible(true);
					Thread.sleep(1000);
					sixl.setVisible(false);
					Thread.sleep(1000);
					sixl.setVisible(true);
					
					clear();
					
					connect.createStatement().executeUpdate("insert into Part values('"+owner+"','"+part1+"','"+cs+"','"+dt+"')");
					
					Socket soc = new Socket("localhost",2222);
					DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
					dos.writeUTF(owner);
					dos.writeUTF(fname);
					dos.writeUTF(sk);
					dos.writeUTF(content);
					dos.writeUTF(dt);
					
					DataInputStream di =new DataInputStream(soc.getInputStream());
					String msg=di.readUTF();
					
					DataOutputStream dout =new DataOutputStream(s.getOutputStream());
					dout.writeUTF(msg);
				}
				else if(cs.equalsIgnoreCase("CS3"))
				{
					Thread.sleep(1000);
					arrow6 = new ImageIcon(this.getClass().getResource("a33g.png"));
					arrow6l.setIcon(arrow6);
					
					Thread.sleep(2000);
					sevenl.setVisible(false);
					Thread.sleep(1000);
					sevenl.setVisible(true);
					Thread.sleep(1000);
					sevenl.setVisible(false);
					Thread.sleep(1000);
					sevenl.setVisible(true);
					
					clear();
					
					connect.createStatement().executeUpdate("insert into Part values('"+owner+"','"+part1+"','"+cs+"','"+dt+"')");
					
					Socket soc = new Socket("localhost",3333);
					DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
					dos.writeUTF(owner);
					dos.writeUTF(fname);
					dos.writeUTF(sk);
					dos.writeUTF(content);
					dos.writeUTF(dt);
					
					DataInputStream di =new DataInputStream(soc.getInputStream());
					String msg=di.readUTF();
					
					DataOutputStream dout =new DataOutputStream(s.getOutputStream());
					dout.writeUTF(msg);
					
				}*/
			
				DataOutputStream dout =new DataOutputStream(s.getOutputStream());
				dout.writeUTF("reset");
				
				
		 }

		void clear() throws InterruptedException {

				Thread.sleep(2000);
			 	
				arrow1 = new ImageIcon(this.getClass().getResource("a1.png"));
				arrow1l.setIcon(arrow1);
				
				arrow2 = new ImageIcon(this.getClass().getResource("a2.png"));
				arrow2l.setIcon(arrow2);
				
				arrow3 = new ImageIcon(this.getClass().getResource("a3.png"));
				arrow3l.setIcon(arrow3);
				
				arrow4 = new ImageIcon(this.getClass().getResource("a11.png"));
				arrow4l.setIcon(arrow4);
				
				arrow5 = new ImageIcon(this.getClass().getResource("a2.png"));
				arrow5l.setIcon(arrow5);
				
				arrow6 = new ImageIcon(this.getClass().getResource("a33.png"));
				arrow6l.setIcon(arrow6);
				
				arrow7 = new ImageIcon(this.getClass().getResource("a11.png"));
				arrow7l.setIcon(arrow7);
				
				arrow8 = new ImageIcon(this.getClass().getResource("a2.png"));
				arrow8l.setIcon(arrow8);
				
				arrow9 = new ImageIcon(this.getClass().getResource("a33.png"));
				arrow9l.setIcon(arrow9);
				
				arrow10 = new ImageIcon(this.getClass().getResource("a11.png"));
				arrow10l.setIcon(arrow10);
				
				arrow11 = new ImageIcon(this.getClass().getResource("a2.png"));
				arrow11l.setIcon(arrow11);
				
				arrow12 = new ImageIcon(this.getClass().getResource("a33.png"));
				arrow12l.setIcon(arrow12);
				
				lab1.setVisible(false);
				lab2.setVisible(false);
				lab3.setVisible(false);	
				lab4.setVisible(false);	
				lab5.setVisible(false);	
				lab6.setVisible(false);	
				lab7.setVisible(false);	
		 
		 }
}
}