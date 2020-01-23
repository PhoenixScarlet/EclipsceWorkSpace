package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //instaniates object by default
//@Scope(value="prototype") //creates object only when called
public class Alien {
	private int ID;
	private String name;
	@Autowired //searches object by type
	@Qualifier("lap1")  //searches object by name
	private Laptop laptop;
	
	public int getID() {
		return ID;
	}
 	
	public Alien() {
		super();
		System.out.println("object created.....");
	}

	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
void show() {
	System.out.println("Inside show");
	laptop.compile();
	
}
}
