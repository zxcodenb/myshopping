package com.zx.impl;

import com.zx.CategoryService;
import com.zx.mapper.CategoryMapper;
import com.zx.pojo.Category;
import com.zx.pojo.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 分类服务实现
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public ResultData selectCateGory() {


        // 查询分类信息

        List<Category> categoryList = categoryMapper.selectCateGory();


        // 判断查询结果是否为空
        if (categoryList != null && categoryList.size() != 0){
            // 返回查询结果
            return new ResultData(1,"query ok",categoryList);
        }


        // 查询结果为空
            return new ResultData(0,"no data");
    }
}
