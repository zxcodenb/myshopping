package com.zx.controller;


import com.zx.CategoryService;
import com.zx.ProductService;
import com.zx.pojo.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("categories")
public class CategoryController {

    @Autowired
    private CategoryService cateGoryService;
    @Autowired
    private ProductService productService;


    @GetMapping
    public ResultData selAllcategory(){

        ResultData resultData = cateGoryService.selectCateGory();

        return resultData;

    }

    @GetMapping("{categoryId}")
    public ResultData selProduct(@PathVariable Integer categoryId, @RequestParam(defaultValue = "1") Integer pageNum, @RequestParam(defaultValue = "5") Integer pageSize ){

        ResultData resultData = productService.selectBycateGoryId(categoryId, pageNum, pageSize);

        return resultData;


    }

}
