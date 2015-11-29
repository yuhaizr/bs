package com.bs.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * 仓库实体
 * 
 * @author gateway
 * 
 */
@SuppressWarnings("serial")
public class Warehouse implements Serializable {

	// ------------field--------------------------------------
	private Long id;
	private String name;
	private String address;
	private String description;
	private Set<User> users = new HashSet<User>();
	private Set<Position> positions = new HashSet<Position>();
	

	// =============setter and getter method=================
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public Set<Position> getPositions() {
		return positions;
	}

	public void setPositions(Set<Position> positions) {
		this.positions = positions;
	}

	
}
