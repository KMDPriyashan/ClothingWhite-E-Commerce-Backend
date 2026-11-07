package org.example.Controller;

import org.example.Model.Customer;
import org.example.Services.customerServiceimpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class customerController {

    @GetMapping("all-customers")
    List<Customer> getAllCustomer(){
        customerServiceimpl service = new customerServiceimpl();
        List<Customer> allCustomer = service.getAllCustomer();
        return allCustomer;
    }

}
