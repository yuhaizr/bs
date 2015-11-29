package com.bs.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * 部门实体
 * 
 * @author gateway
 * 
 */
@SuppressWarnings("serial")
public class Department implements Serializable {

	// -----------field------------------------------------
	private Long id; // 部门编号
	private String name; // 部门名称
	private String description; // 部门说明
	private Set<User> users = new HashSet<User>();
	private Department parent; // 上级部门
	private Set<Department> children = new HashSet<Department>(); // 下级部门
	
	// ================setter and getter method=============
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

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public Department getParent() {
		return parent;
	}

	public void setParent(Department parent) {
		this.parent = parent;
	}

	public Set<Department> getChildren() {
		return children;
	}

	public void setChildren(Set<Department> children) {
		this.children = children;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Department other = (Department) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
