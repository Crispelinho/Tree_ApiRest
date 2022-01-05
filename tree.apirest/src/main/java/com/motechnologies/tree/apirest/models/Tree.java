package com.motechnologies.tree.apirest.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TREES")
@Getter @Setter @NoArgsConstructor
public class Tree implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tree",fetch = FetchType.EAGER)
    private List<Node> nodes = new ArrayList();

	public Tree() {
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public List<Node> getNodes() {
		return nodes;
	}



	public void setNodes(List<Node> nodes) {
		this.nodes = nodes;
	}



	@Override
	public String toString() {
		return "Tree [id=" + id + ", nodes=" + nodes + "]";
	}
    
    
}
