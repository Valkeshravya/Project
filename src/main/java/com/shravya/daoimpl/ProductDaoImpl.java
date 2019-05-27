package com.shravya.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shravya.model.Category;
import com.shravya.model.Product;
import com.shravya.model.Supplier;
@Component
public class ProductDaoImpl
{
		
	@Autowired
  SessionFactory sf;
	public void addProduct(Product product)
	{
		Session session=sf.openSession();
		session.saveOrUpdate(product);
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		session.close();
	}
	
	public List<Product> recieveAllProducts()
	{
		Session session=sf.openSession();
		Query query=session.createQuery("from Product");
		
		List list=query.list();
		List<Product> catList=query.list();
        return list;
	}
	
	public void deleteProductRecord(int productId) 
	{
		Session session=sf.openSession();
		Product product=session.get(Product.class,productId);
		System.out.println(product);
		session.delete(product);
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		session.close();
	}
	
	public Product editProduct(int productId)
	{
		Session session=sf.openSession();
		Product product=getProduct(productId);
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		session.close();
		return product;
	}

	public Product getProduct(int productId)
	{
		Session session=sf.openSession();
		Product product=session.get(Product.class,productId);
		return product;
		
	}
	
	
}


