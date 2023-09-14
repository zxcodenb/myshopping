package com.zx.shoppingwebfront.controller;


import com.zx.CategoryService;
import com.zx.pojo.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("categorys")
public class categoryController {

    @Autowired
    private CategoryService categoryService;



    @GetMapping
    public ResultData allCategory(){

        ResultData resultData = categoryService.selAllCategory();

        return resultData;

    }




}
