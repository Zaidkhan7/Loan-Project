package com.ncu.LoanOrganisationSystem;

import java.util.ArrayList;
import java.util.List;

public class Customer implements IGetInfo{
	
	Personal_info info;
	private Loan_info linfo;
	private Address add;
	private String app_no;
	private double income;
	private List<String> assets;
	private List<String> liability;
	private ArrayList<Customer> negCustomer;
	private String remarks;
	
	
	public Loan_info getLinfo() {
		return linfo;
	}
	public void setLinfo(Loan_info linfo) {
		this.linfo = linfo;
	}
	public Personal_info getInfo() {
		return info;
	}
	public void setInfo(Personal_info info) {
		this.info = info;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public List<String> getAssets() {
		return assets;
	}
	public void setAssets(List<String> assets) {
		this.assets = assets;
	}
	public List<String> getLiability() {
		return liability;
	}
	public void setLiability(List<String> liability) {
		this.liability = liability;
	}
	public ArrayList<Customer> getNegCustomer() {
		return negCustomer;
	}
	public void setNegCustomer(ArrayList<Customer> negCustomer) {
		this.negCustomer = negCustomer;
	}
	public void generateApp_no()
	{
		app_no=info.getFull_name().substring(0,3)+info.getAadharCard().substring(0,5);
	}


}
