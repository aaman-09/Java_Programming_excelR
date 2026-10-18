//package DAY6;
//
//public class Driver {  //driver class means which contain main 
//	public static void main(String[] args) {
//		Student s1 = new Student();
//		s1.RegStud();
//		s1.DispStud();
//	}
//
//}

package DAY6;

import java.util.Scanner;

public class Driver{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student FSDbcth[] = new Student[3];
		
		for(int i=0; i<FSDbcth.length; i++) {
			
			System.out.println("Enter your name: ");
			String a = sc.next();
			System.out.println("Enter your roll: ");
			 int b = sc.nextInt();
			System.out.println("Enter your percenatge: ");
			double c= sc.nextDouble();
			FSDbcth[i] = new Student(a,b,c);
			
		}
		for(int i=0; i<FSDbcth.length; i++) {
			FSDbcth[i].DispStud();
			System.out.println();
		}
		
		System.out.println("Enter Roll number to search: ");
		int search = sc.nextInt();
		int flag=0;
		for(int i=0; i<FSDbcth.length; i++) {
			boolean Result = FSDbcth[i].SearchStud(search);
			if(Result==true) {
				flag+=1;
			}
		}
		if(flag==0) {
			System.out.println("Not found");
		}
		else
			System.out.println("Found");
		
		System.out.println("Enter name: ");
		String searchname = sc.next();
		int flag1=0;
		for(int i=0; i<FSDbcth.length; i++) {
			boolean Result = FSDbcth[i].SearchStudname(searchname);
			if(Result==true) {
				flag1+=1;
			}
		}
		if(flag1==0) {
			System.out.println("Not found");
		}
		else
			System.out.println("Found");
		
		
		
		
		sc.close();
	}
}