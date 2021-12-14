package com.jinhx.design.behavioral.command;

public class Test {

    public static void main(String[] args) {
        // 创建一个电视机
        Television tv = new Television();
        // 创建一个遥控器
        TeleController teleController = new TeleController();
        teleController.switchCommand(new CCTV1Command(tv));
        teleController.switchCommand(new CCTV2Command(tv));
        teleController.switchCommand(new CCTV4Command(tv));
        teleController.switchCommand(new CCTV3Command(tv));
        teleController.switchCommand(new CCTV1Command(tv));
        // 模拟遥控器返回键
        teleController.back();
        teleController.back();
    }

}
