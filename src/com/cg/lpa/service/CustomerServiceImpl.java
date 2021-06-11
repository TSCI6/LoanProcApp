package com.cg.lpa.service;

import com.cg.lpa.bean.CustomerDetailsBean;
import com.cg.lpa.bean.LoanApplicationBean;
import com.cg.lpa.dao.CustomerDaoImpl;
import com.cg.lpa.dao.ICustomerDao;
import com.cg.lpa.exception.LoanProcessingException;

public class CustomerServiceImpl implements ICustomerService {
	ICustomerDao customerDao = null;

	@Override
	public boolean applyLoan(LoanApplicationBean loanapplication)
			throws LoanProcessingException {
		// TODO Auto-generated method stub
		CustomerDaoImpl customerDao = new CustomerDaoImpl();
		return customerDao.applyLoan(loanapplication);
	}

	@Override
	public boolean fillCustomerDetails(CustomerDetailsBean customer)
			throws LoanProcessingException {
		CustomerDaoImpl customerDao = new CustomerDaoImpl();
		return customerDao.fillCustomerDetails(customer);
	}

	@Override
	public String viewApplicationStatus(int applicationID)
			throws LoanProcessingException {

		CustomerDaoImpl customerDao = new CustomerDaoImpl();
		return customerDao.viewApplicationStatus(applicationID);

	}

	@Override
	public boolean deleteLoanApplication(int applicationId)
			throws LoanProcessingException {
		CustomerDaoImpl	customerDao = new CustomerDaoImpl();
		return customerDao.deleteLoanApplication(applicationId);
	}

}
