package com.guicai.model;

import lombok.Data;

/**
 * 动态模版配置
 * @Author ${雷电影}
 * @Version 1.0
 */
@Data
public class MainTemplateConfig {


    /**
     * 是否生成循环
     */
    private boolean loop;

    /**
     * 作者注释
     */
    private String author = "guicai";

    /**
     * 输出信息
     */
    private String outputText = "sum = ";
}
