package com.flight_reservation.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.flight_reservation.Entities.User;
import com.flight_reservation.Repositories.UserRepository;

@Controller
public class UserController {
	@Autowired
	private UserRepository userRepo;
	
	@RequestMapping("/signup")
	public String signup() {
		return "login/signup";
	}
	@RequestMapping("/login")
	public String login() {
		return "login/login";
	}
	
	@RequestMapping("/signupSuccess")
	public String signupSuccess(@ModelAttribute User user, ModelMap modelMap) {
		
		userRepo.save(user);
		modelMap.addAttribute("msg","Sign-Up Successful.");
		return "login/signup";
	}
	
	@RequestMapping("/verified")
	public String verified(@RequestParam("email") String email, @RequestParam("password") String password, ModelMap modelMap) {
		
		User user = userRepo.findByEmail(email);
		
		if (user != null) {
			
			if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
				
				return "searchFlightPage";
				
			}else {
				modelMap.addAttribute("msg","Invalid email and password.");
				
				return "login/login";
			}
		}else {
			modelMap.addAttribute("msg","You Didn't Type Anything. Enter Valid email and password");
			
			return "login/login";
		}
	}
}















