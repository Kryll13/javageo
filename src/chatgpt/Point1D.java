package chatgpt;

//Point1D.java (sous-classe)
public class Point1D extends Point {
	private double x;

	public Point1D(String name, double x) {
		super(name);
		this.x = x;
	}

	@Override
	public String toString() {
		return getName() + ": (" + x + ")";
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}
}
