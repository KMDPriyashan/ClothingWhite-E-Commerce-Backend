package org.example.Controller;

import org.example.Model.Product;
import org.example.Services.productServiceimpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class productController {

    @GetMapping("all-products")
    List<Product> getAllProduct(){
        productServiceimpl service = new productServiceimpl();
        List<Product> allProduct = service.getAllProduct();
        return allProduct;
    }
}
