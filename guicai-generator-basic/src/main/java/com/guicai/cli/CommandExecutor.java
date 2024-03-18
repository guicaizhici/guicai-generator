package com.guicai.cli;

import com.guicai.cli.command.ConfigCommand;
import com.guicai.cli.command.GenerateCommand;
import com.guicai.cli.command.ListCommand;
import picocli.CommandLine;

/**
 * 命令行执行器
 * @Author ${雷电影}
 * @Version 1.0
 */
@CommandLine.Command(name = "guicai", mixinStandardHelpOptions = true)
public class CommandExecutor implements Runnable {

    private final CommandLine commandLine;

    {
        commandLine = new CommandLine(this)
                .addSubcommand(new GenerateCommand())
                .addSubcommand(new ConfigCommand())
                .addSubcommand(new ListCommand());
    }

    @Override
    public void run() {
        // 不输入子命令时，给出引导提示
        System.out.println("请输入具体命令，或者输入 --help 查看命令提示");
    }

    /**
     * 执行命令
     *
     * @param args
     * @return
     */
    public Integer doExecute(String[] args) {
        return commandLine.execute(args);
    }
}
