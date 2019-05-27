package com.shravya.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shravya.model.Category;
import com.shravya.model.Supplier;
@Component
public class SupplierDaoImpl
{
	@Autowired
	SessionFactory f;
	Session s;
	public void saveSupplier(Supplier supplier)
	{
		s=f.openSession();
        if(supplier.getSupplierId()==0)
        {
		int id=(int)(Math.random()*10000);
	    supplier.setSupplierId(id);
        }
	    s.saveOrUpdate(supplier);
		Transaction transaction=s.beginTransaction();
		transaction.commit();
	}
	public List<Supplier> recieveSupplier()
	{
		s=f.openSession();
		Query query=s.createQuery("from Supplier");
		
		List list=query.list();
		List<Supplier> catList=query.list();
        return list;

}
	public void deleteSupplier(int supplierId) 
	{
		s=f.openSession();
		Supplier supplier=s.get(Supplier.class,supplierId);
		System.out.println(supplier);
		s.delete(supplier);
		Transaction transaction=s.beginTransaction();
		transaction.commit();
	}

	public Supplier editSupplier(int supplierId)
	{
		s=f.openSession();
		Supplier supplier=s.get(Supplier.class,supplierId);
		System.out.println("at sup controller"+supplier.getSupplierId());
		Transaction transaction=s.beginTransaction();
		transaction.commit();
		return supplier;
	}
	 public List<Supplier> printSupplierAddress()
	    {
	    	Session session=f.openSession();
	    	Query query=session.createQuery("from Supplier where supplierName= ");
	    	List list=query.list();
			List<Supplier> catList=query.list();
	        return list;
	    }
		
}