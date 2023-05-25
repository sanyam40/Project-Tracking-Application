package com.ncu.finalProjectMFW.dao;

import java.util.List;

import com.ncu.finalProjectMFW.entity.Project;

public interface ProjectDAO {

	public List<Project> displayProjects_todo();

	public List<Project> displayProjects_complete();

	public List<Project> displayProjects_inprogress();

	public List<Project> displayallproducts();

	public int addProject(Project project);

	public int updateProject(Project project);
	
	public int deleteProject(int project_id);
	
	public List<Project> getProjectById(int id);
}
