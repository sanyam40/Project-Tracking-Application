package com.ncu.finalProjectMFW.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ncu.finalProjectMFW.entity.User;
import com.ncu.finalProjectMFW.service.UserService;

@Controller
public class LoginController {

	/* FOR USING THE USERSERVICE */
	@Autowired
	private UserService userService;

	/* CREATING A OBJECT OF TYPE USER */
	@ModelAttribute("user")
	public User getuser() {
		return new User();
	}

	/* Display the login page/home */
	@RequestMapping("/")
	public String login() {
		return "login";
	}

	/* FOR CHECKING IF THE LOGIN DETAILS ARE CORRECT OR NOT */
	@RequestMapping("/login")
	public String login(@Valid @ModelAttribute("user") User user, BindingResult bindingResult,
			HttpServletRequest request,Model model) {

		if (bindingResult.hasErrors()) {
			return "login";
		} else {

			List<User> list = userService.userloginn(user.getEmail(), user.getPassword());
			String userString = "";
			String userIdString="";

			for (User a : list) {
				userString = a.getUser_type();	
			}
			
			for(User b:list) {
				userIdString=b.getUser_id();
			}
			
			System.out.println(userIdString);

			if (list.isEmpty()) {
				return "redirect:/";
			} else {
				if (userString.equals("admin")) {

					HttpSession session = request.getSession();
					session.setAttribute("type", "admin");

					return "redirect:/admin";
				} else {

					HttpSession session = request.getSession();
					session.setAttribute("type", "user");
					
					model.addAttribute("userid",userIdString);

					return "userpanel";
				}
			}

		}
	}

	/* This is the Handler Method for terminating the session */
	@RequestMapping(value = "/logout")
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		session.invalidate();
		return "login";
	}
}