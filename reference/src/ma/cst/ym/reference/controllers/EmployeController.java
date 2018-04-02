package ma.cst.ym.reference.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ma.cst.ym.reference.dao.Employe;
import ma.cst.ym.reference.services.EmployeService;

@Controller
public class EmployeController {

	private EmployeService employeService;

	@Autowired
	public void setEmployeService(EmployeService employeService) {
		this.employeService = employeService;
	}

	@RequestMapping("/employes")
	public String showEmploye(Model model) {

		List<Employe> employes = employeService.getCurrent();
		model.addAttribute("employes", employes);

		return ("employes");
	}

	@RequestMapping("/createemploye")
	public String createEmploye(Model model) {

		model.addAttribute("employe", new Employe());

		return ("createemploye");
	}

	@RequestMapping(value = "/docreate", method = RequestMethod.POST)
	public String doCreate(Model model, @Valid Employe employe, BindingResult result) {

		if (result.hasErrors()) {
			/*
			 * System.out.println("Form has errors"); List<ObjectError> errors =
			 * result.getAllErrors();
			 * 
			 * for (ObjectError error : errors) {
			 * System.out.println(error.getDefaultMessage());
			 * 
			 * }
			 */

			return ("createemploye");

		}

		employeService.create(employe);
		
		System.out.println(employe);
		return ("employecreated");

	}

}

// model.addAttribute("name", "nadine");
