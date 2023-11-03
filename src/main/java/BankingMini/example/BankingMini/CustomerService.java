package BankingMini.example.BankingMini;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {

    Customer saveCustomer(Customer customer);
    List<Customer> getAllCustomer();
    Customer getCustomerId(int id);

}
