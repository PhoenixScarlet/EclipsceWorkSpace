package com.demo.springjpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.demo.springjpa.dao.AlienRepo;
import com.demo.springjpa.model.Alien;

/*@Controller
public class AlienController {
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return"home.jsp";
	}
	
	/**Accepting Client Data**/
	/*@RequestMapping("/addAlien")
	public String addAlien(Alien alien) {
		repo.save(alien);
		return"home.jsp";
	}*/
	
	
	
	/**JPA | MVC | H2 Example**/   
	 // @RequestMapping("/getAlien")//To get the data based on id
	//public ModelAndView getAlien(@RequestParam int aid) {
		
		/**ModelAndView**/
		//ModelAndView mv=new ModelAndView("showAlien.jsp");
		//Alien alien = repo.findById(aid).orElse(new Alien());
		
		/** Data JPA | MVC | H2 | Query Methods Example**/
		/*System.out.println(repo.findByTech("java"));
		System.out.println(repo.findByAidGreaterThan(103));
		System.out.println(repo.findByTechSorted("java"));
		mv.addObject(alien);
		return mv;
	}*/
	
	
	
	/**Data JPA | MVC | H2 | REST Example (GET) part 1**/
	/*@RequestMapping("/alien")//to display all the data from aliens
	@ResponseBody //To display data not view page
	public String getAliens() {
		return repo.findAll().toString();
	}*/
	
	
	/**Data JPA | MVC | H2 | REST Example (GET) part 2**/
	/*@RequestMapping("/alien/102")//to display by particular id
	@ResponseBody //To display data not view page
	public String getAlien() {
		
		return repo.findById(102).toString();
	}*/
	
	
	/**Data JPA | MVC | H2 | REST Example (GET) part 3**/
/*	@RequestMapping("/alien/{aid}")//to display by id dynamically use wildcard bracket{}
	@ResponseBody //To display data not view page
	public String getAlien(@PathVariable("aid") int aid) {
		
		return repo.findById(aid).toString();
	}*/
	
	
	
	
	/**Data JPA | MVC | H2 | REST Example (POST)**/
	/**This is implemented when one service tries to communicate with another service**/ 
	/**To return data/response in JSON Format as String format is not understood by another service**/
	/**Convertion to JSON done by jackson jar in maven repo by default for spring boot**/
	/*@RequestMapping("/alien")//to display all the data from aliens
	@ResponseBody //To display data not view page
	public List<Alien> getAliens() {
		return repo.findAll();
	}
	
	@RequestMapping("/alien/{aid}")//to display by id dynamically use wildcard bracket{}
	@ResponseBody //To display data not view page
	public Optional<Alien> getAlien(@PathVariable("aid") int aid)//Optional- Returns Alien object if present else returns Optional data
	{
		
		return repo.findById(aid);
	}*/
	
	
	/**Postman | Data JPA | MVC | H2 | REST Example**/
	/*For this to get xml response add jackson dataformat xml(version of jackson core) jar to the pom.xml file*/
	
	
	/**Content Negotiation | Data JPA | MVC | H2 | REST**/
	/**To restrict the response type**/
	/*@RequestMapping(path="/alien",produces= {"application/xml"})//path=to display all the data from aliens,produces=to respond only in xml 
	@ResponseBody //To display data not view page
	public List<Alien> getAliens() {
		return repo.findAll();
	}*/
	
//}


@RestController //alternate for @ResponseBody,specifies all methods works for REST API
public class AlienController {
	@Autowired
	AlienRepo repo;
	

	
	/**Spring Boot | MVC | REST Post Example(POST-Send data)**/
	/**Add data**/
	@PostMapping(path="/alien",consumes= {"application/json"})//consumes-accepting the type of data from client
	public Alien addAlien(@RequestBody Alien alien)//@RequestBody-to send raw data in POSTMAN
	{
		repo.save(alien);
		return alien;
	}
	
	@GetMapping(path="/alien")//path=to display all the data from aliens
	public List<Alien> getAliens() {
		return repo.findAll();
	}
	
	@GetMapping("/alien/{aid}")//to display by id dynamically use wildcard bracket{}
	public Optional<Alien> getAlien(@PathVariable("aid") int aid)//Optional- Returns Alien object if present else returns Optional data
	{
		
		return repo.findById(aid);
	}
	
	
	/** Spring Boot | MVC | REST PUT DELETE Example(PUT-Update/Add data)**/
	/**Delete data**/
	@DeleteMapping("/alien/{aid}")
	public String deleteAlien(@PathVariable int aid) {
		Alien a=repo.getOne(aid);
		repo.delete(a);
		return aid+" Record deleted";	
	}
	
	/**Update data**/
	@PutMapping(path="/alien",consumes= {"application/json"})
	public Alien saveOrUpdateAlien(@RequestBody Alien alien) {
		repo.save(alien);
		return alien;	
	}
}

