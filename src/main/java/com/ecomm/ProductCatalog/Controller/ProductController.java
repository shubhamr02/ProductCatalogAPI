package com.ecomm.ProductCatalog.Controller;

import com.ecomm.ProductCatalog.Model.ProductDTO;
import com.ecomm.ProductCatalog.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(maxAge = 3600)
@RestController
public class ProductController {

    @Autowired
    public ProductService productService;

    @CrossOrigin(origins = "http://localhost:4200",allowedHeaders = "Requestor-Type")
    @RequestMapping(value = "/api/products", method = RequestMethod.GET)
    public List<ProductDTO> getAllUsers() {

        return productService.findAllProducts();
    }
}
