package com.displaydate;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication
@Controller
public class DisplayDateApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisplayDateApplication.class, args);
	}
	
	@RequestMapping( value = "/", method = RequestMethod.GET )
	public String homePage() {
		return "index.jsp";
	}
	
	@RequestMapping( value = "/date", method = RequestMethod.GET )
	public String datetemplatePage(Model model) {
		
		Date A = new Date();
		SimpleDateFormat newDateFormat = new SimpleDateFormat("EEEE, 'the' dd 'of' MMMM, YYYY");
		model.addAttribute("date", newDateFormat.format(A) );
		return "datetemplate.jsp";
	}
	
	@RequestMapping( value = "/time", method = RequestMethod.GET )
	public String timetemplatePage(Model model) {
		
		Date B = new Date();
		SimpleDateFormat newDateFormat = new SimpleDateFormat("h:mm a");
		model.addAttribute("time", newDateFormat.format(B) );
		return "timetemplate.jsp";
	}

}
