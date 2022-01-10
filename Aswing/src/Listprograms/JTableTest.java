package Listprograms;


import javax.swing.JFrame;
import javax.swing.JTable;

public class JTableTest extends JFrame
{
	public JTableTest()
	{
		
		String[] col=new String[]
				{
						"id","Name","Address"
				};
		
		Object[][] data=new Object[][]
				{
			       {1,"shubhangi","Pune"   },
			       {2, "pooja","Mumbai"    },
			       {3,"Bhagyashri","Nashik"},
			
				};
		
		
		
		JTable table=new JTable(data,col);
		this.add(table);
		this.setSize(200,200);
		this.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new JTableTest();
	}

}
