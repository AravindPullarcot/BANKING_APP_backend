package BankingMini.example.BankingMini;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/customer")
public class CustomerController {
    CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        super();
        this.customerService = customerService;
    }

    @PostMapping//posting new entry handling post request
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer){
        return new ResponseEntity<Customer>(customerService.saveCustomer(customer), HttpStatus.CREATED);
    }
    //getting infomration
    @GetMapping//invoked when a getrequest is done
    List<Customer> getAllCustomers(){
        return customerService.getAllCustomer();
    }
    //getting a specific customer by id
    @GetMapping("{id}")
    public ResponseEntity<Customer> getCustomerId(@PathVariable("id") int id){
        return new ResponseEntity<Customer>(customerService.getCustomerId(id),HttpStatus.OK);

    }








}
