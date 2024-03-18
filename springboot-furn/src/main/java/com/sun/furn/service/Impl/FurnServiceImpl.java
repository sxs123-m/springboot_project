package com.sun.furn.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sun.furn.bean.Furn;
import com.sun.furn.mapper.FurnMapper;
import com.sun.furn.service.FurnService;
import org.springframework.stereotype.Service;

/**
 * Description:
 *
 * @Author sun
 * @Create 2024/3/18 17:35
 * @Version 1.0
 */
@Service //注入容器
public class FurnServiceImpl extends ServiceImpl<FurnMapper, Furn> implements FurnService {
    //自定义方法实现
}
