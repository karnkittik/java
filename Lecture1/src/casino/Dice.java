package casino;

public class Dice {
	public final static int MAX = 6;
	private int faceValue; // Encapsulation

	public Dice() {
		super();
	}

	public Dice(int faceValue) {
		super();
		this.setFaceValue(faceValue);
	}

	public int roll() {
		faceValue = (int) (Math.random() * MAX) + 1;
		return faceValue;
	}

	public int getFaceValue() {
		return faceValue;
	}

	public void setFaceValue(int faceValue) {
		if (faceValue >= this.MAX)
			this.faceValue = this.MAX;
		else if (faceValue < 1)
			this.faceValue = 1;
		else
			this.faceValue = faceValue;
	}

	@Override
	public String toString() {
		return "Dice [faceValue=" + faceValue + "]";
	}



	@Override
	public boolean equals(Object obj) {
		Dice other = (Dice) obj;
		if (faceValue != other.faceValue)
			return false;
		return true;
	}
	

}
