package edu.nuce.quanlybanlaptop.converter;

import edu.nuce.quanlybanlaptop.dto.ProductDTO;
import edu.nuce.quanlybanlaptop.entity.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductConverter {
    public Product toEntity(ProductDTO productDTO){
        Product product = new Product();
        //product.setId(productDTO.getId());
        product.setNameProduct(productDTO.getNameProduct());
        product.setDescription(productDTO.getDescription());
        product.setPrice(productDTO.getPrice());
        product.setQuantity(productDTO.getQuantity());
        product.setStatus(productDTO.getStatus());
        //product.setCategoryId(productDTO.getCategoryId());
        return product;
    }

    public ProductDTO toDTO(Product product){
        ProductDTO productDTO = new ProductDTO();
       // productDTO.setId(product.getId());
        productDTO.setNameProduct(product.getNameProduct());
        productDTO.setDescription(product.getDescription());
        productDTO.setPrice(product.getPrice());
        productDTO.setQuantity(product.getQuantity());
        productDTO.setStatus(product.getStatus());
       // productDTO.setCategoryId(product.getCategoryId());
        return productDTO;
    }
}
