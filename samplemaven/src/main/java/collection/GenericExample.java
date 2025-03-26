package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> s = new ArrayList<String>();
		s.add("Apple");
		s.add("Guva");
		s.add("orange");
		s.add("grape");
		s.add("mango");
		System.out.println(s);
		System.out.println(s.get(2));
		s.set(3,"pappaya");
		System.out.println(s);
		s.add("mango");
		System.out.println(s.indexOf("mango"));
		System.out.println(s.lastIndexOf("mango"));
		s.remove(5);
		System.out.println(s);
		System.out.println(s.contains("guva"));
	}

}
