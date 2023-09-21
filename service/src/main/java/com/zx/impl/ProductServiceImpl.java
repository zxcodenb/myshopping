package com.zx.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zx.ProductService;
import com.zx.mapper.ProductMapper;
import com.zx.pojo.Product;
import com.zx.pojo.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


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

    @Override
    public Product selOne(int id) {
        Product product = productMapper.selOne(id);

        return product;
    }

    @Override
    public ResultData selectBycateGoryId(int categoryId, int pageNum, int pageSize) {

        Page page = new Page(pageNum,pageSize);
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("category_id",categoryId);
        productMapper.selectPage(page,queryWrapper);

        if (page.getRecords() != null && page.getRecords().size() > 0){
            return new ResultData(1,"ok",page);
        }


        return new ResultData(0,"no");

    }

    @Override
    public ResultData allProImg() {

        List<Product> productList = productMapper.allProImg();

        if (productList != null && productList.size() > 0 ){
            return new ResultData(1,"ok",productList);
        }

        return new ResultData(0,"no");
    }


}
