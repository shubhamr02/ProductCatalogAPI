package com.ecomm.ProductCatalog.Service;

import com.ecomm.ProductCatalog.Model.ProductDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ProductService {


    public List<ProductDTO> findAllProducts();

    public Optional<ProductDTO> findProductById(String id);

    public List<ProductDTO> saveProduct(ProductDTO product);
}
