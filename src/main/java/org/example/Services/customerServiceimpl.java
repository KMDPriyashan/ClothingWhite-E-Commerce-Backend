package org.example.Services;

import org.example.Model.Customer;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class customerServiceimpl {

    public List<Customer> getAllCustomer(){
        return Arrays.asList(
                new Customer("K.M Dulash Priyashan",
                        "Gampaha, Sri Lanka",
                        25,
                        "dulashpriyashan@gamil.com"),
                new Customer("K.M Pasan perera",
                        "Colombo, Sri Lanka",
                        34,
                        "pasanofficials@gamil.com")
        );

    }

}
