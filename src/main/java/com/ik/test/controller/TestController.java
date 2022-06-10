package com.ik.test.controller;

import com.ik.test.entity.TestObj;
import com.ik.test.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ik
 * 2022/6/10-15:35
 **/
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private ITestService testService;

    @RequestMapping("/a")
    public String test(){
        List<TestObj> list = testService.getAll();
        return "a";
    }


}
