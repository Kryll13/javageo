package chatgpt;

//Point3D.java (sous-classe)
public class Point3D extends Point {
	private double x;
	private double y;
	private double z;

	public Point3D(String name, double x, double y, double z) {
		super(name);
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Override
	public String toString() {
		return getName() + ": (" + x + ", " + y + ", " + z + ")";
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

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}
}
