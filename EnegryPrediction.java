
import java.awt.Color;
import java.awt.Container;

/*
 * To change this template, choose Tools | Templates
 * and open the template
 * in the editor.
 */

/**
 *
 * @author HOME
 */
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

public class EnegryPrediction extends JFrame{
    Container c;
    JLabel heading, fils, cons,fp, cp, fsph,fspd, csph, cspd, effeicency, effeicency2, effeicency3;
    JTextField fils1, cons1, fsph1, fspd1, csph1, cspd1, effi1;
    Font f  = new Font("Monaco",Font.BOLD,12);
    Font f1  = new Font("Monaco",Font.BOLD,18);
    int[] partVal = new int[3];
    EnegryPrediction() {
        setTitle("Energy details :: GREEN SLEEP SCHEDULING OF SERVERS FOR CLOUD DATA CENTRE");
        c= getContentPane();
        c.setLayout (null);
        c.setBackground(new Color(240, 202, 202));
        
        heading = new JLabel("Energy consumption details of file");
        heading.setFont(f1);
        heading.setBounds(40, 20, 300, 50);
        c.add(heading);
        doIt();
    }
        public void doIt() {
        GetFileSize gf = new GetFileSize();
        int contentLength = gf.getContent();
        double fileSize = gf.getSize();
        String server = gf.getServer();
        
        double fileConsumesPower_size = fileSize * 0.56;
        CalculateEnergy ce = new CalculateEnergy();
        double costPerHour = ce.costIncured((int)fileConsumesPower_size);
        double costPerday = costPerHour * 24;
        
        int fileContentConsume_size = contentLength * 1;
        double costPerHour2 = ce.costIncured(fileContentConsume_size);
        double costPerday2 = costPerHour2 * 24;
        int k = 0;

        try {
            Dbcon db = new Dbcon();
            Connection con = db.getConnection();
            Statement stmt = con.createStatement();
            String query = "SELECT * From CSDetails";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next() && k < 3) {
                        partVal[k] = Integer.parseInt(rs.getString(2));
                        System.out.println("partition extracted value in energy prediction " + partVal[k]);
                        k++;
	    }
            k = 0;
        } catch(Exception e) {
            System.out.println("Exception occured at energy prediction : " +  e);
        }
        ce.setPart1(partVal[0]);
        ce.setPart2(partVal[1]);
        ce.setPart3(partVal[2]);
        int part1 = ce.getPart1();
        int part2 = ce.getPart2();
        int part3 = ce.getPart3();
        System.out.println("part 1  = " + part1 + " part2 = " + part2 + " part3 = " + part3);
        double ef1 = ce.getEfficiency(fileContentConsume_size,part1);
        double ef2 = ce.getEfficiency(fileContentConsume_size,part2);
        double ef3 = ce.getEfficiency(fileContentConsume_size,part3);
        /*double ef1 = ce.getEfficiency(29,part1);
        double ef2 = ce.getEfficiency(29,part2);
        double ef3 = ce.getEfficiency(29,part3);*/
        
        fils = new JLabel("Uploaded file size in Bytes " + fileSize + " Bytes");
        fils.setFont(f);
        fils.setBounds(20, 80, 300, 50);
        c.add(fils);
        
        cp= new JLabel("Power used while uploading the file " + fileContentConsume_size + " watts");
        cp.setFont(f);
        cp.setBounds(20, 120, 300, 50);
        c.add(cp);
        
        fsph = new JLabel("Cost for uploading file " + costPerHour + " Rs");
        fsph.setFont(f);
        fsph.setBounds(20, 160, 300, 50);
        c.add(fsph);
        
        effeicency = new JLabel("Efficency at Partition 1  = " +  ef1 + " %");
        effeicency.setFont(f);
        effeicency.setBounds(20, 200, 300, 50);
        c.add(effeicency);
        
        effeicency2 = new JLabel("Efficency at Partition 2  = " + ef2 + " %");
        effeicency2.setFont(f);
        effeicency2.setBounds(20, 240, 300, 50);
        c.add(effeicency2);
        
        effeicency3 = new JLabel("Efficency at Partition 3 = " + ef3 + " %");
        effeicency3.setFont(f);
        effeicency3.setBounds(20, 280, 300, 50);
        c.add(effeicency3);
    }
}
