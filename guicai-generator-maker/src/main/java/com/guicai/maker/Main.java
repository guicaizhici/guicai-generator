package com.guicai.maker;

import com.guicai.maker.generator.main.MainGenerator;
import freemarker.template.TemplateException;

import java.io.IOException;


/**
 * @Author ${雷电影}
 * @Version 1.0
 */


public class Main {

    public static void main(String[] args) throws TemplateException, IOException, InterruptedException {
        MainGenerator mainGenerator = new MainGenerator();
        mainGenerator.doGenerate();
    }
}
