package com.ncu.finalProjectMFW.service;

import java.util.List;

import com.ncu.finalProjectMFW.entity.Project;

public interface ProjectService {

	public List<Project> fetchProjects_todo();

	public List<Project> fetchProjects_complete();

	public List<Project> fetchProjects_inprogress();

	public List<Project> fetchallprojects();

	public int addProject(Project project);

	public int updateProject(Project project);
	
	public int deleteProject(int project_id);
	
	public List<Project> getProjectById(int id);

}
