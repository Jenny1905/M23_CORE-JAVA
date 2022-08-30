package com.cg.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.cg.dao.EmployeeDao;
import com.cg.entities.Employee;

public class EmployeeRepoImpl implements EmployeeRepo{
	EmployeeDao dao;
	
	
	public EmployeeRepoImpl() 
	{
		dao=new EmployeeDao();
	}

	@Override
	public Statement createStatement() {
		Connection c=dao.createConnection();
		Statement s;
		try {
			s=c.createStatement();
		} catch (SQLException e) {
			s=null;
			
		}
		return s;
	}

	@Override
	public PreparedStatement createPrepareStatement(String query) {
		Connection c=dao.createConnection();
		PreparedStatement s;
		try {
			s=c.prepareStatement(query);
		} catch (SQLException e) {
			s=null;
			
		}
		return s;
	}

	@Override
	public ResultSet RetreiveQuery(String query) {
		Statement s=createStatement();
		ResultSet r;
		try {
			r=s.executeQuery(query);
		} catch (SQLException e) {
			r=null;
			
		}
		return r;
		
		

		
	}

	@Override
	public int AddQuery(String query, Employee e) {
		PreparedStatement s=createPrepareStatement(query);
		int count=0;
		
		try {
			s.setInt(1, e.getID());
			s.setString(2, e.getEname());
			count=s.executeUpdate();
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		return count;
	}

	@Override
	public int updateQuery(String query, Employee e) {
		PreparedStatement s=createPrepareStatement(query);
		int count=0;
		
		try {
			s.setInt(2, e.getID());
			s.setString(1, e.getEname());
			count=s.executeUpdate();
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		return count;
	}

	@Override
	public int deleteQuery(String query) {
		Statement s=createStatement();
		int count;
		try {
			count=s.executeUpdate(query);
		} catch (SQLException e) {
			count=0;
			//e.printStackTrace();
		}
		return count;
	}

}
