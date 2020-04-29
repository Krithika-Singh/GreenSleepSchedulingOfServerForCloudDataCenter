
 
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import java.sql.*;
 
public class Results {
    public static void main(String[] args) {
        
    

  int count=0;
  
  double c1=0.0;
  double c2=0.0;
  double c3=0.0;
  
  
  String cname=null;
  String cname1=null;
  String cname2=null;
  
  String status1=null;
  String status2=null;
  String status3=null;
  
  
  
  
    	try
    	{
    		Class.forName("com.mysql.jdbc.Driver");
    		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/proj16","root","root");	
    		Statement st=con.createStatement();
    		ResultSet rs=st.executeQuery("select * from csdetails");
    		
    		while(rs.next()==true)
    		{
    			count++;
    			if(count==1)
    			{
    				cname=rs.getString("csname");
    				c1=Double.valueOf(rs.getString("energy"));
    				status1=rs.getString("status");
    			}
    			if(count==2)
    			{
    			cname1=rs.getString("csname");
    			c2=Double.valueOf(rs.getString("energy"));
    			status2=rs.getString("status");
    			}
    			if(count==3)
    			{
    				cname2=rs.getString("csname");
    				c3=Double.valueOf(rs.getString("energy"));
    				status3=rs.getString("status");
    			}
    			
    		}
    		    DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
    	        dataSet.setValue(c1, "Partition1", c1+"::"+status1);
    	        dataSet.setValue(c2, "Partition2", c2+"::"+status3);
    	        dataSet.setValue(c3, "Partition3", c3+"::"+status2);
    	        
    	 
    	        JFreeChart chart = ChartFactory.createBarChart3D("Energy Efficient Scheduling of Servers with Multi-Sleep Modes for Cloud Data Center", "Energy in joules ", "Total Energy (Joules)",
    	                dataSet, PlotOrientation.VERTICAL, true, true, true);
    	        ChartFrame chartFrame=new ChartFrame("Different Partition's Energy Details",chart);
    	        chartFrame.setVisible(true);
    	     
    	        chartFrame.setSize(800,500);
    	        
        
    	}
    	catch(Exception ex)
    	{
    	System.out.println(ex);	
    		
    	}
    
}
}