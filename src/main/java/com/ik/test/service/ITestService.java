package com.ik.test.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ik.test.entity.TestObj;

import java.util.List;

/**
 * @author ik
 * 2022/6/10-15:40
 **/
public interface ITestService extends IService<TestObj> {

    List<TestObj> getAll();

}
