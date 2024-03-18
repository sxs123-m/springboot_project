package com.sun.furn.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sun.furn.bean.Furn;
import org.apache.ibatis.annotations.Mapper;

/**
 * Description:
 *
 * @Author sun
 * @Create 2024/3/18 17:22
 * @Version 1.0
 */
@Mapper //注入容器
public interface FurnMapper extends BaseMapper<Furn> {
    //可以添加自定义方法
}
