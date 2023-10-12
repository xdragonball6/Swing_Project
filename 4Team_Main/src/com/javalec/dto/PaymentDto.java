package com.javalec.dto;

public class PaymentDto {
	
	int pnum;
	String pdate;
	int pprice;
	int duration;
	String starttime;
	
	public PaymentDto() {
		// TODO Auto-generated constructor stub
	}

	
	
	// Getter and Setter
	public int getPnum() {
		return pnum;
	}

	public void setPnum(int pnum) {
		this.pnum = pnum;
	}

	public String getPdate() {
		return pdate;
	}

	public void setPdate(String pdate) {
		this.pdate = pdate;
	}

	public int getPprice() {
		return pprice;
	}

	public void setPprice(int pprice) {
		this.pprice = pprice;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	
	

}
