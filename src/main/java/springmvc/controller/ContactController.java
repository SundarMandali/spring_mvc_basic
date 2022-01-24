package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	
	//Here we used @ModelAttribute for binding the common data that needed to be used in any JSP page.
	@ModelAttribute
	public void commonDataForModel(Model m)
	{
		m.addAttribute("headering","Sundar Coding Zone");
		m.addAttribute("description","Learning Spring Framework");
	}
	
	
	@RequestMapping("/contact")
	public String showForm()
	{
		return "contact";
	}
	
	/*
	 * OLD METHOD OF handling requests using HttpServletRequest {refer to servlets to understand this concept}
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleForm(HttpServletRequest request)
	{
		String email=request.getParameter("email");
		System.out.println(email);
		return "";	
	}*/
	
	
	//Handling requests by getting the parameters one by one  
	/*
	 * @RequestMapping(path="/processform",method=RequestMethod.POST) public String
	 * handleForm(@RequestParam("name") String name,
	 * 
	 * @RequestParam(name="email",required=false) String email,
	 * 
	 * @RequestParam("password")String password ,Model model) {
	 * System.out.println("Name is "+name); System.out.println("Email is "+email);
	 * System.out.println("Password is "+password);
	 * 
	 * //process model.addAttribute("name",name); model.addAttribute("email",email);
	 * model.addAttribute("password",password);
	 * 
	 * return "contactOutput"; }
	 */
	
	//Complex way of handling request by getting the parameters one by one and setting the User entity
	/*
	 * @RequestMapping(path="/processform",method=RequestMethod.POST) public String
	 * handleForm(@RequestParam("name") String name,
	 * 
	 * @RequestParam(name="email",required=false) String email,
	 * 
	 * @RequestParam("password")String password ,Model model) { User user=new
	 * User(); user.setName(name); user.setEmail(email); user.setPassword(password);
	 * model.addAttribute("user",user);
	 * 
	 * return "contactOutput"; }
	 */
	
	
	/*
	  Here we used @ModelAttribute such that it reduces the code that needed to be written Actually where
	  It itself gets maps the incoming parameters to the Entity and also binds the entity with Model object
	*/
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model)
	{
		//We are Redirecting here if the name of user is blank or empty
		if(user.getName().isBlank())
		{
			return"redirect:/contact";
		}
		
		int createUser = this.userService.createUser(user);
		model.addAttribute("message"," User created succefully with id:"+createUser);
		return "contactOutput";
	}
}
