package com.xiongya.springboot.dubbo.service;

import com.xiongya.springboot.dubbo.entity.UserAddress;

import java.util.List;

/**
 * @Author xiongzhilong
 * @Email 2584496774@qq.com
 * @Date create by 2019-07-05 20:08
 */
public interface OrderService {

    /**
     * 初始化订单
     * @param userId
     */
    public List<UserAddress> initOrder(String userId);

}
