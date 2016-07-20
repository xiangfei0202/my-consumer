package com.king.modules.first.controller;

import com.king.modules.first.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by xiangfei on 16/7/19.
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {
    @Autowired
    private ITestService iTestService;

    @ResponseBody
    @RequestMapping(value = "/test11", method = RequestMethod.POST)
    public Object test1(HttpServletRequest request) {
        String str = iTestService.test();
        System.out.print("str====:" + str);
        return null;
    }
}
