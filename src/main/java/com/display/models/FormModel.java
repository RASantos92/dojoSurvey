package com.display.models;

public class FormModel {
	public String name;
	public String location;
	public String lang;
	public String comment;

	public FormModel(String name, String location, String lang, String comment) {
		this.name = name;
		this.location = location;
		this.lang = lang;
		this.comment = comment;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

}
