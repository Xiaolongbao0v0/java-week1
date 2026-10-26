package week5.pet;

/**
 * 【第 5 周练习 · 宠物店】
 * 场景：一家宠物店能养最多 10 只宠物，顾客可以"领养"走宠物。
 * <p>
 * 你要写的 Pet 类（一只宠物）：
 * 字段：
 * String name   名字
 * String type   品种（如 猫/狗/兔）
 * int    age    年龄
 * 构造方法：
 * Pet(String name, String type, int age)
 * 方法：
 * void printInfo()
 * 打印一行：名字 品种 年龄，例如 "小白 猫 2"
 */
public class Pet {
    String name;
    String type;
    int age;

    // ===== 字段 =====
    Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }


    // ===== 构造方法 =====
    public void printInfo() {
        System.out.println("名字:" + name + " " + "品种：" + type + " " + "年龄：" + age);
    }


    // ===== printInfo：打印一只宠物 =====

}
