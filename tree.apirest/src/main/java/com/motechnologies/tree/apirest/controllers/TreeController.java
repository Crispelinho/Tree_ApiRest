package com.motechnologies.tree.apirest.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.motechnologies.tree.apirest.models.Tree;
import com.motechnologies.tree.apirest.services.TreeService;
import com.motechnologies.tree.apirest.services.TreeServiceImp;

@RestController
@RequestMapping("tree")
public class TreeController {
	
	@Autowired
    private TreeService treeService;
	
    public TreeController(TreeService treeService) {
		this.treeService = treeService;
	}

	@PostMapping("/")
    public Tree postTree(@RequestBody Tree tree) {
        
		return this.treeService.saveTree(tree);
    }
	
	@GetMapping("/{id}")
    public Optional<Tree> findTree(@PathVariable Long id) {
        
		return this.treeService.findTree(id);
    }
}
