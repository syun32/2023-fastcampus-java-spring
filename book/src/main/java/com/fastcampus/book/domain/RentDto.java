package com.fastcampus.book.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class RentDto {
	private int cust_no;
	private int rent_no;
	private String book_code;
	private int rent_price;
	private Date rent_date;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((book_code == null) ? 0 : book_code.hashCode());
		result = prime * result + cust_no;
		result = prime * result + ((rent_date == null) ? 0 : rent_date.hashCode());
		result = prime * result + rent_no;
		result = prime * result + rent_price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RentDto other = (RentDto) obj;
		if (book_code == null) {
			if (other.book_code != null)
				return false;
		} else if (!book_code.equals(other.book_code))
			return false;
		if (cust_no != other.cust_no)
			return false;
		if (rent_date == null) {
			if (other.rent_date != null)
				return false;
		} else if (!rent_date.equals(other.rent_date))
			return false;
		if (rent_no != other.rent_no)
			return false;
		if (rent_price != other.rent_price)
			return false;
		return true;
	}
	
	public RentDto() {}

	public RentDto(int cust_no, int rent_no, String book_code, int rent_price, Date rent_date) {
		this.cust_no = cust_no;
		this.rent_no = rent_no;
		this.book_code = book_code;
		this.rent_price = rent_price;
		this.rent_date = rent_date;
	}

	public int getCust_no() {
		return cust_no;
	}

	public void setCust_no(int cust_no) {
		this.cust_no = cust_no;
	}

	public int getRent_no() {
		return rent_no;
	}

	public void setRent_no(int rent_no) {
		this.rent_no = rent_no;
	}

	public String getBook_code() {
		return book_code;
	}

	public void setBook_code(String book_code) {
		this.book_code = book_code;
	}

	public int getRent_price() {
		return rent_price;
	}

	public void setRent_price(int rent_price) {
		this.rent_price = rent_price;
	}

	public Date getRent_date() {
		return rent_date;
	}

	public void setRent_date(Date rent_date) {
		this.rent_date = rent_date;
	}

	@Override
	public String toString() {
		return "RentDto [cust_no=" + cust_no + ", rent_no=" + rent_no + ", book_code=" + book_code + ", rent_price="
				+ rent_price + ", rent_date=" + rent_date + "]";
	}
	

}
