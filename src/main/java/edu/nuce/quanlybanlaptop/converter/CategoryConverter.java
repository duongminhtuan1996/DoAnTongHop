package edu.nuce.quanlybanlaptop.converter;

import edu.nuce.quanlybanlaptop.dto.CategoryDTO;
import edu.nuce.quanlybanlaptop.dto.ProductDTO;
import edu.nuce.quanlybanlaptop.entity.Category;
import edu.nuce.quanlybanlaptop.entity.Product;
import org.springframework.stereotype.Component;

@Component
public class CategoryConverter {
    public Category toEntity(CategoryDTO categoryDTO){
        Category category = new Category();
        category.setNameType(categoryDTO.getNameType());
        category.setStatus(categoryDTO.getStatus());
        return category;
    }

    public CategoryDTO toDTO(Category category){
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setId(category.getId());
        categoryDTO.setNameType(category.getNameType());
        categoryDTO.setStatus(category.getStatus());
        return categoryDTO;
    }
}
