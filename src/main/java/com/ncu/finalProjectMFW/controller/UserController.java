package com.ncu.finalProjectMFW.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ncu.finalProjectMFW.entity.Project;
import com.ncu.finalProjectMFW.entity.User;
import com.ncu.finalProjectMFW.service.ProjectService;
import com.ncu.finalProjectMFW.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ProjectService projectService;
	
	
	@ModelAttribute("user")
	public User getUser() {
		return new User();
	}
	
	@RequestMapping("/user-panel")
	public String user() {
		return "userpanel";
	}
	
	@RequestMapping("/user-registration")
	public String user_registration() {
		return "userregistration";
	}
	
	@RequestMapping("/process")
	public String user_insert(@ModelAttribute("user")User user) {
		System.out.println(user);
		
		userService.insertuser(user);
		
		return "redirect:/";
	}
	
	@RequestMapping("/userupdate")
	public String user_update(@RequestParam("user_id")int user_id,Model model) {
		
		System.out.println(user_id);
		
		model.addAttribute("userid",user_id);
		
		return "userupdate";
	}
	
	@RequestMapping("/processUpdate")
	public String update(@ModelAttribute("user")User user) {
		
		System.out.println(user);
		
		userService.updateuser(user);
		
		return "userpanel";
	}
	
	@RequestMapping("/show-projects")
	public String products(Model model) {
		
		List<Project>list=projectService.getProjectById(2);

		model.addAttribute("projects", list);
		
		return "userProjects";
	}
	
	

}
