package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Employee;
import com.model.Manager;

@Controller
public class HomeController {

	@RequestMapping(value = "/")
	public String homePage() {
		return "home";
	}

	@RequestMapping(value = "/employeeRegister")
	public String employeeRegisterPage(Model model) {
		model.addAttribute("employee", new Employee());
		return "employeeregister";
	}

	@RequestMapping(value = "/employeeLogin")
	public String employeeLogin(Model model) {
		model.addAttribute("employee", new Employee());
		return "employeelogin";
	}

    @RequestMapping(value="/managerRegister")
    public String managerRegisterPage(Model model)
    {
        model.addAttribute("manager",new Manager());
        return "managerregister";
    }

    @RequestMapping(value="/managerLogin")
    public String doctorLogin(Model model)
    {
        model.addAttribute("manager",new Manager());
        return "managerlogin";
    }
}
