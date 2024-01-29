package com.example.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Skills {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String description;
	private int module;
	private double fee;
	
	@ManyToMany(mappedBy="skills",fetch = FetchType.LAZY)
	@JsonIgnoreProperties("skills")
	private List<Student> students;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public int getModule() {
		return module;
	}

	public void setModule(int module) {
		this.module = module;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Skills() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Skills(int id, String name, String description, int module, double fee, List<Student> students) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.module = module;
		this.fee = fee;
		this.students = students;
	}

	@Override
	public String toString() {
		return "Skills [id=" + id + ", name=" + name + ", description=" + description + ", module=" + module + ", fee="
				+ fee + ", students=" + students + "]";
	}

	
}
