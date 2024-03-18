package com.guicai.generator;

import com.guicai.model.MainTemplateConfig;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;

/**
 * 核心生成器
 * @Author ${雷电影}
 * @Version 1.0
 */
public class MainGenerator {

    /**
     * 生成
     *
     * @param model 数据模型
     * @throws TemplateException
     * @throws IOException
     */
    public static void doGenerate(Object model) throws TemplateException, IOException {
        // 生成静态文件
        // 获取整个项目的根路径
        String projectPath = System.getProperty("user.dir");
        //File parentFile = new File(projectPath).getParentFile();
        // 输入路径：ACM 示例代码模板目录
        // String inputPath = new File(parentFile, "guicai-generator-demo-project/acm-template").getAbsolutePath();
        String inputPath = projectPath + File.separator + "guicai-generator-demo-project" + File.separator + "acm-template";
        //System.out.println(inputPath);
        // 输出路径：直接输出到项目的根目录
        String outputPath = projectPath;
        StaticGenerator.copyFilesByHutool(inputPath, outputPath);

        // 生成动态文件
        String inputDynamicFilePath = projectPath + File.separator + "guicai-generator-basic/src/main/resources/templates/MainTemplate.java.ftl";
        String outputDynamicFilePath = outputPath + File.separator + "acm-template/src/com/guicai/acm/MainTemplate.java";
        DynamicGenerator.doGenerate(inputDynamicFilePath, outputDynamicFilePath, model);
    }

    public static void main(String[] args) throws TemplateException, IOException {
        MainTemplateConfig mainTemplateConfig = new MainTemplateConfig();
        //model动态分配
        mainTemplateConfig.setAuthor("guicai");
        mainTemplateConfig.setLoop(false);
        mainTemplateConfig.setOutputText("求和结果：");

        doGenerate(mainTemplateConfig);
    }
}
