package com.pack.sooriya;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {
@RequestMapping("/showForm")
public String showForm()
{
	return "showForm";
}
	
@RequestMapping("/processForm")
public String processForm(HttpServletRequest request,Model model)
{
	String name=request.getParameter("studentName");
	name = name.toUpperCase();
	String result = "Ms. " +name;
	model.addAttribute("name",result);
	return "confirmData";
}
}
