package com.cts.rest;

import java.util.ArrayList;
import java.util.List;

public class StudentDao {
	
	
	static List<student> list=new ArrayList<student>();
	
	static student s1=new student("Vineeth",101,98);
	static student s2=new student("Sreeni",102,78);
	static student s3=new student("Dammu",103,86);
	static {
	list.add(s1);
	list.add(s2);
	list.add(s3);
	}
	
	public static List<student> getAllStudents()
	{
		return new ArrayList<student>(list);
		
	}
	
	public static student getStudent(int id)
	{
		List<student> list=getAllStudents();
		for(student s:list)
		{
			if(s.rollno==id) {
				return s;
			}

		}
		return null;
		
	}

	public static int addStudent(student std) {
		int user=0;
		List<student> lists=getAllStudents();
		for(student s:lists)
		{
			if(s.getRollno()!=std.getRollno())
			{
				 user=1;
			}
		}
		if(user==1) {
			list.add(std);
			return 1;
		}
		
		return 0;
	}

	public static int deleteStudent(int id) {
		int user=0;
		List<student> lists=getAllStudents();
		for(student s:lists)
		{
			if(s.getRollno()==id)
			{
				list.remove(s);
				 user=1;
			}
		}
		if(user==1) {
			
			return 1;
		}
		
		return 0;
	}

	public static int updateStudent(student std) {
		int user=0;
		List<student> lists=getAllStudents();
		for(student s:lists)
		{
			if(s.getRollno()==std.getRollno())
			{
				s.setSname(std.getSname());
				s.setMarks(std.getMarks());
				 user=1;
			}
		}
		if(user==1) {
			
			return 1;
		}
		
		return 0;
	}
	

}
