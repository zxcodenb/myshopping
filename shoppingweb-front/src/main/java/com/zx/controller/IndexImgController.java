package com.zx.controller;


import com.zx.IndexIngService;
import com.zx.pojo.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 轮播图  前端控制器
 * </p>
 *
 * @author zx
 * @since 2023-09-19
 */
@RestController
@RequestMapping("/indexImg")
public class IndexImgController {

    @Autowired
    private IndexIngService indexIngService;

    @GetMapping
    public ResultData indexImg(){


        return indexIngService.allIndexImg();
    }

}

