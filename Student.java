package model;

public class Student {
	
	private String name;
	private String clgname;
	private String city;
	private double percentage;
	private int rollNum;
	//public Student(String name, String clgname, String city, double percentage2) {}
	

	public Student(String name, String clgname , String city, double percentage, int rollNum) {
		this.rollNum=rollNum;
		this.name=name;
		this.clgname=clgname;
		this.city=city;
		this.percentage=percentage;
	}

	public Student(int rollNum,String name,String clgname,String city,double percentage) {
		this.rollNum=rollNum;
		this.name=name;
		this.clgname=clgname;
		this.city=city;
		this.percentage=percentage;
		
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}


	public int getRollNum() {
		return rollNum;
	}
public void setRollNum(int rollNum) {
	this.rollNum=rollNum;
}
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
public void setName1(String name) {
	this.name=name;
}
	public double getpercentage() {
		// TODO Auto-generated method stub
		return percentage;
	}
public void setpercentage(double percentage) {
	this.percentage=percentage;
}
	public String getCity() {
		// TODO Auto-generated method stub
		return city;
	}
public void setcity(String city) {
	this.city=city;
}
	public String getclgname() {
		// TODO Auto-generated method stub
		return clgname;
	}

	public void setclgname(String clgName, String clgname) {
		this.clgname=clgname;
		// TODO Auto-generated method stub
		
	}}


	
	

