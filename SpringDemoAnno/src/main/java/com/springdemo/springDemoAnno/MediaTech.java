package com.springdemo.springDemoAnno;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary //gives first priority to this class when executed
public class MediaTech implements MobileProcessor {

	public void process() {
		System.out.println("inside mediatech");
	}

}
