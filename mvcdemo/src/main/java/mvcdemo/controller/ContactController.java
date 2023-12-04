package mvcdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import mvcdemo.model.User;
import mvcdemo.service.UserService;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ContactController {
	@Autowired
	private UserService userService;
	

	@RequestMapping("/contact")
	public String home(Model model) {
		return "contact";
	}

//	@RequestMapping(path="/processform", method=RequestMethod.POST)
//	public String formHandler(Model model,@RequestParam("email") String email, @RequestParam("name") String name, @RequestParam("password") String password) {
//		System.out.println("email " + email + "name " + name + " password " + password);
//		model.addAttribute("name",name);
//		model.addAttribute("email",email);
//		model.addAttribute("password",password);
//		return "success";
//	}
	
	@RequestMapping(path="/processform", method=RequestMethod.POST)
	public String handleForm(@ModelAttribute("user") User user, Model model) {
		System.out.println("user"+ user);
		this.userService.createUser(user);
		return "success";
	}
}
