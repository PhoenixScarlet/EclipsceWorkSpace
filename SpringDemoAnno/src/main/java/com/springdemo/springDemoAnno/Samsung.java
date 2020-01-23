package com.springdemo.springDemoAnno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //getting object by class type by default which is non qualified and decapitalized
public class Samsung {
	
	@Autowired
	@Qualifier("mediaTech")//specifies which class needed
	MobileProcessor cpu;
	
	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}

	public void config(){
		System.out.println("Imagine the amazing things we can build.");
		cpu.process();
	}

}
