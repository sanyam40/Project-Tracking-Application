package com.ncu.finalProjectMFW.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncu.finalProjectMFW.dao.ProjectDAO;
import com.ncu.finalProjectMFW.entity.Project;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectDAO projectDAO;

	@Override
	public List<Project> fetchProjects_todo() {

		List<Project> list = projectDAO.displayProjects_todo();

		System.out.println(list);
		return list;
	}

	@Override
	public List<Project> fetchProjects_complete() {
		List<Project> list = projectDAO.displayProjects_complete();

		System.out.println(list);
		return list;

	}

	@Override
	public List<Project> fetchProjects_inprogress() {
		List<Project> list = projectDAO.displayProjects_inprogress();

		return list;
	}

	@Override
	public List<Project> fetchallprojects() {
		List<Project> list = projectDAO.displayallproducts();
		return list;
	}

	public int addProject(Project project) {
		int r = projectDAO.addProject(project);
		return r;
	}

	@Override
	public int updateProject(Project project) {
		int r = projectDAO.updateProject(project);
		return r;
	}
	
	public int deleteProject(int project_id) {
		int r=projectDAO.deleteProject(project_id);
		return r;
	}
	
	public List<Project> getProjectById(int id){
		return projectDAO.getProjectById(id);
	}
}
