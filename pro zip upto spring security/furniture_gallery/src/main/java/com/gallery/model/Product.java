package com.gallery.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Product {
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private String id;
	@Column
	private String name;
	@Column
	private String prize;
	@Column
	private String quantity;
	@Column
	private String descrption;
	@Column
	private String CustId;
	@Column
	private String SuppId;
	
	@Column
	private String role="ROLE_ADMIN";
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrize() {
		return prize;
	}
	public void setPrize(String prize) {
		this.prize = prize;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getDescrption() {
		return descrption;
	}
	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}
	public String getCustId() {
		return CustId;
	}
	public void setCustId(String custId) {
		CustId = custId;
	}
	public String getSuppId() {
		return SuppId;
	}
	public void setSuppId(String suppId) {
		SuppId = suppId;
	}
	

}
