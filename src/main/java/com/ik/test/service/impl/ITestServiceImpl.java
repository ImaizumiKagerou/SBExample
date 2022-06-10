package com.ik.test.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ik.test.dao.TestMapper;
import com.ik.test.entity.TestObj;
import com.ik.test.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ik
 * 2022/6/10-15:44
 **/
@Service
public class ITestServiceImpl extends ServiceImpl<TestMapper, TestObj> implements ITestService {

    @Autowired
    private TestMapper testMapper;


    @Override
    public List<TestObj> getAll() {
        return testMapper.queryAll();
    }
}
