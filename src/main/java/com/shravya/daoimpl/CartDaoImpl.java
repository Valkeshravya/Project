package com.shravya.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shravya.model.Cart;
import com.shravya.model.Product;
@Component
public class CartDaoImpl
{
@Autowired
SessionFactory sessionFactory;

	public void saveCart(Cart c)
	{
		
		Session session=sessionFactory.openSession();
		if(c.getCartId()==0)
	    {
	    int id=(int)(Math.random()*10000);
	    c.setCartId(id);
	    System.out.println("..........."+id);
	    }

		session.save(c);
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		session.close();
	}
	
	public Cart setCart(Product product,int q )
	{
		Cart cart=new Cart();
		cart.setProductId(product.getProductId());
		cart.setProductName(product.getProductName());
		cart.setProductPrice(product.getProductPrice());
		cart.setProductSupplier(product.getProductSupplier());
	    cart.setProductQuantity(q);
	    cart.setTotalPrice((product.getProductPrice())*(cart.getProductQuantity()));
	    return cart;
	}
	
	public List<Cart> recieveCart()
	{
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Cart");
		List<Cart> list=query.list();
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		return list;
	}
	
}
