package wrt.spring.utiles;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class TestControllerAdvice {

	 @ExceptionHandler
	    public ModelAndView exceptionHandler(Exception ex){
	        ModelAndView mv = new ModelAndView("error");
	        mv.addObject("exception", ex);
	        System.out.println("TestControllerAdvice in testControllerAdvice");
	        return mv;
	    }
}
