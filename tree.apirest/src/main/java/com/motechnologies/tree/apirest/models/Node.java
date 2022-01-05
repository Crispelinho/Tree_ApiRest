package com.motechnologies.tree.apirest.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "NODES")
@Getter @Setter @NoArgsConstructor
public class Node implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;
    @Column(name = "key")
    private Integer key;
    @ManyToOne
    @JoinColumn(name = "parent", referencedColumnName="ID",nullable = true)
    private Node parent;
    @OneToOne(mappedBy = "parent",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "left", nullable = true)
    private Node left;
    @OneToOne(mappedBy = "parent",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "right", nullable = true)
    private Node right;
    @Column(name = "isRoot", nullable = true)
    private Boolean isRoot;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tree_id")
    private Tree tree;
    @Column(name = "content")
    private String content;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getKey() {
		return key;
	}
	public void setKey(Integer key) {
		this.key = key;
	}
	public Node getParent() {
		return parent;
	}
	public void setParent(Node parent) {
		this.parent = parent;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	public Boolean getIsRoot() {
		return isRoot;
	}
	public void setIsRoot(Boolean isRoot) {
		this.isRoot = isRoot;
	}
	public Tree getTree() {
		return tree;
	}
	public void setTree(Tree tree) {
		this.tree = tree;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

    
    
}
