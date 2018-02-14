package com.it.cloudchain.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.it.cloudchain.beans.LoginBean;

@Controller
@RequestMapping("/controller")
public class LoginCtrl {
		
	private final String USERNAME= "";
	private final String PWD= "";
	
	@GetMapping("/login")
	  public String contactForm(Model model) {
	    model.addAttribute(new LoginBean());
	    return "contact-form";
	  }
	
	 @PostMapping("/login")
	  public String submitNewContact(@ModelAttribute LoginBean loginBean, Model response) {
		 boolean flag=false;
		 
		 if(loginBean!=null && loginBean.getPassword().equals(PWD)){
			  flag=true;
		 }
		 //	    ContactDetails details = new ContactDetails();
//	    details.setFirstName(contactForm.getFirstName());
//	    details.setLastName(contactForm.getLastName());
//	    details.setPhone(contactForm.getPhone());

	    response.addAttribute("autenticazione", flag);
	    return "contact-details";
	  }
	
	public boolean login(LoginBean loginBean){
		
		try{
			if (loginBean != null && !loginBean.getPassword().isEmpty() && !loginBean.getPassword().isEmpty()
				&& loginBean.getPassword().equals(PWD) && loginBean.getPassword().equals(USERNAME)) {
				return true;
			} else {
				return false;
			}
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
		
}
