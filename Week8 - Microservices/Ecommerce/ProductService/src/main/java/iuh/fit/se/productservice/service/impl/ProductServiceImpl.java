package iuh.fit.se.productservice.service.impl;

import iuh.fit.se.productservice.entity.Product;
import iuh.fit.se.productservice.repository.ProductRepository;
import iuh.fit.se.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
