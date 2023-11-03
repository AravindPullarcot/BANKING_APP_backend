package BankingMini.example.BankingMini.Customer2;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

//accessing different table
@Entity
@Setter
@Getter
@Table(name="customers")

public class Customer2 {


    @Id
    @Column(name="customer_id")
    int id;
    @Column(name="first_name")
    String firstName;
    @Column(name="last_name")
    String lastName;
    @Column(name="account_balance")
    int accountBalance;
    @Column(name="account_num")
    int accountNum;
    @Column(name="age")
    int age;

}
