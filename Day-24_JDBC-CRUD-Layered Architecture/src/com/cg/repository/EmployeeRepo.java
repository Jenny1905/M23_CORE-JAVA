package com.cg.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.cg.entities.Employee;

public interface EmployeeRepo 
{
	Statement createStatement();
	PreparedStatement createPrepareStatement(String query);
	public ResultSet RetreiveQuery(String query);//retrieve
	public int AddQuery(String query,Employee e);//add
	public int updateQuery(String query,Employee e);//update
	public int deleteQuery(String query);//delete
}
