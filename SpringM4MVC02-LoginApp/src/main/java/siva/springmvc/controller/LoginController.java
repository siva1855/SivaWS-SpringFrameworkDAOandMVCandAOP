package siva.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import siva.springmvc.dao.LoginDAO;

@Controller
public class LoginController {

	@Autowired
	private LoginDAO loginDAO;

	//@RequestMapping(value = "/login", method = RequestMethod.GET)---old
	@GetMapping(value="/LoginApp")
	public String getLoginPage() {
		return "Login";
	}

	//@RequestMapping(value = "/check", method = RequestMethod.POST)---old
	@PostMapping(value="/check")
	public String checkUserLogin(@RequestParam String username, @RequestParam String password) {
		boolean flag = loginDAO.checkUser(username, password);
		if (flag == true) {
			return "Success";
		} else {
			return "Failure";
		}
	}
}
