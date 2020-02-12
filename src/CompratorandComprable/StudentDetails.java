package CompratorandComprable;

import java.util.Comparator;

public class StudentDetails {
	private int id;
	private String name;
	

	private float percentage;
	
	public StudentDetails(int id,String name,int percentage) {
		this.id=id;
		this.name=name;
		this.percentage=percentage;
	    }
	public int getid() {
		return id;
	}
	public String getname() {
		return name;
	}
	public float getpercentage() {
		return percentage;
	}
	
	@Override
	public String toString() {
		return "StudentDetails [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
	}
	
	public static Comparator SortByName=new Comparator<StudentDetails>() {

		@Override
		public int compare(StudentDetails o1, StudentDetails o2) {
			
			//return o1.getname().compareTo(o2.getname());
			return o2.getname().compareTo(o1.getname());
		}
	};
	

}
