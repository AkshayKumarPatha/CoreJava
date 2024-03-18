package list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		Student student =new Student();
		student.setsID(1);
		student.setName("Akshay");
		student.setmNO(9912934505l);
		student.setEmail("AKbhjdvyabv");
		student.setGender('M');
		list.add(student);
		Student student1 =new Student();
		student1.setsID(2);
		student1.setName("Akshay");
		student1.setmNO(9912934505l);
		student1.setEmail("AKbhjdvyabv");
		student1.setGender('M');
		list.add(student1);
		System.out.println("Enter Student Id");
		int a=1;
		for(Student l:list) {
			if(l.getsID()==a) System.out.println(l);
		}
		Map<Integer,Student> s=new HashMap<>();
		for(Student l:list) {
			s.put(l.getsID(), l);
		}
		System.out.println(s);
		for(Map.Entry<Integer, Student> entry:s.entrySet()) {
		
			System.out.println(entry.getValue().getsID());
			
		
		}
	}

}
