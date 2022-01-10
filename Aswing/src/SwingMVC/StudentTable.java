package SwingMVC;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class StudentTable extends AbstractTableModel
{

	List<Student> students;
	
	String[] col=new String[]
			{
				"Id", "Name","Standard" ,"Add"
					
			};
	
	Class[] columnNam=new Class[]
			{
				Integer.class,String.class,String.class,String.class	
			};
	
	 public String getColumnName(int column) {
	 return col[column];
	 
	 }
	 
	 
	 
	 public Class<?> getColumnClass(int columnIndex) {
	        return columnNam[columnIndex];
	    }
	 
     public StudentTable(List<Student> students) {
     this.students=students;
	}
	
	@Override
	public int getRowCount() {
	
	return students.size();
	}

	@Override
	public int getColumnCount() {
		
		return col.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
	
		Student student=students.get(rowIndex);
		if(0==columnIndex)
		{
			return student.getId();
		}
		
		else if(1==columnIndex)
		{
			return student.getName();
		}
		else if(2==columnIndex)
		{
			return student.getStandard();
		}
		else if(3==columnIndex)
		{
			return student.getAdd();
		}
	return null;
	}
}