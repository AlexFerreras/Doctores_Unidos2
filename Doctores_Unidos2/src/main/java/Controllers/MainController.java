package Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;


/**
 *
 * @author alexf
 */
@Controller
public class MainController {
    public ModelAndView Home(){
   
        return new ModelAndView("index");
    
    }
}
