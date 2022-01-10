package Listprograms;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.text.JTextComponent;

import com.mysql.cj.result.Field;

public class SwingDB extends JFrame
{
	
	JTextField t1,t2;
	JButton jb;
	JLabel l1,l2;
	public SwingDB()
	{
		JLabel l1=new JLabel("name");
		t1=new JTextField(20);
		JLabel l2=new JLabel("password");
		t2=new JTextField(30);
		
		
		
		jb=new JButton("submit");
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(jb);
		GridLayout layout=new GridLayout(3,2);
		
		jb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String name=t1.getText();
				String password=t2.getText();
			try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/portal","root","root");
					Statement statement=con.createStatement();
					String sql="INSERT INTO user (`name`,`password`)VALUES('"+name+"','"+password+"')";
					
					int i=0;
					i=statement.executeUpdate(sql);
					if(i==0)
					{
						System.out.println("db not inserted");
					}
					else
					{
						System.out.println("db inserted");
					}
					
					
				}
				catch(Exception ee)
				{
					System.out.println(ee);
				}
				
			}
						
		});
		
        this.setLayout(layout);		
		this.setVisible(true);
		this.pack();
		this.setVisible(true);
	}	
		
       public static void main(String []args)
       {
    	   new SwingDB();
       }
}
