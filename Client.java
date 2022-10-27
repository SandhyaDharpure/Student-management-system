package main;

import java.util.Scanner;

import dao.StudentDao;
import dao.StudentDaoInterface;
import model.Student;

public class Client {

	public static void main(String[] args) {
		StudentDaoInterface dao=new StudentDao();
Scanner sc=new Scanner(System.in);
System.out.println("Welcome to Student Management application ");
while(true) {
	System.out.println("/n1.Add Student"+" /n2.Show All students"+"/n3.Get student based on roll number+"+"/n4.Delete the Student"+"n5.update the Student"+"/n6.Exit");
	System.out.println("Enter choice");
	int ch=sc.nextInt();
	switch(ch) {
	case 1:
		System.out.println("Add Student");
		System.out.println("Enter Student name");
		String name=sc.next();
		System.out.println("Student clg name");
		String clgname=sc.next();
		System.out.println("Enter city");
		String city=sc.next();
		System.out.println("Enter percentage");
		double percentage=sc.nextDouble();
		Object clg = null;
		Student st=new Student( ch, name,clgname ,city,percentage);
		boolean ans =dao.insertStudent(st);
		 
			System.out.println("Record inserted successfully");
		
	
		break;
	case 2:
		System.out.println("show all Students");
		dao.showAllStudent();
		break;
	case 3:
		System.out.println("Get Student based on rollnumber");
		System.out.println("enter roll number");
		int rollnum=sc.nextInt();
		
		Object roll = null;
		boolean f=dao.showAllStudentById(roll);
		if(!f)
			System.out.println("Student with id is not available in our system");
		break;
	case 4:
		System.out.println("Delete Student");
		System.out.println("enter roll number to delete");
		int rollnum1=sc.nextInt();
		boolean ff=dao.delete(rollnum1);
		if(ff)
			System.out.println("Record deleted successfully");
		else 
		System.out.println	("something went wrong");
		
		break;
	case 5:
		System.out.println("Update the Student");
		System.out.println("/n1.Update name/n2 Update clgname");
		System.out.println("enter your choice");
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.println("enter roll number");
			int rnum=sc.nextInt();
			System.out.println("enter new name");
			String sname=sc.next();
			Student std=new Student();
			std.setName1(sname);
			boolean flag=dao.update(rnum, sname, choice, std);
			if(flag)
				System.out.println("Name Update successfully");
			else
				System.out.println("Something went wrong");
			
				
		}
		break;
	case 6:
		System.out.println("Thank you for using Student Management application.");
		int status = 0;
		System.exit(status);
default:
	System.out.println("please enter valid choice");
	
	
		
	

	}
}


	}

}
