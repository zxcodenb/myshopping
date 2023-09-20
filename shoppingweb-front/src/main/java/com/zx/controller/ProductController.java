package com.zx.controller;


import com.zx.ProductService;
import com.zx.pojo.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("{categoryId}")
    public ResultData selProduct(@PathVariable int categoryId, @RequestParam(defaultValue = "1") Integer pageNum,@RequestParam(defaultValue = "5") Integer pageSize ){

        ResultData resultData = productService.selectBycateGoryId(categoryId, pageNum, pageSize);

        return resultData;


    }


}
