package chatgpt;

//Point.java (classe abstraite)
public abstract class Point {
	private String name;

	public Point(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return getName();
	}

	public String getName() {
		return name;
	}
}
