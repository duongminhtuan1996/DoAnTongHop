package edu.nuce.quanlybanlaptop.service;

import edu.nuce.quanlybanlaptop.dto.CategoryDTO;
import edu.nuce.quanlybanlaptop.entity.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {
    //public List<Category> searchCategory(String keyword);
    public List<CategoryDTO> listAll();
    public void save(CategoryDTO categoryDTO);
    public CategoryDTO get(Long id);
    public void delete(long id);
}
