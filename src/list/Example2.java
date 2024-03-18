package list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Example2 {
	public static void main(String...args) {
		List<Integer> list = new LinkedList<>();
		list.add(25);
		list.add(58);
		list.add(55);
		list.add(55);
		System.out.println(list);
		List alist = new ArrayList();
		alist.add(1);
		alist.add("2");
		System.out.println(alist);
		
		Set<Integer> obj=new  HashSet<>();
		obj.add(2);
		obj.add(8);
		obj.add(0);
		System.out.println(obj);
		
		Set<Integer> obj1=new TreeSet<>();
		String s="Akmkknfk";
		System.out.println(s.split(" "));
	}

}
