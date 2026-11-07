package DAY14_Java_8_ft_pt2;
import java.security.KeyStore.Entry;

import java.util.*;

public class StreamingAPIdemo2 {
	public static void main(String[] args) {
		List<Employee> employeesList = new ArrayList();
		
		employeesList.add(new Employee(6, "June",    43,"male",   "IT",     2016, 1900.0));
		employeesList.add(new Employee(5, "May",     23,"female", "Sales",  2015, 1000.0));
		employeesList.add(new Employee(12,"November",19,"male",   "IT",     2012, 1300.0));
		employeesList.add(new Employee(11,"December",46,"female", "Finance",2011, 1400.0));
		
		employeesList.add(new Employee(1, "January",  27,"male",   "IT",    2001, 2400.0));
		employeesList.add(new Employee(10,"October",  32,"female", "Sales", 2010, 1500.0));
		employeesList.add(new Employee(9, "September",28,"male",   "Sales", 2009, 1600.0));
		employeesList.add(new Employee(8, "August",   23,"female", "HR",    2008, 1700.0));
		
		employeesList.add(new Employee(2, "February", 59,"male",   "IT",    2002, 2300.0));
		employeesList.add(new Employee(4, "April",    21,"female", "Sales", 2004, 2100.0));
		employeesList.add(new Employee(3, "March",    33,"male",   "HR",    2003, 2200.0));
		employeesList.add(new Employee(7, "July",     47,"female", "HR",    2007, 1800.0));
				for(Employee emp : employeesList) {			System.out.println(emp);		}
		System.out.println();
		System.out.println("---ALL IT Employee---");
		employeesList.stream()	
		.filter(emp->emp.getDepartment().equalsIgnoreCase("it"))
		.forEach(emp->System.out.println(emp));
		
		System.out.println();
		System.out.println("---ALL IT Employee with name---");
		employeesList.stream()
		.filter(emp->emp.getDepartment().equalsIgnoreCase("it"))
		.map(emp->emp.getName())
		.forEach(emp->System.out.println(emp));
		
		System.out.println();
		System.out.println("---Employee that earns more than 2000---");
		employeesList.stream()
		.filter(emp->emp.getSalary()>2000)
		.map(emp->emp.getName())
		.forEach(emp->System.out.println(emp));

	}
}
