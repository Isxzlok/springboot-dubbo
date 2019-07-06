package com.xiongya.springboot.dubbo.controller;

import com.xiongya.springboot.dubbo.entity.UserAddress;
import com.xiongya.springboot.dubbo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author xiongzhilong
 * @Email 2584496774@qq.com
 * @Date create by 2019-07-05 20:31
 */
@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    @ResponseBody
    @RequestMapping("/init")
    public List<UserAddress> initOrder(@RequestParam("uid") String userId){

        return orderService.initOrder(userId);

    }

}
