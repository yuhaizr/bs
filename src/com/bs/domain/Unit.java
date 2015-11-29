package com.bs.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * 计量单位实体
 * 
 * @author gateway
 * 
 */
@SuppressWarnings("serial")
public class Unit implements Serializable {

	// --------------field-------------------------------
	private Long id;
	private String name;
	private String description;

	// =====================setter and getter method===================
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

}
