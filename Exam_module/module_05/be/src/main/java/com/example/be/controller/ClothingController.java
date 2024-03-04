package com.example.be.controller;

import com.example.be.model.Category;
import com.example.be.model.Clothing;
import com.example.be.service.ICategoryService;
import com.example.be.service.IClothingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
public class ClothingController {
    @Autowired
    private ICategoryService iCategoryService;
    @Autowired
    private IClothingService iClothingService;

    @GetMapping("/categories")
    public ResponseEntity<List<Category>> getAllCate() {
            List<Category> cate = this.iCategoryService.findAllCate();
            return new ResponseEntity<>(cate, HttpStatus.OK);
    }


    //    @GetMapping("/clothing")
//    public ResponseEntity<Page<Clothing>> getList(@RequestParam(defaultValue = "")String name){
//        Pageable pageable = PageRequest.of(0,3);
//        Page<Clothing> list = this.iClothingService.find(pageable, name);
//        return new ResponseEntity<>(list, HttpStatus.OK);
//    }
    @GetMapping("/clothing")
    public ResponseEntity<List<Clothing>> listResponseEntity() {
        List<Clothing> list = this.iClothingService.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Clothing> saveBlog(@RequestBody Clothing clothing) {
            return new ResponseEntity<>(this.iClothingService.save(clothing), HttpStatus.OK);
            
    }

   @PutMapping("/clothing/{id}")
   public ResponseEntity<Clothing> update(@RequestBody Clothing clothing,@PathVariable int id){

        return new ResponseEntity<>(HttpStatus.OK);
   }
}
