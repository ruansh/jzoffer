package com.ruanshuai.test;

/**
 * @author ruanshuai
 * @date 2020/9/25
 */


public class 排骨汤 {

    public static void main(String[] args) {
        排骨汤 paigutang = new 排骨汤();
        paigutang.set排骨("猪排");
        paigutang.set配菜("莲藕");
        paigutang.set调料("葱姜蒜、酱油");
        System.out.print("材料：");
        System.out.println(paigutang.get排骨() + "，" + paigutang.get配菜() + "，" + paigutang.get调料());
        paigutang.焯水();
        paigutang.煮排骨();
        paigutang.加入配菜();
        paigutang.加盐葱出锅();
    }

    String 排骨;

    String 配菜;

    String 调料;

    public void 焯水() {
        System.out.println("焯水");
    }

    public void 煮排骨() {
        System.out.println("煮排骨");
    }

    public void 加入配菜() {
        System.out.println("煮配菜");
    }

    public void 加盐葱出锅() {
        System.out.println("加盐葱出锅");
    }

    public String get排骨() {
        return 排骨;
    }

    public void set排骨(String 排骨) {
        this.排骨 = 排骨;
    }

    public String get配菜() {
        return 配菜;
    }

    public void set配菜(String 配菜) {
        this.配菜 = 配菜;
    }

    public String get调料() {
        return 调料;
    }

    public void set调料(String 调料) {
        this.调料 = 调料;
    }
}
