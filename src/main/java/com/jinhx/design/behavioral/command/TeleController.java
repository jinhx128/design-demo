package com.jinhx.design.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class TeleController {

    /**
     * 播放记录
     */
    List<AbstractCommand> historyCommand = new ArrayList<>();

    /**
     * 切换卫视
     */
    public void switchCommand(AbstractCommand abstractCommand) {
        historyCommand.add(abstractCommand);
        abstractCommand.execute();
    }

    /**
     * 遥控器返回命令
     */
    public void back() {
        System.out.println("------返回上一个卫视--------");
        if (historyCommand.isEmpty()) {
            System.out.println("------到顶了--------");
            return;
        }

        int size = historyCommand.size();
        int preIndex = Math.max(size - 2, 0);

        // 获取上一个播放某卫视的命令
        AbstractCommand preCommand = historyCommand.remove(preIndex);

        preCommand.execute();
    }

}
