package com.zx.controller;


import com.zx.CategoryService;
import com.zx.pojo.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("categories")
public class CategoryController {

    @Autowired
    private CategoryService cateGoryService;


    @GetMapping
    public ResultData selAllcategory(){

        ResultData resultData = cateGoryService.selectCateGory();

        return resultData;

    }

}
