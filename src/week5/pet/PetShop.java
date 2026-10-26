package week5.pet;

/**
 * PetShop 工具类（方法都 static）：
 * static int count(Pet[] pets)
 * 统计店里现在有几只宠物（非 null 的格子数）。
 * static int findByName(Pet[] pets, String name)
 * 返回名字匹配的那只宠物在数组里的下标；找不到返回 -1。
 * main：
 * 1. 造一个能装 10 只宠物的数组 Pet[] pets = new Pet[10]（一开始全是 null）
 * 2. 手动放进 3 只（pets[0]、pets[1]、pets[2]）
 * 3. 打印当前店里宠物数量（count）
 * 4. 用 findByName 找 "小白"，打印它的下标；再找一个不存在的名字，打印 -1
 * <p>
 * 关键点：数组是固定长度 10，但"实际有几只"由 null 决定。
 * 遍历时要用 if (pets[i] != null) 跳过空位，否则会报空指针异常。
 */
public class PetShop {
    static int count(Pet[] pets) {
        int sum = 0;
        for (int i = 0; i < pets.length; i++) {
            if (pets[i] != null) {
                sum++;
            }
        }
        return sum;
    }

    // ===== count：数有几只（跳过 null）=====
    static int findByName(Pet[] pets, String name) {
        for (int i = 0; i < pets.length; i++) {
            if (pets[i] != null && pets[i].name.equals(name)) {
                return i;
            }
        }
        return -1;
    }


    // ===== findByName：找名字，返回下标，找不到返回 -1 =====
    public static void main(String[] args) {
        Pet[] pets = new Pet[10];
        pets[0] = new Pet("家齐", "儿子", 18);
        pets[1] = new Pet("汪熠轩", "孙子", 18);
        pets[2] = new Pet("曹琪", "木木儿", 18);
        System.out.println("店里有：" + count(pets) + " " + "个宠物");
        for (int i = 0; i < pets.length; i++) {
            if (pets[i] != null) {
                pets[i].printInfo();
            }
        }
        System.out.println("家齐在下标：" + findByName(pets,"家齐"));
        System.out.println("胡家睿在下标：" + findByName(pets,"胡家睿"));
    }
}


// ===== main =====


