package com.zx.controller;


import com.zx.ProductService;
import com.zx.pojo.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("products")
public class ProductController {


    //Autowire the ProductService
    @Autowired
    private  ProductService productService;


    //GetMapping for the productId
    @GetMapping("{productId}")
    //Method to return the result data
    public ResultData detail(@PathVariable Integer productId){

        //Call the selProductByDetail method from the ProductService
        ResultData resultData = productService.selProductByDetail(productId);

        //Return the result data
        return resultData;

    }






}
