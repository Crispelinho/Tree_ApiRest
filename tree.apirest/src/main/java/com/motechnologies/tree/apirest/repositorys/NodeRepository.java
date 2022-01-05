package com.motechnologies.tree.apirest.repositorys;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.motechnologies.tree.apirest.models.Node;

public interface NodeRepository extends JpaRepository<Node, Long>{
	
}
