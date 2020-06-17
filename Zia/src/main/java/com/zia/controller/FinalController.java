package com.zia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/final")
public class FinalController {
	
	@RequestMapping("/server")
	public ModelAndView finalD() {
		ModelAndView mv = new ModelAndView("final");
		return mv;
	}
}
