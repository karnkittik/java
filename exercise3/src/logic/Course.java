package logic;

public abstract class Course implements Cloneable {

	  private String name;

	  public Course(String name){      // ... with constructor
	    this.name = name;
	  }

	  public abstract boolean isPassed();
	  
	  public abstract String toString();
	  
	 // public boolean equals (Object o) // TO DO: QUESTION 4
		  
		
		  
	 //  protected Object clone() // TO DO: QUESTION 4
		  

	  public String getName() {
		  return name;
	  }

	  public void setName(String name) {
		  this.name = name;
	  }
	  
	  
	}
	

