package com.zx.shoppingwebfront;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zx.ProductService;
import com.zx.mapper.ProductMapper;
import com.zx.mapper.ProductSkuMapper;
import com.zx.pojo.Product;
import com.zx.pojo.ProductSku;
import com.zx.pojo.ResultData;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShoppingwebFrontApplicationTests {

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private ProductSkuMapper skuMapper;

    @Autowired
    private ProductService productService;

    @Test
    void contextLoads() {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("product_id",9);
        Product product = productMapper.selectOne(queryWrapper);
        System.out.println(product);
    }

    @Test
    void test(){
        Product product = productMapper.selectById(9);
        System.out.println(product);
    }

    @Test
    void test2(){
        ResultData resultData = productService.selectBycateGoryId(46, 1, 5);

        System.out.println(resultData);
    }

}
