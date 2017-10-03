package com.projectT.projectTingeso.model;


import javax.persistence.*;


@Entity
@Table(name="student")
public class Student {

    public Student(String name, String rut, String email, String career) {
		super();
		this.name = name;
		this.rut = rut;
		this.email = email;
		this.career = career;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentId;

    public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}

	private String name;
    
    private String rut;
    
    private String email;
    
    private String career;
}
