package com.ecomm.ProductCatalog.Controller;

import com.ecomm.ProductCatalog.Model.ProductDTO;
import com.ecomm.ProductCatalog.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(maxAge = 3600)
@RestController
public class ProductController {

    @Autowired
    public ProductService productService;

    @CrossOrigin(origins = "http://localhost:4200",allowedHeaders = "Requestor-Type")
    @RequestMapping(value = "/api/products", method = RequestMethod.GET)
    public List<ProductDTO> getAllProducts() {

        return productService.findAllProducts();
    }

    @GetMapping(value = "/api/product/{product_id}")
    public Optional<ProductDTO> getProductById(@RequestParam String product_id) {

        return productService.findProductById(product_id);
    }

    @PostMapping("/api/add")
    public String submitForm(@RequestBody ProductDTO product) {

        System.out.println(product.product_name);
        productService.saveProduct(product);
        return "product added successfully";
    }
}
