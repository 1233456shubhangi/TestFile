package Listprograms;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
public class Listtest extends JFrame
{

	JList<String> jList;
	
	public Listtest()
	{
		try
		{
		DefaultListModel<String> listmodel=new DefaultListModel<String>();
		
		listmodel.addElement("java");
		listmodel.addElement("jsp");
		listmodel.addElement("Core java");
		listmodel.addElement("java");
		listmodel.addElement("jsp");
		listmodel.addElement("java");
		listmodel.addElement("Core java");
		listmodel.addElement("jsp");
		
		jList=new JList<String>(listmodel);
		add(jList);
		add(new JScrollPane(jList));
		
		this.setSize(200,150);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
       public static void main(String[] args)
       {
    	   SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new Listtest();
				
			}
		});
    	   
       }
}
