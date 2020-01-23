package com.demo;


@Controller
public class AddController {
	@RequestMapping("/adds")
	public void add() {
		System.out.println("i'm here");
	}

}
