package com.zx.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zx.pojo.Category;
import com.zx.pojo.ResultData;

import java.util.List;

import javax.naming.spi.DirStateFactory.Result;


public interface CategoryMapper extends BaseMapper<Category> {



    List<Category> selectCateGory();





}
