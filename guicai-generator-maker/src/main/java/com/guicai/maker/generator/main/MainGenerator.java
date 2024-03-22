package com.guicai.maker.generator.main;


/**
 * 生成代码生成器
 * @Author ${雷电影}
 * @Version 1.0
 */
public class MainGenerator extends GenerateTemplate {

    @Override
    protected String buildDist(String outputPath, String sourceCopyDestPath, String jarPath, String shellOutputFilePath) {
        System.out.println("不要给我输出 dist 啦！");
        return "";
    }

}
