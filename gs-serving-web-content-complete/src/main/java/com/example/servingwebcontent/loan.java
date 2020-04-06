package com.example.servingwebcontent;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class loan {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer loan_id;
    private Integer account_id;
    private Integer amount;
    private Boolean done;

	public Integer getloan_id() { return loan_id; }
	public void setloan_id(Integer loan_id) { this.loan_id = loan_id; }
	
	public Integer getaccount_id() { return account_id; }
	public void setaccount_id(Integer account_id) { this.account_id = account_id; }

	public Integer getamount() { return amount; }
	public void setbalance(Integer amount) { this.amount = amount; }
	
	public Boolean getdone() { return done; }
	public void setdone(Boolean done) { this.done = done; }
}
