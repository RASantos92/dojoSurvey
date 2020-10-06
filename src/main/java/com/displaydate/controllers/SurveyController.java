package com.displaydate.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.display.models.FormModel;

@Controller
public class SurveyController {

	@RequestMapping("/")
	public String index(Model model) {
		return "index.jsp";
	}

	@PostMapping("/survey/validate")
	public String validate(@ModelAttribute(value = "form") FormModel form, HttpSession session) {
		System.out.println(form.name + " " + form.location + " " + form.lang + " " + form.comment);
		session.setAttribute("name", form.name);
		session.setAttribute("location", form.location);
		session.setAttribute("lang", form.lang);
		session.setAttribute("comment", form.comment);
		return "redirect:/survey/subPage";
	}

	@RequestMapping("/survey/subPage")
	public String subPage(Model model, HttpSession session) {
		session.getAttribute("name");
		session.getAttribute("location");
		session.getAttribute("lang");
		session.getAttribute("comment");
		return "subPage.jsp";
	}

}
