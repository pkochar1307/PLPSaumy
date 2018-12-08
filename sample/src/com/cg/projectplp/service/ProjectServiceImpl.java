package com.cg.projectplp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.projectplp.beans.Inventory;
import com.cg.projectplp.dao.ProjectDAO;

@Service("projectservice")
@Transactional
public class ProjectServiceImpl implements ProjectService{
	
	@Autowired
	ProjectDAO projectdao;
	
	@Override
	public List<Inventory> getProductList() {
		// TODO Auto-generated method stub
		return projectdao.getProductList();
	}

	@Override
	public void addProducts(Inventory inventory) {
		// TODO Auto-generated method stub
		projectdao.addProducts(inventory);
	}

	@Override
	public Inventory updateProducts(Inventory in) {
		// TODO Auto-generated method stub
		return projectdao.updateProducts(in);
	}

}
