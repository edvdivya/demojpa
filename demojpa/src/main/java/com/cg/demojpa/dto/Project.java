package com.cg.demojpa.dto;
import javax.persistence.*;
@Entity
@Table(name="jpa_project")
public class Project {

	@Id
	@Column(name="proj_Id")
	private Integer projId;
	@Column(name="proj_Name")
	private String projName;
	@Column(name="proj_Cost")
	private Double projCost;
	public Project() {
		
	}
	public Project(Integer projId, String projName, Double projCost) {
		super();
		this.projId = projId;
		this.projName = projName;
		this.projCost = projCost;
	}
	public Integer getProjId() {
		return projId;
	}
	public void setProjId(Integer projId) {
		this.projId = projId;
	}
	public String getProjName() {
		return projName;
	}
	public void setProjName(String projName) {
		this.projName = projName;
	}
	public Double getProjCost() {
		return projCost;
	}
	public void setProjCost(Double projCost) {
		this.projCost = projCost;
	}
	@Override
	public String toString() {
		return "Project [projId=" + projId + ", projName=" + projName + ", projCost=" + projCost + "]";
	}
	
}
