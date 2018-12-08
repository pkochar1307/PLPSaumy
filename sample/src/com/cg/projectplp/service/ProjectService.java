package com.cg.projectplp.service;

import java.util.List;

import com.cg.projectplp.beans.Inventory;

public interface ProjectService {
	
	public List<Inventory> getProductList();
	public void addProducts(Inventory inventory);
	public Inventory updateProducts(Inventory in);
	
}
