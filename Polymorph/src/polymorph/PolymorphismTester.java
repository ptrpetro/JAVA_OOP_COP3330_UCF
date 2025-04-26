package polymorph;

import java.util.*;

public class PolymorphismTester {
	public static void main(String[] args) {
		Vehicle v = new Car();
		Car c1 = new Car();
		Boat b1 = new Boat();
		ArrayList<Vehicle> arr = new ArrayList<Vehicle>();
		arr.add(v);
		arr.add(c1);
		arr.add(b1);
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i).run());
		}
	}
}
