package com.kosign.lmsapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin")
public class Lms_adm_031 {
	
	@RequestMapping(value="/lms_adm_031", method=RequestMethod.GET)
	public String showLms_adm_031(){
		return "lms_adm_031";
	}
	

}
