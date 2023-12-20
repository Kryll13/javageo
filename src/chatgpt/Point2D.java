package chatgpt;

//Point2D.java (sous-classe)
public class Point2D extends Point {
	private double x;
	private double y;

	public Point2D(String name, double x, double y) {
		super(name);
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return getName() + ": (" + x + ", " + y + ")";
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
}
