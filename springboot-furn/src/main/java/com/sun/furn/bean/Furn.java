package com.sun.furn.bean;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * Description: 映射furn表的bean
 *
 * @Author sun
 * @Create 2024/3/18 17:18
 * @Version 1.0
 */
@Data
@TableName("furn")
public class Furn {
    //在属性上标识了这个注解并设置了自增的类型，则在传输数据时就不需要指定id，SpringBoot会处理这个自增的id
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private String maker;
    private Double price;
    private Integer sales;
    private Integer stock;
}