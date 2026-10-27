package week5.person;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        p1.name = "张宏";
        p1.age = 34;
        p1.sex = "女";
        p2.name = "王刚";
        p2.age = 35;
        p2.sex = "男";
        p3.name = "李磊";
        p3.age = 25;
        p3.sex = "男";
        System.out.println("姓名：" + p1.name + "\t\t性别：" + p1.sex + "\t\t年龄：" + p1.age + "\t\t行为：" + p1.eat());
        System.out.println("姓名：" + p2.name + "\t\t性别：" + p2.sex + "\t\t年龄：" + p2.age + "\t\t行为：" + p2.sleep());
        System.out.println("姓名：" + p3.name + "\t\t性别：" + p3.sex + "\t\t年龄：" + p3.age + "\t\t行为：" + p3.sing());
    }
}
