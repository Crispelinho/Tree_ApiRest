package com.motechnologies.tree.apirest.services;

import java.util.Optional;

import com.motechnologies.tree.apirest.models.Tree;

public interface TreeService {

	//public List<Tree> findAllTrees();
	
	//public Optional<Tree> findTree(Long id);
	
	public Tree saveTree(Tree tree);

	public Optional<Tree> findTree(Long id);	
}
