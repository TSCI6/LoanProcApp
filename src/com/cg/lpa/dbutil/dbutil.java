package com.cg.lpa.dbutil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.cg.lpa.exception.LoanProcessingException;

public class dbutil {
	public static Connection conn=null;
	public static Connection getConnection() throws LoanProcessingException, IOException
	{
		if (conn==null)
{
			try{
			File src= new File("resources/jdbc.properties");
			FileInputStream fis= new FileInputStream(src);
			Properties pro= new Properties();
			pro.load(fis);
	
		String driver=pro.getProperty("driver");
		String dburl= pro.getProperty("dbURL");
		String user= pro.getProperty("username");
		String pass= pro.getProperty("password");
		Class.forName(driver);
		conn= DriverManager.getConnection(dburl, user, pass);
		conn.commit();
		}
	catch(FileNotFoundException fe)
	{
		throw new LoanProcessingException("unable to find properties file"+fe.getMessage());
	}
	catch(ClassNotFoundException ce)
	{
		throw new LoanProcessingException("driver class not found"+ce.getMessage());
	}
	
	catch(IOException ie)
	{
		throw new LoanProcessingException("problem occured while reading the file"+ ie.getMessage());
	}
	catch(SQLException se)
	{
		throw new LoanProcessingException("problem occured while ontaining connection"+ se.getMessage());
	}
}
		return conn;
		}}


