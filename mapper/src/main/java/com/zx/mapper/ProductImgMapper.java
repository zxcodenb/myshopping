package com.zx.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zx.pojo.Product;
import com.zx.pojo.ProductImg;

import java.util.List;

/**
 * <p>
 * 商品图片  Mapper 接口
 * </p>
 *
 * @author zx
 * @since 2023-09-21
 */
public interface ProductImgMapper extends BaseMapper<ProductImg> {


    List<Product> allProImg();

    List<ProductImg> selImgById(int productId);





}
