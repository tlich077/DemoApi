package controller;


import model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path= "/demo/api/products")
public class ProductController {

    @GetMapping("")
    List<Product> getAllProducts(){
       return List.of(new Product(1L,"Mec",2003,500.0,"")
       );
    }
}


