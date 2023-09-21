package com.zx.controller;

import com.zx.ProductService;
import com.zx.pojo.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("recommend")
public class RecommendController {

    @Autowired
    private ProductService productService;


    //首页推荐
    @GetMapping
    public ResultData recomme(){
        ResultData resultData = productService.allProImg();
        return resultData;
    }
}
