package logic;

import java.util.ArrayList;

public class Student {
	//To DO: Q3
	//HINT:
	protected ArrayList<Course> coursesEnrolled;
	protected ArrayList<Boolean> isPassedList;
	private String name;
	
	
	public Student(String name) {
		super();
		//To DO: Q3
		//HINT:
		this.coursesEnrolled = new ArrayList<Course>();
		this.name = name;
		//To DO: Q3
		//HINT:
		this.isPassedList = new ArrayList<Boolean>();
	}
	
	public void enrollCourse(Course c) {
		this.coursesEnrolled.add(c);
	}
	
	public void computeIsPassed() {
		//TO DO: Q3
		this.isPassedList.clear();
		for(Course d:this.coursesEnrolled) {
			this.isPassedList.add(d.isPassed());
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

// TO DO: Q3	
//	@Override
//	public String toString() 
	
	
	
	
	
	
	
}
