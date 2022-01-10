package SwingMVC;

public class Student {
	
	int id;
	String Name;
	String standard;
	String Add;
	
	public Student(int id, String name, String standard, String add) {
		super();
		this.id = id;
		Name = name;
		this.standard = standard;
		Add = add;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public String getAdd() {
		return Add;
	}
	public void setAdd(String add) {
		Add = add;
	}
}