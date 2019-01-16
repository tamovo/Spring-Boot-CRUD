package com.developer.SpringMySQL.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.developer.SpringMySQL.model.Contact;
import com.developer.SpringMySQL.model.ContactRepo;

@Controller
public class MainController {

	// get the object auto
	@Autowired
	ContactRepo contactRepo;

	@RequestMapping("/")
	public ModelAndView doHome() {
		// view Name
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("lists", contactRepo.findAll());

		return mv;
	}
	
	//Good,  error was table 'test.hibernate_sequence' doesn't exist
	//better?Create a new if statement if the userNo exists
	// add spring.jpa.properties.hibernate.id.new_generator_mappings=false to the application properties and make sure ID is A_I
	
	//phoneno is first name
	//personname is last name
	//form
	//RequestMethod.POST is sending data to the server.
	@RequestMapping( value="/save", method = RequestMethod.POST)
	public ModelAndView doSave(@RequestParam("id")String id,@RequestParam("phoneno") String phoneNo, @RequestParam("personname") String personName) {
		// view Name
		ModelAndView mv = new ModelAndView("redirect:/");
		Contact c= new Contact() ;
	
		c.setPersonName(personName);
        c.setPhoneNo(phoneNo);
		contactRepo.save(c);
		return mv;
	}
	
	//Not working, Property [id] not found on type [java.util.Optional]
	//The problem maybe the  contactRepo.findById(id)
	//Path variable can use the id as a path.
	//Function, View on the specific account
	//RequestMethod is requesting data from a resources
	@RequestMapping( value="/view/{id}", method = RequestMethod.GET)
	public ModelAndView doView(@PathVariable("id") int id) {
		// view Name
	   ModelAndView mv = new ModelAndView("view");
       mv.addObject("lists", contactRepo.findById(id).get());

		return mv;

//		Optional<Student> student = studentRepository.findById(id);
//
//		if (!student.isPresent())
//			throw new StudentNotFoundException("id-" + id);
//
//		return student.get();
	}
	
	//Goo
	@RequestMapping( value="/delete/{id}", method = RequestMethod.GET)
	public ModelAndView doDelete(@PathVariable("id") int id) {
		// view Name
	   ModelAndView mv = new ModelAndView("redirect:/");
        contactRepo.deleteById(id);
		return mv;
	}
	
	//not working
	//update info
	@RequestMapping( value="/edit/{id}", method = RequestMethod.GET)
	public ModelAndView doEdit(@PathVariable("id") int id) {
		// view Name
	   ModelAndView mv = new ModelAndView("edit");
	   mv.addObject("lists", contactRepo.findById(id).get());
		return mv;
	}
	

}