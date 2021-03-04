package com.ncu.LoanOrganisationSystem;

import java.util.ArrayList;
import java.util.List;

public interface IGetInfo {
	
	public Address getAdd();
	public double getIncome();
	public void setIncome(double income);
	public Personal_info getInfo();
	public List<String> getAssets();
	public void setAssets(List<String> assets);
	public List<String> getLiability();
	public void setLiability(List<String> liability);
	public ArrayList<Customer> getNegCustomer();
	public String getRemarks();
	public void setRemarks(String remarks);
	public Loan_info getLinfo();


}
