package com.cg.lpa.service;

import java.util.ArrayList;

import com.cg.lpa.bean.ApprovedLoanBean;
import com.cg.lpa.bean.LoanApplicationBean;
import com.cg.lpa.dao.ILoanApprovalDeptDao;
import com.cg.lpa.dao.LoanApprovalDeptDaoImpl;
import com.cg.lpa.exception.LoanProcessingException;

public class LoanApprovalDeptServiceImpl implements ILoanApprovalDeptService {
	ILoanApprovalDeptDao ladDao = null;

	@Override
	public ArrayList<LoanApplicationBean> viewLoanApplicationForSpecificProgram(
			String loanProgram) throws LoanProcessingException {
		LoanApprovalDeptDaoImpl ladDao = new LoanApprovalDeptDaoImpl();

		return ladDao.viewLoanApplicationForSpecificProgram(loanProgram);
	}

	@Override
	public boolean modifyApplicationStatus(int applicationId, String newStatus)
			throws LoanProcessingException {
		LoanApprovalDeptDaoImpl ladDao = new LoanApprovalDeptDaoImpl();

		return ladDao.modifyApplicationStatus(applicationId, newStatus);
	}

	@Override
	public String getApplicantName(int applicationId)
			throws LoanProcessingException {
		LoanApprovalDeptDaoImpl ladDao = new LoanApprovalDeptDaoImpl();
		return ladDao.getApplicantName(applicationId);
	}

	@Override
	public boolean fillApprovedLoanDetails(ApprovedLoanBean approvedLoan)
			throws LoanProcessingException {
		LoanApprovalDeptDaoImpl	ladDao = new LoanApprovalDeptDaoImpl();
		return ladDao.fillApprovedLoanDetails(approvedLoan);
	}

	@Override
	public double getLoanAmountGranted(int applicationId)
			throws LoanProcessingException {
		LoanApprovalDeptDaoImpl ladDao = new LoanApprovalDeptDaoImpl();
		return ladDao.getLoanAmountGranted(applicationId);
	}

	@Override
	public double getRateOfInterest(int applicationId)
			throws LoanProcessingException {
		LoanApprovalDeptDaoImpl ladDao = new LoanApprovalDeptDaoImpl();
		return ladDao.getRateOfInterest(applicationId);
	}

	@Override
	public int getLoanDurationInYears(int applicationId)
			throws LoanProcessingException {
		LoanApprovalDeptDaoImpl ladDao = new LoanApprovalDeptDaoImpl();
		return ladDao.getLoanDurationInYears(applicationId);
	}

	@Override
	public boolean setInterviewDate(int applicationId)
			throws LoanProcessingException {
		LoanApprovalDeptDaoImpl ladDao = new LoanApprovalDeptDaoImpl();
		return ladDao.setInterviewDate(applicationId);
	}

}
