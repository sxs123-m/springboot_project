package com.sun.furn;

import com.sun.furn.bean.Furn;
import com.sun.furn.mapper.FurnMapper;
import com.sun.furn.service.FurnService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description:
 *
 * @Author sun
 * @Create 2024/3/18 17:28
 * @Version 1.0
 */
@SpringBootTest
public class ApplicationTest {
    //输入Mapper的代理对象
    @Resource
    private FurnMapper furnMapper;
    //注入Service的bean对象
    @Resource
    private FurnService furnService;

    @Test
    public void FurnMapperTest() {
        Furn furn = furnMapper.selectById(1);
        System.out.println(furn);
    }

    @Test
    public void FurnServiceTest() {
        List<Furn> list = furnService.list();
        for (Furn furn : list) {
            System.out.println(furn);
        }
    }
}
