package com.mindtree.Ass6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class EmpMain {

	static List<Employee> emplist;

	public static void main(String args[]) {
		
		emplist = new ArrayList<Employee>();
		emplist.add(new Employee(10, "Saravanan", "Chennai", "Engineer", 20000.00));
		emplist.add(new Employee(9, "JayaPriya", "Cuddalore", "Accounts", 100000.00));
		emplist.add(new Employee(7, "Prithivi", "Pallavaram", "TechLead", 230000.00));
		emplist.add(new Employee(20, "Andal", "Pondy", "Engineer", 400000));
		emplist.add(new Employee(1, "Ram", "Guntur", "Architect", 500000));
		emplist.add(new Employee(11, "Seetha", "Andra", "Developer", 20000));
		System.out.println("Printing Stream Elements using for each:");
		
		System.out.println("Traversing into Forward Disrection ITERATOR");
		Iterator<Employee> itremp = emplist.iterator();
		while (itremp.hasNext()) {
			System.out.println(itremp.next());
		}

		System.out.println("Traversing into Backward Disrection");
		ListIterator<Employee> test = emplist.listIterator();
		while (test.hasNext()) {
			System.out.println(test.next());

		}
		System.out.println("Stream--- Map -- To-- UpperCase");
		emplist.stream().map(p -> p.Name.toUpperCase()).forEach(System.out::println);

		System.out.println("Iterating Elements using For Loop:\n");
		for (Employee e : emplist) {
			System.out.println("Emp Id:  " + e.getEmpId() + "  Emp Name :  " + e.getName() + "  Address :"
					+ e.getAddress() + "  Designation : " + e.getDesgnation());
		}

		System.out.println("\nCalculating Avg Salary of Employee:");
		OptionalDouble AvgSalary = emplist.stream().mapToDouble(Employee::getSalary).average();
		System.out.println(AvgSalary + "\n");
		System.out.println("Sorrting by Emp Name:\n");
		emplist.sort((Employee s1, Employee s2) -> s1.getName().compareTo(s2.getName()));
		emplist.forEach((s) -> System.out.println(s));

	}

}
