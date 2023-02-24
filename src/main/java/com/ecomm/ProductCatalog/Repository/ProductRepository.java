package com.ecomm.ProductCatalog.Repository;

import com.ecomm.ProductCatalog.Model.ProductDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends MongoRepository<ProductDTO,String> {



}
