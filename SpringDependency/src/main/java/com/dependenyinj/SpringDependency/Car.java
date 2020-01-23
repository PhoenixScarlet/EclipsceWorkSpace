package com.dependenyinj.SpringDependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
	
	@Autowired //goes to spring.xml n gets instanse of tyre (for bean config)  or use @component;w/o this it returns null
	private Tyre tyre;
	
public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

public void drive() {
	System.out.println("driving car "+tyre);
}
}
