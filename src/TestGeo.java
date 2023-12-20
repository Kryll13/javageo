import java.util.ArrayList;
import chatgpt.Point;
import chatgpt.Point1D;
import chatgpt.Point2D;
import chatgpt.Point3D;

public class TestGeo {
	public static void main(String[] args) {

		ArrayList<Point> tab = new ArrayList<>();

		tab.add(new Point1D("P", 2));
		tab.add(new Point2D("S", 3, 6));
		tab.add(new Point3D("Y", -1, 0, -2));

		// System.out.println(tab);

		for (Point element : tab) {
			System.out.println(element);
		}

	}
}
