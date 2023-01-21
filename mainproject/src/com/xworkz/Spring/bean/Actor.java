package com.xworkz.Spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Actor {
	private String name;
	private String lang;
	private int age;
	
	@Value("sudeepa")
	public void setName(String name) {
		this.name = name;
	}
	@Value("kannada")
	public void setLang(String lang) {
		this.lang = lang;
	}
	@Value("45")
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getLang() {
		return lang;
	}
	
	public String getName() {
		return name;
	}
	

}
