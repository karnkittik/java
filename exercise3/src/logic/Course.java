package logic;

public abstract class Course implements Cloneable {


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

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
	

