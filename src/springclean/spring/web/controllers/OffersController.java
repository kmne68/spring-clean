package springclean.spring.web.controllers;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OffersController {
	
/*	@RequestMapping("/")
	 public String showHome(HttpSession session) {
		
		session.setAttribute("name", "Boris");
	  return "home"; // what kind of view to use
	  } */
	
	/*
	@RequestMapping("/")
	public ModelAndView showHome() {
		
		ModelAndView mv = new ModelAndView("home");
		Map<String, Object> model = mv.getModel();
		model.put("name", "<b>River</b>");
		return mv;
	} */
	
	
	/*
	@RequestMapping("/")
	public String showHome(Model model) {
		
		model.addAttribute("name", "Tiffany");
		return "home";
	} */
	
	
	@RequestMapping("/")
	public String showHome(Model model) {
			
		System.out.println("test");
		
		model.addAttribute("name", "<b>Gandalf</b>");
		return "home";
	}	
	
	
}
