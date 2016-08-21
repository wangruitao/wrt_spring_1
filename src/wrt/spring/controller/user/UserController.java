package wrt.spring.controller.user;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import wrt.spring.model.User;

@Controller  
@RequestMapping("/user") 
public class UserController {

	  @RequestMapping("/index")  
	    public String index(ModelMap model,HttpServletRequest request, HttpServletResponse response) {  
		  
		  List<User> users = new ArrayList<User>();
		  
		  User u = new User();
		  u.setUsername("王瑞涛");
		  u.setPassword("wrt");
		  u.setAge(20);
		  users.add(u);
		  User mu = new User();
		  mu.setUsername("马婕");
		  mu.setPassword("mj");
		  mu.setAge(21);
		  users.add(mu);
		  model.put("users", users);
		  model.put("title", "用户列表");
		  return "user/index";
	    }  
	  
	  @RequestMapping("/add")
	  public String add(ModelMap model) {
		  User u = new User();
		  model.put("u", u);
		  return "user/add";
	  }
	  @RequestMapping("/save")
	  public String save(ModelMap model, @Valid @ModelAttribute("u") User u,  BindingResult result) {
		  if(result.hasErrors()) {
			  return "user/add";
		  }
		  
		  return "redirect:/user/index";
	  }
}
