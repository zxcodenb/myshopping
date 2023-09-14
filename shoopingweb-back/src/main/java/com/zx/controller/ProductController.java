package com.zx.controller;


import com.zx.CategoryService;
import com.zx.ProductService;
import com.zx.pojo.ResultData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("products")
public class ProductController {


    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;


    @GetMapping
    public ResultData selAll(@RequestParam(defaultValue = "1") Integer pageNum, @RequestParam(defaultValue = "5") Integer pageSize) {

        ResultData resultData = categoryService.selAllCategory();


        System.out.println(pageNum + "==" + pageSize);

        ResultData resultDate = productService.selectByPage(pageNum, pageSize);


        return resultData;
    }
}
