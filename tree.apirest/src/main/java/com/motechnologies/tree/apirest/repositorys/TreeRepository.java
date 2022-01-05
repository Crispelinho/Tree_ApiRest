package com.motechnologies.tree.apirest.repositorys;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.motechnologies.tree.apirest.models.Tree;

@Repository
public interface TreeRepository extends JpaRepository<Tree, Long>{
	public List<Tree> findAllTrees();
	
	public Optional<Tree> findTree(Long id);
	
	public Tree saveTree(Tree tree);		
}
