package com.zx.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zx.ProductService;
import com.zx.mapper.*;
import com.zx.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ProductSkuMapper productSkuMapper;
    @Autowired
    private ProductParamsMapper productParamsMapper;
    @Autowired
    private ProductImgMapper productImgMapper;
    @Autowired
    private ProductCommentsMapper productCommentsMapper;

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
    public ResultData selProductByDetail(int productId) {
        //根据商品id查询商品信息
        Product product = productMapper.selectById(productId);
        //根据商品id查询商品sku
        QueryWrapper<ProductSku> queryWrapperSku = new QueryWrapper<>();
        queryWrapperSku.eq("product_id",productId);
        List<ProductSku> productSkuList = productSkuMapper.selectList(queryWrapperSku);
        //根据商品id查询图片信息
//        QueryWrapper<ProductImg> queryWrapperImg = new QueryWrapper<>();
//        queryWrapperImg.eq("item_id",productId);
//        List<ProductImg> productImgList = productImgMapper.selectList(queryWrapperImg);
        List<ProductImg> productImgList = productImgMapper.selImgById(productId);
        //根据商品id查询评论信息
        QueryWrapper<ProductComments> queryWrapperComments = new QueryWrapper<>();
        queryWrapperComments.eq("product_id",productId);
        List<ProductComments> productCommentsList = productCommentsMapper.selectList(queryWrapperComments);
        //根据商品id查询参数信息
        QueryWrapper<ProductParams> queryWrapperParams = new QueryWrapper<>();
        queryWrapperParams.eq("product_id",productId);
        ProductParams productParams = productParamsMapper.selectOne(queryWrapperParams);

        ProductDetail productDetail = new ProductDetail(product,productSkuList,productImgList,productCommentsList,productParams);

        return new ResultData(1,"ok",productDetail);
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




}
