package com.xiongya.springboot.dubbo.service.Imp;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xiongya.springboot.dubbo.entity.UserAddress;
import com.xiongya.springboot.dubbo.service.OrderService;
import com.xiongya.springboot.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author xiongzhilong
 * @Email 2584496774@qq.com
 * @Date create by 2019-07-05 20:23
 */
@Service
public class OrderServiceImp implements OrderService {

    @Reference
    private UserService userService;

    public List<UserAddress> initOrder(String userId) {
        // TODO Auto-generated method stub
        System.out.println("用户id："+userId);
        //1、查询用户的收货地址
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        return addressList;
    }
}
