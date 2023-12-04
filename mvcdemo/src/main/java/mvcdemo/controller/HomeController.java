package mvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("name","Mrunali");
		List<String> friends = new ArrayList<String>();
		friends.add("Mrunali");
		friends.add("Darshan");
		friends.add("shruti");
		
		model.addAttribute("f",friends);
		System.out.println("f"+ friends);
		return "home";
	}
	
	@RequestMapping("/about")
	public ModelAndView about() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("name","Mrunali");
		mav.addObject("rollNumber",1223); 
		List<Integer> list =new ArrayList();
		list.add(12);
		list.add(13);
		mav.addObject("list",list);
		mav.setViewName("about");
		return mav;
	}
}
