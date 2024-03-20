package com.guicai.maker.template.model;

import com.guicai.maker.meta.Meta;
import lombok.Data;

/**
 * 模板制作配置
 * @Author ${雷电影}
 * @Version 1.0
 */
@Data
public class TemplateMakerConfig {

    private Long id;

    private Meta meta = new Meta();

    private String originProjectPath;

    TemplateMakerFileConfig fileConfig = new TemplateMakerFileConfig();

    TemplateMakerModelConfig modelConfig = new TemplateMakerModelConfig();

    //TemplateMakerOutputConfig outputConfig = new TemplateMakerOutputConfig();
}