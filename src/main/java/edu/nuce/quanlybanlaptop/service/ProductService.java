package edu.nuce.quanlybanlaptop.service;

import edu.nuce.quanlybanlaptop.dto.ProductDTO;
import edu.nuce.quanlybanlaptop.entity.Category;
import edu.nuce.quanlybanlaptop.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    public List<ProductDTO> listAll();
    public void save(ProductDTO product);
    public ProductDTO get(Long id);
    public void delete(long id);
}
