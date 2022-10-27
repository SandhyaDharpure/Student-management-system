package dao;

import model.Student;

public interface StudentDaoInterface {
	public boolean insertStudent(Student s);
	public boolean delete(int roll);
	public boolean update(int roll,String update,int ch,Student s);
	public boolean showAllStudentById(Object roll );
	boolean insertStudent(Student s, int parameterindex);
	public void showAllStudent();
	void showAllStudentById(int roll);
	boolean insertStudent1(Student s);
	boolean showAllStudentById1(int roll);
	boolean showStudentById(int roll);

}
