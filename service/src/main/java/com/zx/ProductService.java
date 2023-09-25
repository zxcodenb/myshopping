package com.zx;

import com.zx.pojo.Product;
import com.zx.pojo.ResultData;

import java.util.List;

public interface ProductService {

    ResultData selectByPage(int pageNum,int pageSize);

//    商品详情页
    ResultData selProductByDetail(int productId );

//    商品分类
    ResultData selectBycateGoryId(int categoryId , int pageNum,int pageSize);

}
