package org.example.Services;

import org.example.Model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class productServiceimpl {

    public List<Product> getAllProduct(){
        return Arrays.asList(
                new Product("T-shirt (Mediam)",
                        "That T-shirt is very Cool and Modern design. ",
                        "+10%",
                        "Lkr 1200.00",
                        100),
                new Product("T-shirt (large)",
                        "That T-shirt is very Cool and Modern design. ",
                        "+12%",
                        "Lkr 1500.00",
                        120)
        );
    }
}
