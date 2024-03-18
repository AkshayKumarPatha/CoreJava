package list;

import java.util.ArrayList;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ArrayList list=new ArrayList();
//		list.add(1);
//		list.add("Akki");
//		list.add("Pavan");
//		System.out.println(list);
//		
//		List  list1=new ArrayList();
//		list1.add(1);
//		list1.add("Akki");
//		list1.add("Pavan");
//		System.out.println(list1);
//		for(Object i:list1)
//			System.out.println(i);
		List<Integer> list2=new ArrayList<>();
		list2.add(20);
		list2.add(25);
		List<String> list3=new ArrayList<>();
		list3.add("Hello");
		list3.add("Akshay");
		List<Double> list1=new ArrayList<>();
		list1.add(1.257894525);
		list1.add(8.2446644);
		List<Object> list=new ArrayList<>();
		list.add(list1);
		list.add(list3);
		list.add(list2);
		for(int i=0;i<list.size();i++) {
			for(int j=0;j<((List) list.get(i)).size();j++) {
				
				System.out.println((((List<Object>) list.get(i)).get(j)));
			}
		}
		
//		List<Example1> alist=new ArrayList<>();
//		
//		Example1 example1 =new Example1();
//		example1.setA(20);
//		example1.setB(50);
//		
//		alist.add(example1);
//		
//		System.out.println(alist);
		
	}

}
