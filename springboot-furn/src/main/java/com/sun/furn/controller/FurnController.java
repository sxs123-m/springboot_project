package com.sun.furn.controller;

import com.sun.furn.bean.Furn;
import com.sun.furn.service.FurnService;
import com.sun.furn.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Description:
 *
 * @Author sun
 * @Create 2024/3/18 17:48
 * @Version 1.0
 */
@Slf4j
@RestController // 由于是前后端分离，所以返回的都是json数据
public class FurnController {
    // 注入service的bean对象，可以调用IService的方法
    @Resource
    private FurnService furnService;

    @PostMapping("/save")
    /*
    * 注意：这里的requestBody表示前端必须以json格式发送数据
    * 但是，如果使用表单提交的数据则不能添加这个注解 */
    public Result save( Furn furn) {
        log.info("furn = {} " + furn);
        furnService.save(furn);
        return Result.success();
    }
}
