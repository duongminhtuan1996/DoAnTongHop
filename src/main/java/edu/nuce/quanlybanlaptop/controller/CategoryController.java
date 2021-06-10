package edu.nuce.quanlybanlaptop.controller;


import edu.nuce.quanlybanlaptop.dto.CategoryDTO;
import edu.nuce.quanlybanlaptop.entity.Category;
import edu.nuce.quanlybanlaptop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@ComponentScan("edu.nuce.quanlybanlaptop.service")
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService sv;

    //lay ve list category
    @GetMapping("")
    public List<CategoryDTO> getListCategory(){
        List<CategoryDTO> result = sv.listAll();
        return result;
    }

    //lay ve 1 category theo id
    @GetMapping("/{id}")
    public  CategoryDTO getCategoryById(@PathVariable(name = "id")Long id){
        CategoryDTO result = sv.get(id);
        return result;
    }

    @RequestMapping("/")
    public void addCategory(@RequestBody CategoryDTO categoryDTO){
        sv.save(categoryDTO);
        int a = 0;
    }

    //xoa 1 category theo id
    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable(name = "id")Long id){
        sv.delete(id);
    }

    /*
    @PutMapping("/update")
    public void updateCategory(@RequestParam Category category){
        List<Category> categoryList = categoryRepository.findAll();
        for(int i=0;i<categoryList.size();i++){
            if(categoryList.get(i).getId() == category.getId()){
                categoryList.set(i,category);
                break;
            }
        }
    }
    */
    /*
    @GetMapping("/search")
    public ResponseEntity<?> searchCategory(@RequestParam(name = "keyword",required = false,defaultValue = "")String status){
        return ResponseEntity.ok(sv.searchCategory(status));
    }*/

}
