


import javax.swing.*;

import java.awt.event.*;
import java.sql.*;
import java.awt.*;
import java.io.*;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

import java.awt.*;
import java.net.*;

public class ViewPartitionDetails extends JFrame implements ActionListener
{
 JButton property,Reset;
 JPanel panel;
 JLabel p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;
 JTextField p1cpd, p2cpd, p3cpd, p1cph, p2cph, p3cph, ps1, ps2, ps3, s1, s2, s3, s4;
 Vector data;
Vector heading;

JButton view;
JScrollPane pane;
JTable table;
int v,h;
String s,d,call,dt;
Container c;
Font f  = new Font("Monaco",Font.BOLD,10);
int partVal[] = new int[3];
JLabel imglabel;
ViewPartitionDetails() 
 {

setTitle("Partition Details :: GREEN SLEEP SCHEDULING OF SERVERS FOR CLOUD DATA CENTER");
c= getContentPane();
c.setLayout (null);
c.setBackground(new Color(179, 179, 255));

 
    


int k = 0;
try {
	 Vector heading = new Vector();
	 
	 
	 
//	 heading.addElement("SL NO");
		heading.addElement("Partition");
		heading.addElement("Power");
		heading.addElement("Status");
	
	 
	 
			  Vector data=new Vector();
			  Dbcon db = new Dbcon();
				 Connection con = db.getConnection();
	             Statement stmt = con.createStatement();
	             
	             
	             String query = "SELECT * From CSDetails";
	             ResultSet rs = stmt.executeQuery(query);
                     


	    


	ResultSetMetaData rsm=rs.getMetaData();
	int col=rsm.getColumnCount();



	            while(rs.next())
	             {
                        partVal[k] = Integer.parseInt(rs.getString(2));
                        System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
                        System.out.println("partition extracted value " + partVal[k]);
                        k++;
                        Vector row = new Vector();
                        for(int i = 1; i <=col; i++){
	                row.addElement(rs.getObject(i));

	             }
                     
                        CalculateEnergy ce = new CalculateEnergy();
                        ce.setPart1(partVal[0]);
                        ce.setPart2(partVal[1]);
                        ce.setPart3(partVal[2]);

	data.addElement(row);
	             }
			  
			JTable table = new JTable(data,heading);
			  
			  pane = new JScrollPane(table);
			  pane.setBounds(20,30,450,80);
			  c.add(pane);
                          partitionDetails(partVal);
			 // c.add(image);
	 } 
	 catch(Exception ex) {
		 ex.printStackTrace();
		 } 

  }


public void partitionDetails(int ar[])
{
    p1 = new JLabel("Cost per hour(Active)");
    p1.setFont(f);
    p1.setBounds(80, 110, 150, 20);
    c.add(p1);
    
    p2 = new JLabel("Cost per day(Active)");
    p2.setFont(f);
    p2.setBounds(190, 110, 150, 20);
    c.add(p2);
    
    p3 = new JLabel("Cost per hour(Sleep)");
    p3.setFont(f);
    p3.setBounds(310, 110, 150, 20);
    c.add(p3);
   
    p4 = new JLabel("Partition 1");
    p4.setFont(f);
    p4.setBounds(20, 140, 80, 30);
    c.add(p4);
    
    p5 = new JLabel("Partition 2");
    p5.setFont(f);
    p5.setBounds(20, 200, 80, 30);
    c.add(p5);
    
    p6 = new JLabel("Partition 3");
    p6.setFont(f);
    p6.setBounds(20, 260, 80, 30);
    c.add(p6);
 
    p7 = new JLabel("Total cost incurred when all servers are active");
    p7.setFont(f);
    p7.setBounds(20, 320, 300, 30);
    c.add(p7);
    
    p8 = new JLabel("Cost incured when partition 1 is used");
    p8.setFont(f);
    p8.setBounds(20, 360, 300, 30);
    c.add(p8);
    
    p9 = new JLabel("Cost incured when partition 2 is used");
    p9.setFont(f);
    p9.setBounds(20, 400, 300, 30);
    c.add(p9);
    
    p10 = new JLabel("Cost incured when partition 3 is used");
    p10.setFont(f);
    p10.setBounds(20, 440, 300, 30);
    c.add(p10);

    //Bringing partition values
    CalculateEnergy calEn = new CalculateEnergy();
    //cost per hour 
    p1cpd = new JTextField();
    p1cpd.setBounds(90, 140, 100, 30);
    p1cpd.setFont(f);
    double resph1 = calEn.costIncured(ar[0]);
    p1cpd.setText(Double. toString(resph1) + " Rs");
    p1cpd.setEditable(false);
    
    // cost per day
    p2cpd = new JTextField();
    p2cpd.setBounds(200, 140, 100, 30);
    p2cpd.setFont(f);
    double respd1 = calEn.costIncured(ar[0]) * 24;
    p2cpd.setText(Integer.toString((int)respd1) + " Rs");
    p2cpd.setEditable(false);
    
    //cost while sleeping 
    p3cpd = new JTextField();
    p3cpd.setBounds(310, 140, 100, 30);
    p3cpd.setFont(f);
    double resps1 = calEn.calculateSleepingPower(ar[0]);
    p3cpd.setText(Double. toString(resps1) + " Rs");
    p3cpd.setEditable(false);

    p1cph = new JTextField();
    p1cph.setBounds(90, 200, 100, 30);
    p1cph.setFont(f);
    double resph2 = calEn.costIncured(ar[1]);
    p1cph.setText(Double. toString(resph2) + " Rs");
    p1cph.setEditable(false);
    
    p2cph = new JTextField();
    p2cph.setBounds(200, 200, 100, 30);
    p2cph.setFont(f);
    int respd2 = (int)calEn.costIncured(ar[1]) * 24;
    p2cph.setText(Double. toString(respd2) + " Rs");
    p2cph.setEditable(false);
    
    p3cph = new JTextField();
    p3cph.setBounds(310, 200, 100, 30);
    p3cph.setFont(f);
    double resps2 = calEn.calculateSleepingPower(ar[1]);
    p3cph.setText(Double. toString(resps2) + " Rs");
    p3cph.setEditable(false);

    ps1 = new JTextField();
    ps1.setBounds(90, 260, 100, 30);
    ps1.setFont(f);
    double resph3 = calEn.costIncured(ar[2]);
    ps1.setText(Double. toString(resph3) + " Rs");
    ps1.setEditable(false);
    
    ps2 = new JTextField();
    ps2.setBounds(200, 260, 100, 30);
    ps2.setFont(f);
    int respd3 = (int)calEn.costIncured(ar[2]) * 24;
    ps2.setText(Double. toString(respd3) + " Rs");
    ps2.setEditable(false);
    
    ps3 = new JTextField();
    ps3.setBounds(310, 260, 100, 30);
    ps3.setFont(f);
    double resps3 = calEn.calculateSleepingPower(ar[2]);
    ps3.setText(Double. toString(resps3) + " Rs");
    ps3.setEditable(false);
    
    s1 = new JTextField();
    s1.setBounds(310, 320, 130, 30);
    s1.setFont(f);
    s1.setText(Double.toString(resph1 + resph2 + resph3) + " Rs");
    s1.setEditable(false);
    
    s2 = new JTextField();
    s2.setBounds(310, 360, 130, 30);
    s2.setFont(f);
    s2.setText(Double.toString(resph1 + resps2 + resps3) + " Rs");
    s2.setEditable(false);
    
    s3 = new JTextField();
    s3.setBounds(310, 400, 130, 30);
    s3.setFont(f);
    s3.setText(Double.toString(resps1 + resph2 + resps3) + " Rs");
    s3.setEditable(false);
    
    s4 = new JTextField();
    s4.setBounds(310, 440, 130, 30);
    s4.setFont(f);
    s4.setText(Double.toString(resps1 + resps2 + resph3) + " Rs");
    s4.setEditable(false);
   
    c.add(p1);
    c.add(p2);
    c.add(p3);
    c.add(p4);
    c.add(p5);
    c.add(p6);
    c.add(p7);
    c.add(p8);c.add(p9);c.add(p10);c.add(ps1);c.add(ps2);c.add(ps3);c.add(s4);c.add(s3);c.add(s2);c.add(s1);
    c.add(p1cpd);
    c.add(p2cpd);
    c.add(p3cpd);
    c.add(p1cph);
    c.add(p2cph);
    c.add(p3cph);
    
    /*EnegryPrediction ep = new EnegryPrediction();
    ep.setSize(580,400);
    ep.setVisible(true);*/

}

public void actionPerformed(ActionEvent ae)
{

Object o=ae.getSource();
}

}