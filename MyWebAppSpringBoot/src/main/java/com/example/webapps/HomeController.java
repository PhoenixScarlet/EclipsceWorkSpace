package com.example.webapps;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

@RequestMapping("index")	
//@ResponseBody
//public String home(HttpServletRequest req) 
/*
public String home(String name,HttpSession session)
{
    HttpSession session=req.getSession();	
	String name=req.getParameter("name");
	System.out.println("inside homecontroller class!!!"+name);
	session.setAttribute("name", myName);
	return "index";
	//return "index.jsp";
}
  public String home(@RequestParam("name")String myName,HttpSession session)
{
	
	System.out.println("inside homecontroller class!!!"+myName);
	session.setAttribute("name", myName);
	return "index";
	
}*/

/* public ModelAndView home(@RequestParam("name")String myName)
{
	ModelAndView mv=new ModelAndView();
	mv.addObject("name", myName);
	mv.setViewName("index");
	return mv;
	
}*/
public ModelAndView home(Alien alien)//for multiple parameters
{
	ModelAndView mv=new ModelAndView();
	mv.addObject("obj", alien);
	mv.setViewName("index");
	return mv;
	
}



}
