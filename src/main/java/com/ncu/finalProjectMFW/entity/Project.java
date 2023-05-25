package com.ncu.finalProjectMFW.entity;

public class Project {

	private String name;
	private String description;
	private String status;
	private String priority;
	private String level;
	private int candidate;
	private int project_id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public int getCandidate() {
		return candidate;
	}

	public void setCandidate(int candidate) {
		this.candidate = candidate;
	}

	public int getProject_id() {
		return project_id;
	}

	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}

	public Project(String name, String description, String status, String priority, String level, int candidate,
			int project_id) {
		super();
		this.name = name;
		this.description = description;
		this.status = status;
		this.priority = priority;
		this.level = level;
		this.candidate = candidate;
		this.project_id = project_id;
	}

	@Override
	public String toString() {
		return "Project [name=" + name + ", description=" + description + ", status=" + status + ", priority="
				+ priority + ", level=" + level + ", candidate=" + candidate + ", project_id=" + project_id + "]";
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

}
