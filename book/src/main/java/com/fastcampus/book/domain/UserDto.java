package com.fastcampus.book.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class UserDto {
	private int cust_no;
	private String cust_name;
	private String phone;
	private Date join_date;
	private String cust_email;
	private String grade;
	private int total_rent_price;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cust_email == null) ? 0 : cust_email.hashCode());
		result = prime * result + ((cust_name == null) ? 0 : cust_name.hashCode());
		result = prime * result + cust_no;
		result = prime * result + ((grade == null) ? 0 : grade.hashCode());
		result = prime * result + ((join_date == null) ? 0 : join_date.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + total_rent_price;
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
		UserDto other = (UserDto) obj;
		if (cust_email == null) {
			if (other.cust_email != null)
				return false;
		} else if (!cust_email.equals(other.cust_email))
			return false;
		if (cust_name == null) {
			if (other.cust_name != null)
				return false;
		} else if (!cust_name.equals(other.cust_name))
			return false;
		if (cust_no != other.cust_no)
			return false;
		if (grade == null) {
			if (other.grade != null)
				return false;
		} else if (!grade.equals(other.grade))
			return false;
		if (join_date == null) {
			if (other.join_date != null)
				return false;
		} else if (!join_date.equals(other.join_date))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (total_rent_price != other.total_rent_price)
			return false;
		return true;
	}
	
	public UserDto() {}
	
	public UserDto(int cust_no, String cust_name, String phone, Date join_date, String cust_email, String grade,
			int total_rent_price) {
		super();
		this.cust_no = cust_no;
		this.cust_name = cust_name;
		this.phone = phone;
		this.join_date = join_date;
		this.cust_email = cust_email;
		this.grade = grade;
		this.total_rent_price = total_rent_price;
	}
	

	public int getCust_no() {
		return cust_no;
	}

	public void setCust_no(int cust_no) {
		this.cust_no = cust_no;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getJoin_date() {
		return join_date;
	}

	public void setJoin_date(Date join_date) {
		this.join_date = join_date;
	}

	public String getCust_email() {
		return cust_email;
	}

	public void setCust_email(String cust_email) {
		this.cust_email = cust_email;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getTotal_rent_price() {
		return total_rent_price;
	}

	public void setTotal_rent_price(int total_rent_price) {
		this.total_rent_price = total_rent_price;
	}

	@Override
	public String toString() {
		return "UserDto [cust_no=" + cust_no + ", cust_name=" + cust_name + ", phone=" + phone + ", join_date="
				+ join_date + ", cust_email=" + cust_email + ", grade=" + grade + ", total_rent_price="
				+ total_rent_price + "]";
	}
	

}
