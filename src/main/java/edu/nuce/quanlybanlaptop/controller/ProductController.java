package edu.nuce.quanlybanlaptop.controller;

import edu.nuce.quanlybanlaptop.dto.ProductDTO;
import edu.nuce.quanlybanlaptop.entity.Product;
import edu.nuce.quanlybanlaptop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@ComponentScan("edu.nuce.quanlybanlaptop.service")
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("")
    public List<ProductDTO> getListProduct(){
        List<ProductDTO> result = productService.listAll();
        return result;
    }

    //lay ve 1 product theo id
    @GetMapping("/{id}")
    public  ProductDTO getProductId(@PathVariable(name = "id")Long id){
        ProductDTO result = productService.get(id);
        return result;
    }

    /*
    @PostMapping("/")
    public ResponseEntity<?> addProduct(@RequestBody Product model){
        Product product = productService.save(model);
        return null;
    }*/

    //xoa 1 product theo id
    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable(name = "id")Long id){
        productService.delete(id);
    }
}
