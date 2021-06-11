package com.cg.lpa.bean;

import java.time.LocalDate;

public class LoanApplicationBean {

	private int applicationId;
	private LocalDate applicationDate;
	private String loanProgram;
	private double loanAmount;
	private String propertyAddress;
	private double annualFamilyIncome;
	private String docsProof;
	private String guaranteeCover;
	private double marktValOfCover;
	private String status;
	private LocalDate interviewDate;

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public LocalDate getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(LocalDate applicationDate) {
		this.applicationDate = applicationDate;
	}

	public String getLoanProgram() {
		return loanProgram;
	}

	public void setLoanProgram(String loanProgram) {
		this.loanProgram = loanProgram;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getPropertyAddress() {
		return propertyAddress;
	}

	public void setPropertyAddress(String propertyAddress) {
		this.propertyAddress = propertyAddress;
	}

	public double getAnnualFamilyIncome() {
		return annualFamilyIncome;
	}

	public void setAnnualFamilyIncome(double annualFamilyIncome) {
		this.annualFamilyIncome = annualFamilyIncome;
	}

	public String getDocsProof() {
		return docsProof;
	}

	public void setDocsProof(String docsProof) {
		this.docsProof = docsProof;
	}

	public String getGuaranteeCover() {
		return guaranteeCover;
	}

	public void setGuaranteeCover(String guaranteeCover) {
		this.guaranteeCover = guaranteeCover;
	}

	public double getMarktValOfCover() {
		return marktValOfCover;
	}

	public void setMarktValOfCover(double marktValOfCover) {
		this.marktValOfCover = marktValOfCover;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getInterviewDate() {
		return interviewDate;
	}

	public void setInterviewDate(LocalDate interviewDate) {
		this.interviewDate = interviewDate;
	}

	public LoanApplicationBean() {

	}

	public LoanApplicationBean(String loanProgram, double loanAmount,
			String propertyAddress, double annualFamilyIncome,
			String docsProof, String guaranteeCover, double marktValOfCover) {
		super();
		this.loanProgram = loanProgram;
		this.loanAmount = loanAmount;
		this.propertyAddress = propertyAddress;
		this.annualFamilyIncome = annualFamilyIncome;
		this.docsProof = docsProof;
		this.guaranteeCover = guaranteeCover;
		this.marktValOfCover = marktValOfCover;

	}

	public LoanApplicationBean(int applicationId, LocalDate applicationDate,
			String loanProgram, double loanAmount, String propertyAddress,
			double annualFamilyIncome, String docsProof, String guaranteeCover,
			double marktValOfCover, String status) {
		super();
		this.applicationId = applicationId;
		this.applicationDate = applicationDate;
		this.loanProgram = loanProgram;
		this.loanAmount = loanAmount;
		this.propertyAddress = propertyAddress;
		this.annualFamilyIncome = annualFamilyIncome;
		this.docsProof = docsProof;
		this.guaranteeCover = guaranteeCover;
		this.marktValOfCover = marktValOfCover;
		this.status = status;
	}

	public LoanApplicationBean(int applicationId, LocalDate applicationDate,
			String loanProgram, double loanAmount, String propertyAddress,
			double annualFamilyIncome, String docsProof, String guaranteeCover,
			double marktValOfCover, String status, LocalDate interviewDate) {
		super();
		this.applicationId = applicationId;
		this.applicationDate = applicationDate;
		this.loanProgram = loanProgram;
		this.loanAmount = loanAmount;
		this.propertyAddress = propertyAddress;
		this.annualFamilyIncome = annualFamilyIncome;
		this.docsProof = docsProof;
		this.guaranteeCover = guaranteeCover;
		this.marktValOfCover = marktValOfCover;
		this.status = status;
		this.interviewDate = interviewDate;
	}

	@Override
	public String toString() {
		return "Application Id        :" + applicationId
				+ "\nApplication Date      :" + applicationDate
				+ "\nLoan Program          :" + loanProgram
				+ "\nLoan Amount           :" + loanAmount
				+ "\nProperty Address      :" + propertyAddress
				+ "\nAnnual Family Income  :" + annualFamilyIncome
				+ "\nDocument Proof        :" + docsProof
				+ "\nGuarantee Cover       :" + guaranteeCover
				+ "\nMarket Value Of Cover :" + marktValOfCover
				+ "\nApplication Status    :" + status
				+ "\nInterview Date        :" + interviewDate
				+ "\n......................................................";
	}

}

