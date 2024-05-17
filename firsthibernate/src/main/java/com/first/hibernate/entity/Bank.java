package com.first.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Bank {

	@Column(name = "bank_id")
	private int id;
	private String bankName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bank(int id, String bankName) {
		super();
		this.id = id;
		this.bankName = bankName;
	}
	
	
	
}
