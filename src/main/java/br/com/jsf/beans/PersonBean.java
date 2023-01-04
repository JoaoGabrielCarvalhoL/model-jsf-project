package br.com.jsf.beans;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "pessoaBean")
public class PersonBean {

	private String name;
	private String lastName;

	public PersonBean() {

	}

	public PersonBean(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}
