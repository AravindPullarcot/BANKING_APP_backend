package BankingMini.example.BankingMini.html;

import BankingMini.example.BankingMini.Customer1;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WelcomePageController {

    //Customer customer1;// created this just to access the toString method

//    @Autowired
//    public WelcomePageController(Customer customer) {
//        this.customer1 = customer;
//    }

    @GetMapping("/api/register")//returns the html registerpage
    public String RegisterForm(){
        return "RegisterForm";
    }
//
    @PostMapping("/api/register/welcomepage")//activates the url at the form action=method at the register page
    public String userWelcome(@ModelAttribute Customer1 customer1, ModelMap model){
        model.addAttribute("first_name", customer1.getFirst_name());// The attribute name is the name parameter taken as in the thymeleaf html file
        model.addAttribute("last_name", customer1.getLast_name());
        System.out.println(customer1.toString());//this will print the logs to the command line
        return "WelcomePage";//passes the model values firstname and lastname in the welcome page and returns it
    }

}
