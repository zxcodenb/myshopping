package com.zx.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zx.pojo.ProductSku;

/**
 * <p>
 * 商品规格 每一件商品都有不同的规格，不同的规格又有不同的价格和优惠力度，规格表为此设计 Mapper 接口
 * </p>
 *
 * @author zx
 * @since 2023-09-25
 */
public interface ProductSkuMapper extends BaseMapper<ProductSku> {

}
