package com.zx.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zx.IndexIngService;
import com.zx.mapper.IndexImgMapper;
import com.zx.pojo.IndexImg;
import com.zx.pojo.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class IndexIngServiceImpl implements IndexIngService {

    @Autowired
    private IndexImgMapper indexImgMapper;

    @Override
    public ResultData allIndexImg() {

        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("status",1);

        List<IndexImg> imgList = indexImgMapper.selectList(queryWrapper);

        if (imgList != null && imgList.size() > 0){
            return new ResultData(1,"ok",imgList);
        }

        return new ResultData(0,"no");
    }
}
