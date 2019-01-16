package com.kg.springxml;

import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class WebController {
	@GetMapping
	   public String volts(ModelMap mop)
	   {
		   ModelMap a=mop.addAttribute("id");
		   System.out.println(a);
	System.out.println("kkkkkkkkkk");
	
		   return "index";
	   }
	   @PostMapping
	   public String volts1()
	   {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationcontext.xml");
		Dummy dao = (Dummy) ctx.getBean("edao");
		int sat = dao.saveDetails(new College(29111, "JAGGI", "ECE", 23));
		System.out.println(sat);
	return "done";
	   }
	  	}
	
