package com.zx.controller;


import com.zx.ProductService;
import com.zx.pojo.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("products")
public class ProductController {


    @Autowired
    private  ProductService productService;


    @GetMapping("{productId}")
    public ResultData detail(@PathVariable Integer productId){

        ResultData resultData = productService.selProductByDetail(productId);

        return resultData;

    }






}
