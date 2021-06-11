package com.cg.lpa.dao;
import java.util.ArrayList;

import com.cg.lpa.bean.LoanProgramOfferedBean;
import com.cg.lpa.exception.LoanProcessingException;

import com.cg.lpa.bean.LoanProgramOfferedBean;
import com.cg.lpa.exception.LoanProcessingException;
import java.util.ArrayList;
public interface ILoanProcessingDao {

	public int loginUser(String userId, String password)
			throws LoanProcessingException;
	

	public ArrayList<LoanProgramOfferedBean> viewLoanProgramsOffered()
			throws LoanProcessingException;

}

