package com.zx.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zx.ProductService;
import com.zx.mapper.ProductMapper;
import com.zx.pojo.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public ResultData selectByPage(int pageNum, int pageSize) {


        Page page = new Page(pageNum,pageSize);
        productMapper.selectPage(page, null);



        //分页查询，成功返回page，失败返回msg
        if (page.getRecords() != null && page.getRecords().size() > 0 ){
            return new ResultData(1,"查询成功",page);
        }




        return new ResultData(0,"查询失败");
    }
}
