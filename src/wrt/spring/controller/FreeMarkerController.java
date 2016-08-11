package wrt.spring.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import wrt.spring.model.User;

@Controller  
@RequestMapping("/home") 
public class FreeMarkerController extends BaseController {

	  @RequestMapping("/index")  
	    public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {  
	  
		  ModelAndView mv = new ModelAndView("index");  
	        mv.addObject("title", "Spring MVC And Freemarker");  
	        mv.addObject("content", " Hello world ， test my first spring mvc ! ");  
	        return mv;  
	    }  
}
