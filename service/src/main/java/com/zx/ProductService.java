package com.zx;

import com.zx.pojo.Product;
import com.zx.pojo.ResultData;

import java.util.List;

public interface ProductService {

    ResultData selectByPage(int pageNum,int pageSize);

    Product selOne(int id);
}
