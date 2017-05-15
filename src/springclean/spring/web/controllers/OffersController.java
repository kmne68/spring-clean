package springclean.spring.web.controllers;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import springclean.spring.web.dao.Offer;
import springclean.spring.web.service.OffersService;

@Controller
public class OffersController {
	
	private OffersService offersService;
	
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
	
	@Autowired
	public void setOffersService(OffersService offersService) {
		this.offersService = offersService;
	}

	@RequestMapping("/offers")
	public String showOffers(Model model) {
			
		List<Offer> offers = offersService.getCurrent();
		
		model.addAttribute("offers", offers);
		return "offers";
	}	
	
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String showTest(Model model, @RequestParam("id") String id) {

		System.out.println("ID is: " + id);
		return "home";
	}	
	
	
	@RequestMapping("/createoffer")
	public String createOffer() {
			
		return "createoffer";
	}	
	
	
	@RequestMapping("/docreate")
	public String doCreate() {
		
		return "offercreated";
	}
	
	
}
