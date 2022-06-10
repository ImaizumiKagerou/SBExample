package com.ik.test.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ik.test.entity.TestObj;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ik
 * 2022/6/10-15:36
 **/
@Repository
public interface TestMapper extends BaseMapper<TestObj> {

    List<TestObj> queryAll();

}
