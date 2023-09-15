package com.zx.controller;


import com.zx.CateGoryService;
import com.zx.pojo.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("categorys")
public class CateGoryController {

    @Autowired
    private CateGoryService cateGoryService;


    @GetMapping
    public ResultData selAll(){

        ResultData resultData = cateGoryService.selAllCareGory();

        return resultData;
    }

}
