package edu.nuce.quanlybanlaptop.service.Impl;

import edu.nuce.quanlybanlaptop.converter.CategoryConverter;
import edu.nuce.quanlybanlaptop.dto.CategoryDTO;
import edu.nuce.quanlybanlaptop.entity.Category;
import edu.nuce.quanlybanlaptop.repository.CategoryRepository;
import edu.nuce.quanlybanlaptop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Primary
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    CategoryConverter categoryConverter = new CategoryConverter();

    //lay ve list category
    @Override
    public List<CategoryDTO> listAll() {
        List<CategoryDTO> result = new ArrayList<>();
        List<Category> listCategory =  categoryRepository.findAll();
        for (Category category: listCategory){
            result.add(categoryConverter.toDTO(category));
        }
        return  result;
    }

    //lay 1 category theo id
    @Override
    public CategoryDTO get(Long id) {
        Category category = categoryRepository.findById(id).get();
        CategoryDTO result = categoryConverter.toDTO(category);
        return result;
    }

    //them 1 category
    @Override
    public void save(CategoryDTO categoryDTO) {
        Category category = categoryConverter.toEntity(categoryDTO);
        categoryRepository.save(category);
    }



    //xoa 1 category theo id
    @Override
    public void delete(long id) {
        categoryRepository.deleteById(id);
    }

    /*
    @Override
    public List<Category> searchCategory(int keyword) {
        List<Category> result = new ArrayList<>();
        List<Category> categoryList = categoryRepository.findAll();

        for(Category category : categoryList){
            if(category.getStatus().contains(keyword)){
                result.add(category);
            }
        }
        return result;
    }*/

}
