package BankingMini.example.BankingMini.Customer2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller

public class Customer2Controller {

    @Autowired
    Customer2repository customer2repository;

    @GetMapping("/displayCustomers2")//c
    String displayCustomers(ModelMap model) {// displays the table
        List<Customer2> customer2List = customer2repository.findAll();
        model.addAttribute("customers",customer2List);
        return "TableDisplay";
    }

}
