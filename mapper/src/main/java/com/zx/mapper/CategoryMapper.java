package com.zx.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zx.pojo.Category;


import java.util.List;


public interface CategoryMapper extends BaseMapper<Category> {



    List<Category> selectCateGory();





}
