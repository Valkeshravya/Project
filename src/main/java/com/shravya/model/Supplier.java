package com.shravya.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Supplier
{
@Id
int supplierId;
	
@Column
private String supplierName;
@Column
private String supplierDescription;
private String supplierAddress;

public String getSupplierAddress() {
	return supplierAddress;
}
public void setSupplierAddress(String supplierAddress) {
	this.supplierAddress = supplierAddress;
}
public void setSupplierName(String n)
{
	supplierName=n;
}
public String getSupplierName()
{
	return supplierName;
}
public void setSupplierDescription(String d)
{
	supplierDescription=d;
}
public String getSupplierDescription()
{
	return supplierDescription;
}


public int getSupplierId() {
	return supplierId;
}
public void setSupplierId(int supplierId) {
	this.supplierId = supplierId;
}

}
