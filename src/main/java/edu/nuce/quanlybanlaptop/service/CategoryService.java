package edu.nuce.quanlybanlaptop.service;

import edu.nuce.quanlybanlaptop.entity.Category;
import edu.nuce.quanlybanlaptop.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {
    public List<Category> searchCategory(String keyword);
    public List<Category> listAll();
    public void save(Category category);
    public Category get(Long id);
    public void delete(long id);
}
