package logic;

public class BooleanCourse extends Course{

	private boolean grade;

	public BooleanCourse(String name, boolean grade) {
		super(name);
		this.grade = grade;
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isPassed() {
		return this.grade;
	}
	@Override
	public String toString() {
		return "(BooleanCourse): "+this.getName()+", grade: "+this.grade;
	}
	

	
	
}
