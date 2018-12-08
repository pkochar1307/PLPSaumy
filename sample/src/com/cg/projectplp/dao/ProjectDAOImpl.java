package com.cg.projectplp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.projectplp.beans.Inventory;

@Repository("projectdao")
public class ProjectDAOImpl implements ProjectDAO{
	
	@PersistenceContext
	EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	public List<Inventory> getProductList() {
		// TODO Auto-generated method stub
		Query getQuery = em.createQuery("FROM Inventory");
		List<Inventory> getProduct = getQuery.getResultList();
		return getProduct;
	}

	@Override
	public void addProducts(Inventory inventory) {
		// TODO Auto-generated method stub
		
		em.persist(inventory);
		em.flush();
	}

	@Override
	public Inventory updateProducts(Inventory in) {
		// TODO Auto-generated method stub
		//System.out.println(in.getProduct_id());
		Inventory inventory = em.find(Inventory.class, in.getProduct_id());
		//System.out.println(in.getPrice());
		//float pr=in.getPrice();
		//inventory.setPrice(pr);		
		//inventory.setQuantity(in.getQuantity());
		Inventory invent= em.merge(inventory);
		return invent;
	}
	
}
