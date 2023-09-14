package com.zx;

import com.zx.pojo.ResultData;

public interface ProductService {





    ResultData selectByPage(int pageNum,int pageSize);
}
