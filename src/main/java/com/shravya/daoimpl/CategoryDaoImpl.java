package com.shravya.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.sql.ordering.antlr.Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shravya.model.Category;

@Component
public class CategoryDaoImpl 
{
@Autowired
SessionFactory f;
Session s;
public void saveCategory(Category category)
{
    s=f.openSession();
    if(category.getCategoryId()==0)
    {
    int id=(int)(Math.random()*10000);
    category.setCategoryId(id);
    System.out.println("..........."+id);
    }
    s.saveOrUpdate(category);
	Transaction transaction=s.beginTransaction();
	transaction.commit();
	s.close();
}

public List<Category> recieveAllCategory()
{
	s=f.openSession();
	Query query=s.createQuery("from Category");
	
	List list=query.list();
	List<Category> catList=query.list();
/*
for(Category catgry:catList)
{
	System.out.println(catgry.getCategoryId());
	System.out.println(catgry.getCategoryName());
	System.out.println(catgry.getCategoryDescription());
}
	*/
	
	return list;
		
}

public void deleteCategory(int categoryId) 
{
	s=f.openSession();
	Category category=s.get(Category.class,categoryId);
	System.out.println(category);
	s.delete(category);
	Transaction transaction=s.beginTransaction();
	transaction.commit();
	s.close();
}

public Category editCategory(int categoryId)
{
	s=f.openSession();
	Category category=s.get(Category.class,categoryId);
	Transaction transaction=s.beginTransaction();
	transaction.commit();
	s.close();
	return category;
}

}
