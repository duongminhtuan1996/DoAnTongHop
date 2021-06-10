package edu.nuce.quanlybanlaptop.service.Impl;

import edu.nuce.quanlybanlaptop.converter.ProductConverter;
import edu.nuce.quanlybanlaptop.dto.ProductDTO;
import edu.nuce.quanlybanlaptop.entity.Category;
import edu.nuce.quanlybanlaptop.entity.Product;
import edu.nuce.quanlybanlaptop.repository.CategoryRepository;
import edu.nuce.quanlybanlaptop.repository.ProductRepository;
import edu.nuce.quanlybanlaptop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@ComponentScan("edu.nuce.quanlybanlaptop.repository")
public class ProuductServiceImpll implements ProductService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;


    private ProductConverter productConverter;

    @Override
    public List<ProductDTO> listAll() {
        List<ProductDTO> result = new ArrayList<>();
        List<Product> productList = productRepository.findAll();
        for(Product product : productList){
            result.add(productConverter.toDTO(product));
        }
        return result;
    }

    @Override
    public void save(ProductDTO productDTO) {
        Product product = productConverter.toEntity(productDTO);
        productRepository.save(product);
    }


    @Override
    public ProductDTO get(Long id) {
        Product product = productRepository.findById(id).get();
        ProductDTO result = productConverter.toDTO(product);
        return result;
    }

    @Override
    public void delete(long id) {

    }
}
