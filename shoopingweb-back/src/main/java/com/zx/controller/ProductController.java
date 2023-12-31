package com.zx.controller;


import com.zx.ProductService;
import com.zx.pojo.Product;
import com.zx.pojo.ResultData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("products")
public class ProductController {


    @Autowired
    private ProductService productService;




    @GetMapping
    public ResultData selAll(@RequestParam(defaultValue = "1") Integer pageNum, @RequestParam(defaultValue = "5") Integer pageSize) {




        System.out.println(pageNum + "==" + pageSize);

        ResultData resultData = productService.selectByPage(pageNum, pageSize);


        return resultData;
    }

    @GetMapping("one")
    public Product selOne(Integer id){
        Product product = productService.selOne(id);

        return product;
    }
}
