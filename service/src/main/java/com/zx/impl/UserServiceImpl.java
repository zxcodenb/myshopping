package com.zx.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zx.JwtUtils;
import com.zx.RsaUtils;
import com.zx.UserService;
import com.zx.mapper.UsersMapper;
import com.zx.pojo.ResultData;
import com.zx.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import org.springframework.util.ResourceUtils;

import java.security.DigestException;
import java.security.PrivateKey;

/**
 *
 * 用户登录 生成token
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UsersMapper usersMapper;






    @Override
    public ResultData login(Users user) {


        //1.根据用户名查询数据库，返回user对象
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("username",user.getUsername());
        Users users = usersMapper.selectOne(queryWrapper);
        if (users == null){
            //2.如果用户名不存在，则直接返回返回登录失败
            return new ResultData(0,"用户名不存在",null);
        }
        if (!users.getPassword().equals(user.getPassword())){

            return new ResultData(0,"密码错误",null);
        }
       //3.如果用户存在，则比较密码（加密
      if (!DigestUtils.md5DigestAsHex(user.getPassword().getBytes()).equals(users.getPassword())){
          //密码错误
          return new ResultData(0,"密码错误",null);
      }
        //???
        users.setPassword("");

        //4.登录成功，则颁发token
        //加密user同时校验
        try {
            //获取私钥
            PrivateKey privateKey = RsaUtils.getPrivateKey(ResourceUtils.getFile("classpath:rsa.pri").getPath());
            String token = JwtUtils.generateTokenExpireInMinutes(users,privateKey, 1000);
            return  new ResultData(1,"登录成功",token);

        } catch (Exception e) {

            e.printStackTrace();
            return new ResultData(0,"登录失败",null);
        }


    }
}
