package Listprograms;
import javax.swing.JTree;
import javax.swing.JFrame;
import javax.swing.tree.DefaultMutableTreeNode;


public class JTreefetch  extends JFrame
{
	JTree tree;
	public JTreefetch()
	{
	
   DefaultMutableTreeNode node=new DefaultMutableTreeNode("Node");
   DefaultMutableTreeNode l1=new DefaultMutableTreeNode("Sadashiv");
   DefaultMutableTreeNode l2=new DefaultMutableTreeNode("Gambhir");
   DefaultMutableTreeNode l3=new DefaultMutableTreeNode("Kiran");
   DefaultMutableTreeNode l4=new DefaultMutableTreeNode("Madhukar");
   DefaultMutableTreeNode l5=new DefaultMutableTreeNode("Shubhangi");
   DefaultMutableTreeNode l6=new DefaultMutableTreeNode("Atul");

   node.add(l1);
   l1.add(l3);
   node.add(l2);
   l2.add(l4);
   l3.add(l5);
   l4.add(l6);
   
   tree =new JTree(node);
   add(tree);
   
   this.pack();
   this.setSize(200,300);
   this.setVisible(true);
   
	}
	public static void main(String[] args)
	{
		new JTreefetch();
		
	}
   
   
   
   
  
   
   
 
   
}
