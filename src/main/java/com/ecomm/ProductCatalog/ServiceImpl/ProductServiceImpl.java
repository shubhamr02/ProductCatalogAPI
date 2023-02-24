package com.ecomm.ProductCatalog.ServiceImpl;

import com.ecomm.ProductCatalog.Model.ProductDTO;
import com.ecomm.ProductCatalog.Repository.ProductRepository;
import com.ecomm.ProductCatalog.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    public ProductRepository productRepository;
    @Override
    public List<ProductDTO> findAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Optional<ProductDTO> findProductById(String id) {
        return productRepository.findOne(id,ProductDTO.class);
    }

    @Override
    public List<ProductDTO> saveProduct(ProductDTO product) {
        productRepository.save(product);
        return productRepository.findAll();
    }
}
