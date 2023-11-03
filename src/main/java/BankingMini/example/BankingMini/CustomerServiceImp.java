package BankingMini.example.BankingMini;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImp implements CustomerService {

    CustomerRepository customerRepository;

    public CustomerServiceImp(CustomerRepository customerRepository) {
        super();
        this.customerRepository = customerRepository;
    }//This is the constructor for the CustomerServiceImp class. It takes a CustomerRepository as a parameter and assigns it to the class field. This is known as constructor-based dependency injection, allowing Spring to inject the required repository when creating instances of this service class.


    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();//retrives list of customer
    }

    @Override
    public Customer getCustomerId(int id) {
        Optional<Customer> customer = customerRepository.findById(id);
        if (customer.isPresent()) {
            return customer.get();
        } else {
            throw new CustomException("Customer", "Id", id);
        }
    }
}
