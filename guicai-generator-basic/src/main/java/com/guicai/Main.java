package com.guicai;

import com.guicai.cli.CommandExecutor;

/**
 * @Author ${雷电影}
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {
 //       args = new String[]{"generate", "-l", "-a", "-o"};
 //      args = new String[]{"config"};
//       args = new String[]{"list"};
        CommandExecutor commandExecutor = new CommandExecutor();
        commandExecutor.doExecute(args);
    }
}