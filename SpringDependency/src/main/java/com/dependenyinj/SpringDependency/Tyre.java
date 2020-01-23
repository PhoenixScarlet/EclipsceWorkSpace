package com.dependenyinj.SpringDependency;

import org.springframework.stereotype.Component;

@Component
public class Tyre 
{
String brand;

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

@Override
public String toString() {
	//return "Tyre [brand=" + brand + "]";
	return "With tyres...";
}

/*public Tyre(String brand) {
	super();
	this.brand = brand;
}	*/



}
