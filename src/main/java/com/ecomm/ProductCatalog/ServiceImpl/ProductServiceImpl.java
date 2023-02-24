package com.ecomm.ProductCatalog.ServiceImpl;

import com.ecomm.ProductCatalog.Model.ProductDTO;
import com.ecomm.ProductCatalog.Repository.ProductRepository;
import com.ecomm.ProductCatalog.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    public ProductRepository productRepository;
    @Override
    public List<ProductDTO> findAllProducts() {
        return productRepository.findAll();
    }
}
