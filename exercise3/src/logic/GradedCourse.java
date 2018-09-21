package logic;

public class GradedCourse extends Course{
	private int score;

	public GradedCourse(String name, int score) {
		super(name);
		this.score = score;
	}

	@Override
	public boolean isPassed() {
		return this.score>50 ? true : false;
	}

	@Override
	public String toString() {
		return "(GradedCourse): "+this.getName()+", score: "+this.score;
	}

}
