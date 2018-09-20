package casino;

public class SimpleDice {
	final static int MAX = 6;
	private int faceValue;  //Encapsulation

	public SimpleDice(int faceValue) {
		// faceValue = val
		this.faceValue = faceValue;
	}
	public SimpleDice() {
		this.roll();
	}
	
	//setter  allow to input
	public void setFaceValue(int val)  //Encapsulation 
	{	
		if(val >= SimpleDice.MAX)
			this.faceValue = SimpleDice.MAX;
		else if (val <= 0)
			this.faceValue = 1;
		else
			this.faceValue = val;
	}
	//getter  allow to output
	public int getFaceValue() //Encapsulation 
	{
		return this.faceValue;
	}

	public int roll() {
		faceValue = (int) (Math.random() * MAX) + 1;
		return faceValue;
	}
	
	public String toString() //Strict name
	{
		return "My dice is " + this.faceValue + ".";
	}
	
	public boolean equals(Object o) //Strict form
	{
		SimpleDice otherDice = (SimpleDice) o;
		
		if (this.getFaceValue() == otherDice.getFaceValue())
			return true;
		else
			return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
