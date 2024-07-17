package com.HqlLaptop;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Laptop {
@Id
@GeneratedValue (strategy=GenerationType.AUTO)
int lid;
String lname;
int lversion;
int price;
public Laptop() {
	super();
	// TODO Auto-generated constructor stub
}
public Laptop(String lname, int lversion, int price) {
	super();
	this.lname = lname;
	this.lversion = lversion;
	this.price = price;
}

public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public int getLversion() {
	return lversion;
}
public void setLversion(int lversion) {
	this.lversion = lversion;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "Laptop [lid=" + lid + ", lname=" + lname + ", lversion=" + lversion + ", price=" + price + "]";
}

	
}
