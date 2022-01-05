package com.motechnologies.tree.apirest.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.motechnologies.tree.apirest.models.Node;

public interface NodeService {
	public Node saveNode(Node node);
	
	public Optional<Node> findNode(Long id);
}
