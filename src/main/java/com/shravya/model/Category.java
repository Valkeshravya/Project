package com.shravya.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
public class Category
{
	@Id
	int categoryId;
	
@Column
private String categoryName;
@Column
private String categoryDescription;

public void setCategoryName(String n)
{
	categoryName=n;
}
public String getCategoryName()
{
	return categoryName;
}
public void setCategoryDescription(String d)
{
	categoryDescription=d;
}
public String getCategoryDescription()
{
	return categoryDescription;
}


public int getCategoryId() {
	return categoryId;
}
public void setCategoryId(int categoryId) {
	this.categoryId = categoryId;
}

}



