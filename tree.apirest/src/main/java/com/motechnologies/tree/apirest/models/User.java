package com.motechnologies.tree.apirest.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Entity;

@Entity
@Table(name = "USERS")
public class User {
	@Id
    @GeneratedValue
    @Column(name = "ID")
	private Long id;
	@Column(name = "name")
	private String name;
}
