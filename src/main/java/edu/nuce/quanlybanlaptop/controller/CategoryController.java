package edu.nuce.quanlybanlaptop.controller;


import edu.nuce.quanlybanlaptop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@ComponentScan("edu.nuce.quanlybanlaptop.service")
@RestController
@RequestMapping("/category")
public class CategoryController {


    @Autowired
    private CategoryService sv;



    @GetMapping("")
    public ResponseEntity<?> getListCategory(){
        return ResponseEntity.ok(sv.listAll());
    }

    @GetMapping("/{id}")
    public  ResponseEntity<?> getCategoryById(@PathVariable(name = "id")Long id){
        return ResponseEntity.ok(sv.get(id));
    }

    @GetMapping("/search")
    public ResponseEntity<?> searchCategory(@RequestParam(name = "keyword",required = false,defaultValue = "")String status){
        return ResponseEntity.ok(sv.searchCategory(status));
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCategory(@PathVariable(name = "id")Integer id){
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

}
