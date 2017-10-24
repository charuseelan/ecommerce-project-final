package com.gallery.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String catid;
	
	@Column
	private String catname;
	
	@Column
	private String catdesc;

	@Column
	private String role="ROLE_ADMIN";
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getCatname() {
		return catname;
	}

	public String getCatid() {
		return catid;
	}

	public void setCatid(String catid) {
		this.catid = catid;
	}

	public void setCatname(String catname) {
		this.catname = catname;
	}

	public String getCatdesc() {
		return catdesc;
	}

	public void setCatdesc(String catdesc) {
		this.catdesc = catdesc;
	}

}
