package BankingMini.example.BankingMini.Customer2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller

public class Customer2Controller {


    Customer2Service customer2Service;

    @Autowired
    public Customer2Controller(Customer2Service customer2Service) {
        this.customer2Service = customer2Service;
    }

    @GetMapping("/displayCustomers2")//c
    String displayCustomers2(ModelMap model) {// displays the table
        List<Customer2> customer2List = customer2Service.getAllCustomer();
        model.addAttribute("customers2",customer2List);
        return "Customer2TableDisplay";
    }

}
