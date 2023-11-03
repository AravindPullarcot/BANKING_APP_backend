package BankingMini.example.BankingMini;//entity class

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Service;

@Getter
@Setter
@Entity
@Service
@Table(name="customersNeww")//created a new table
public class Customer {

    @jakarta.persistence.Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)//generating a unique ID for each value that is added in the table
    int customerId;

    @Column(name="first_name",nullable = false)
    String first_name;
    @Column(name="last_name",nullable = false)
    String last_name;
    @Column(name="account_balance",nullable = false)
    int accountBalance;
    @Column(name="account_number",nullable = false)
    int accountNumber;
    @Column(name="age",nullable = false)
    int age;
    String gender;

    @Override
    public String toString() {
        return "Customer{" +

                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }


}
