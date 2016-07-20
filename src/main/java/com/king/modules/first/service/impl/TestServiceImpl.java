package com.king.modules.first.service.impl;

import com.king.modules.first.service.ITestService;
import com.king.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xiangfei on 16/7/20.
 */
@Service
public class TestServiceImpl implements ITestService {
    @Autowired
    private FirstService firstService;
    @Override
    public String test() {
        return firstService.getString();
    }
}
