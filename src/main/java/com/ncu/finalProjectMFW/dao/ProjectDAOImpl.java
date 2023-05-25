package com.ncu.finalProjectMFW.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ncu.finalProjectMFW.entity.Project;

@Repository
public class ProjectDAOImpl implements ProjectDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	/* It will fetch all the Projects in to-do state */
	public List<Project> displayProjects_todo() {

		String queryString = "select * from Project where status='TO-DO'";
		List<Project> list = new ArrayList<>();
		list = jdbcTemplate.query(queryString, new BeanPropertyRowMapper<Project>(Project.class));
		return list;
	}

	@Override
	/* It will fetch all the Projects in Complete state */
	public List<Project> displayProjects_complete() {

		String queryString = "select * from Project where status='COMPLETE'";
		List<Project> list = new ArrayList<>();
		list = jdbcTemplate.query(queryString, new BeanPropertyRowMapper<Project>(Project.class));
		return list;

	}

	@Override
	/* It will fetch all the Projects in in-progress state */
	public List<Project> displayProjects_inprogress() {

		String queryString = "select * from Project where status='INPROGRESS'";
		List<Project> list = new ArrayList<>();
		list = jdbcTemplate.query(queryString, new BeanPropertyRowMapper<Project>(Project.class));
		return list;

	}

	@Override
	/* It will fetch all the Projects */
	public List<Project> displayallproducts() {
		String queryString = "select * from Project";
		List<Project> list = new ArrayList<>();
		list = jdbcTemplate.query(queryString, new BeanPropertyRowMapper<Project>(Project.class));
		return list;
	}

	@Override
	/* It will Add New Project */
	public int addProject(Project project) {
		String aString = "insert into Project(name,description,status,priority,level,candidate)values(?,?,?,?,?,?)";
		Object[] arr = { project.getName(), project.getDescription(), "TO-DO", project.getPriority(),
				project.getLevel(), project.getCandidate() };
		int result = jdbcTemplate.update(aString, arr);
		return result;
	}

	/* It will Update Project */
	public int updateProject(Project project) {
		String aString = "update Project set name=?,description=?,status=?,priority=?,level=?,candidate=? where project_id=?";
		Object[] arr = { project.getName(), project.getDescription(), project.getStatus(), project.getPriority(),
				project.getLevel(), project.getCandidate(), project.getProject_id() };
		int r = jdbcTemplate.update(aString, arr);
		return r;
	}
	
	public int deleteProject(int project_id) {
		String aString="delete from Project where project_id=?";
		int r=jdbcTemplate.update(aString,project_id);
		return r;
	}

	@Override
	public List<Project> getProjectById(int id) {
		String aString="select * from project NATURAL JOIN user where user_id=1";
		List<Project> list = new ArrayList<>();
		list=jdbcTemplate.query(aString,new BeanPropertyRowMapper<Project>(Project.class));
		return list;
	}

}
