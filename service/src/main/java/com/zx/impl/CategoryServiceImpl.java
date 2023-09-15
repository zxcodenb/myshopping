package com.zx.impl;

import com.zx.CategoryService;
import com.zx.mapper.CategoryMapper;
import com.zx.pojo.Category;
import com.zx.pojo.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public ResultData selectCateGory() {

//        List<Category> categoryList = categoryMapper.selectList(null);

        List<Category> categoryList = categoryMapper.selectCateGory();

        if (categoryList != null && categoryList.size() != 0){
            return new ResultData(1,"query ok",categoryList);
        }


            return new ResultData(0,"no data");
    }
}
