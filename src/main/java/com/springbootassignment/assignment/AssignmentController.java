package com.springbootassignment.assignment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;





@Controller
public class AssignmentController {
/**
 * Handle the /start 
 * @author Administrator
 *
 */
	@RequestMapping("/start")
	public String start () {
		return "start";
	}
	
/**
 * Handle the /start 
 * @author Administrator
 *
 */
	@RequestMapping("/")
	public String index() {
		return "start";
	}
}
