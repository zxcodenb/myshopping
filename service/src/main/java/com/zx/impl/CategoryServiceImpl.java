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
    public ResultData selAllCategory()  {
        List<Category> categoryList = categoryMapper.selectList(null);



        return new ResultData(1,"testservice",categoryList);
    }
}
