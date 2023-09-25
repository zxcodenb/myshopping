package com.zx.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDetail {

    private Product product;
    private List<ProductSku> productSkuList;
    private  List<ProductImg> productImgList;
    private List<ProductComments> productCommentsList;
    private  ProductParams productParams;

}
