package com.gallery.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Supplier {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String supplierid;
	
	@Column
	private String suppliername;
	
	

	@Column
	private String supplieraddress;
    
	@Column
	private String role="ROLE_ADMIN";
	

	public String getRole() {
		return role;
	}



	public void setRole(String role) {
		this.role = role;
	}



	public String getSupplierid() {
		return supplierid;
	}



	public void setSupplierid(String supplierid) {
		this.supplierid = supplierid;
	}



	public String getSuppliername() {
		return suppliername;
	}



	public void setSuppliername(String suppliername) {
		this.suppliername = suppliername;
	}



	public String getSupplieraddress() {
		return supplieraddress;
	}



	public void setSupplieraddress(String supplieraddress) {
		this.supplieraddress = supplieraddress;
	}
    
}
