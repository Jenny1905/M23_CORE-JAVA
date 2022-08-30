package com.cg.entities;

public class Employee 
{
	private int ID;
	private String Ename;
	
	//Parameterized Constructor
	public Employee(int iD, String ename) {
		super();
		ID = iD;
		Ename = ename;
	}
	
	//default constructor
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}

	@Override
	public String toString() {
		return String.format("Employee [ID=%s, Ename=%s]", ID, Ename);
	}
	
	

}
