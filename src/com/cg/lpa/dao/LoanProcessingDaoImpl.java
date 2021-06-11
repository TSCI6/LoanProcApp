package com.cg.lpa.dao;

import java.sql.Statement;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.cg.lpa.bean.LoanProgramOfferedBean;
import com.cg.lpa.bean.UserBean;
import com.cg.lpa.dbutil.dbutil;
import com.cg.lpa.exception.LoanProcessingException;

public class LoanProcessingDaoImpl implements ILoanProcessingDao {
	private Logger logger = Logger.getLogger(LoanProcessingDaoImpl.class);

	UserBean user = new UserBean();
	Connection conn = null;
	PreparedStatement pstmt = null;
	Statement stmt = null;
	ResultSet rs = null;

	// User login class

	@Override
	public int loginUser(String userId, String password)
			throws LoanProcessingException {
		String type = "";
		int n = -1;

		try {
			Connection conn;
			conn = dbutil.getConnection();
			pstmt = conn.prepareStatement(IQueryMapper.GET_USER_ROLE);
			pstmt.setString(1, userId);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				type = rs.getString(1);
			}
			if ("admin".equals(type)) {
				n = 1;
			} else if ("lad".equals(type)) {
				n = 0;
			} else {
				n = -1;
			}

		} catch (SQLException e1) {
			throw new LoanProcessingException("problem : " + e1.getMessage());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n;
	}

	@Override
	public ArrayList<LoanProgramOfferedBean> viewLoanProgramsOffered()
			throws LoanProcessingException {
		ArrayList<LoanProgramOfferedBean> loanProgramList = new ArrayList();
		try {
			Connection conn;
			conn = dbutil.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rst;
			rst = ((java.sql.Statement) stmt)
					.executeQuery(IQueryMapper.GET_LOAN_PROGRAMS_OFFERED);

			while (rst.next()) {
				LoanProgramOfferedBean loanProgram = new LoanProgramOfferedBean(
						rst.getString(1), rst.getString(2), rst.getString(3),
						rst.getInt(4), rst.getDouble(5), rst.getDouble(6),
						rst.getDouble(7), rst.getString(8));
				loanProgramList.add(loanProgram);
			}
		} catch (Exception e) {
			throw new LoanProcessingException("Error in " + e.getMessage());
		}

		return loanProgramList;
	}

	public ArrayList<String> pgmname() throws LoanProcessingException, IOException, SQLException {

		//Connection conn;
		PreparedStatement ps = null;
		ResultSet resultset = null;
		// System.out.println("available ids are");
		List<String> list = new ArrayList<String>();
		Connection conn;
		conn = dbutil.getConnection();
		
		
			
			ps = conn.prepareStatement(IQueryMapper.pgmname_query);
			resultset = ps.executeQuery();
			
			try {
			
			while (resultset.next()) {
			
				list.add(resultset.getString(1));

			}

		} catch (SQLException sqlException) {
			logger.error(sqlException.getMessage());
			throw new LoanProcessingException(
					"Tehnical problem occured. Refer log");
		} 
		finally {
			try {
				resultset.close();
				ps.close();

			} catch (SQLException e) {
				logger.error(e.getMessage());
				throw new LoanProcessingException(
						"Error in closing db connection");

			}
		}

		return (ArrayList<String>) list;
	}
}
