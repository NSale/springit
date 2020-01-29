package com.lesa.springit.domain;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.NonNull;

@Entity
public class Role {

	@Id
	@GeneratedValue
	private Long id;
	
	@NonNull
	private String name;
	
	@ManyToMany(mappedBy = "roles")
	private Collection<User> users;

	public Role(@NonNull String name, Collection<User> users) {
		super();
		this.name = name;
		this.users = users;
	}

	public Role() {
	}

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

	public Collection<User> getUsers() {
		return users;
	}

	public void setUsers(Collection<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + ", users=" + users + "]";
	}
	
}
