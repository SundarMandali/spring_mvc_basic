package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {

	/* Redirecting using prefix where we directly return relative URL in handler method 
	 
	@RequestMapping("/one")
	public String one()
	{
		System.out.println("This is one handler");
		return "redirect:/second";//we can use any url here like www.google.com 
	}
	
	*/
	
	//Redirecting using RedirectView
	@RequestMapping("/one")
	public RedirectView one()
	{
	System.out.println("This is one handler");
	RedirectView redirectView=new RedirectView();
	redirectView.setUrl("second");//we can use any url here like www.google.com 
	return redirectView;
	}
	
	@RequestMapping("/second")
	public String second()
	{
		System.out.println("This is second handler");
		return "contact";
	}
}
