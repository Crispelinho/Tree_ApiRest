package com.motechnologies.tree.apirest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.motechnologies.tree.apirest.repositorys.TreeRepository;
import com.motechnologies.tree.apirest.services.TreeService;
import com.motechnologies.tree.apirest.services.TreeServiceImp;

public class Config {
	
	@Autowired
	public TreeRepository treeRepository;
	
	@Bean
	public TreeService transferService() {
		return new TreeServiceImp(treeRepository);
	}
	
}
