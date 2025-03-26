package collection;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set <String> s = new HashSet <String>();
		s.add("red");
		s.add("green");
		s.add("yellow");
		s.add("black");
		s.add("blue");
		System.out.println(s);
		
		Set <String> s1 = new HashSet <String>();
		s1.add("orange");
		s1.add("indigo");
		s1.add("violet");
		System.out.println(s1);
		s.addAll(s1);
		System.out.println(s);
		System.out.println(s.contains("black"));
		System.out.println(s.containsAll(s1));
		System.out.println(s1.containsAll(s));
		System.out.println(s.isEmpty());
		s.removeAll(s1);
		System.out.println(s);
		System.out.println(s.size());
		s1.clear();
		System.out.println(s1);
		
		
	}

}
