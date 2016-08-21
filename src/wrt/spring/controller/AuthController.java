package wrt.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthController extends BaseController {

	@RequestMapping(value="/login")
	public String login(ModelMap model) {
		return "login";
	}
}
