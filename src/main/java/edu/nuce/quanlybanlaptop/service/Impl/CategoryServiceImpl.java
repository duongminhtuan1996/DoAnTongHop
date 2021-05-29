package edu.nuce.quanlybanlaptop.service.Impl;

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

    @Override
    public List<Category> searchCategory(String keyword) {
        List<Category> result = new ArrayList<>();
        List<Category> categoryList = categoryRepository.findAll();

        for(Category category : categoryList){
            if(category.getStatus().contains(keyword)){
                result.add(category);
            }
        }
        return result;
    }

    @Override
    public List<Category> listAll() {
        return categoryRepository.findAll();
    }

    @Override
    public void save(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public Category get(Long id) {
        Category result = categoryRepository.findById(id).get();
        return result;
    }

    @Override
    public void delete(long id) {
        categoryRepository.deleteById(id);
    }


}
