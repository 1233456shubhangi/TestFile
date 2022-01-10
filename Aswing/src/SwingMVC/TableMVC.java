package SwingMVC;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JTable;

public class TableMVC  extends JFrame
{
	public TableMVC()
	{
	 Student s1=new Student(1,"shubhangi","1st","Nashik");
	 Student s2=new Student(1,"manasi","2nd","Mumbai");
	 Student s3=new Student(1,"Monika","3rd","Pune");
   
      List<Student> list= new ArrayList<Student>();
      list.add(s1);
      list.add(s2);
      list.add(s3);
       
      StudentTable studentTable =new StudentTable(list);
      JTable table=new JTable(studentTable);
      this.add(table);
      this.pack();
      this.setVisible(true);
	}

    public static void main(String[] args)
    {
    	new TableMVC();
    }
}      