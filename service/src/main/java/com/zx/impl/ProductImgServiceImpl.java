package com.zx.impl;

import com.zx.ProductImgService;
import com.zx.mapper.ProductImgMapper;
import com.zx.pojo.Product;
import com.zx.pojo.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductImgServiceImpl implements ProductImgService {

    @Autowired
    private ProductImgMapper productImgMapper;


    @Override
    public ResultData allProImg() {

        List<Product> productList = productImgMapper.allProImg();

        if (productList != null && productList.size() > 0 ){
            return new ResultData(1,"ok",productList);
        }

        return new ResultData(0,"no");
    }
}
