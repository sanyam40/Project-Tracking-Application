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
public class AdminController {

	@Autowired
	private ProjectService projectService;

	@Autowired
	private UserService userService;

	@ModelAttribute("project")
	public Project project() {
		return new Project();
	}

	/* Display the Admin Portal */
	@RequestMapping(value = "/admin")
	public String admin_portal(Model model) {

		List<Project> list_todo = projectService.fetchProjects_todo();
		List<Project> list_complete = projectService.fetchProjects_complete();
		List<Project> list_inprogress = projectService.fetchProjects_inprogress();

		model.addAttribute("list_todo", list_todo);
		model.addAttribute("list_complete", list_complete);
		model.addAttribute("list_inprogress", list_inprogress);

		return "admin";
	}

	/* Display the Add Project Page */
	@RequestMapping(value = "/add-task")
	public String add_task(Model model) {

		List<User> list = userService.getUserlist();

		model.addAttribute("user", list);

		return "add_task";
	}

	/* Handler Method For Add Project Page */
	@RequestMapping(value = "/add-project")
	public String addproject(@ModelAttribute("project") Project project, Model model) {

		projectService.addProject(project);

		return "redirect:/admin";
	}

	/* Display The List Of All The Project For update/delete */
	@RequestMapping(value = "/update-task")
	public String update_task(Model model) {

		List<Project> list = projectService.fetchallprojects();

		model.addAttribute("list", list);

		return "display-projects";
	}

	/* Display The Update Form for the Project */
	@RequestMapping(value = "/update-form")
	public String update_form(@RequestParam("project_id") int id, Model model) {
		List<User> list = userService.getUserlist();

		model.addAttribute("id", id);

		model.addAttribute("user", list);

		return "update_form";
	}

	/* Handler Method For Update Form */
	@RequestMapping(value = "/updatee")
	public String updatee(@ModelAttribute("project") Project project) {
		projectService.updateProject(project);

		return "redirect:/admin";
	}
	
	/* For Deleting the Project */
	@RequestMapping(value = "/delete")
	public String delete(@RequestParam("project_id") int id) {
		
		projectService.deleteProject(id);

		return "redirect:/update-task";
	}
	
}
