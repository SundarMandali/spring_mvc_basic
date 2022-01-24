package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {

	@RequestMapping(path="/home",method=RequestMethod.POST)
	public String home(Model model)
	{
		System.out.println("this is home controller");
		model.addAttribute("name","Sundar");
		model.addAttribute("id",12);
		
		List<String> friends=new ArrayList<String>();
		friends.add("Rahul");
		friends.add("Ravi");
		friends.add("Raju");
		
		model.addAttribute("f",friends);
		return "index";
	}
	
	@RequestMapping("/about")
	public String about()
	{
		System.out.println("This is about controller");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help()
	{
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("name","Mandali Sundar");
		modelAndView.addObject("rollno",23);
		modelAndView.addObject("branch","CSE");
		modelAndView.setViewName("help");
		
		
		return modelAndView;
		
	}
	
	//FOR JSTL
	@RequestMapping("/demo")
	public ModelAndView demo()
	{
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.addObject("name","Jai");
	modelAndView.addObject("branch","CSE");
	List<Integer> marks=new ArrayList<Integer>();
	marks.add(10);
	marks.add(20);
	marks.add(30);
	modelAndView.addObject("marks",marks);
	modelAndView.setViewName("demo");
	return modelAndView;
	}
}
