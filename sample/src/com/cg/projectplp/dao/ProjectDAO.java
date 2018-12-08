package com.cg.projectplp.dao;

import java.util.List;

import com.cg.projectplp.beans.Inventory;

public interface ProjectDAO {
	public List<Inventory> getProductList();
	public void addProducts(Inventory inventory);
	public Inventory updateProducts(Inventory in);
}
