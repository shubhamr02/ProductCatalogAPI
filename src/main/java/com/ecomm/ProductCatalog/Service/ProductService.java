package com.ecomm.ProductCatalog.Service;

import com.ecomm.ProductCatalog.Model.ProductDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {


    public List<ProductDTO> findAllProducts();
}
