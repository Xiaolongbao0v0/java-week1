package week3;

public class StudentTest {
    public static void main(String[] args) {
        Student zhangsan = new Student();          // new = 造一个具体的学生
        zhangsan.name = "张三";
        zhangsan.scores = new int[]{85, 92, 78};

        Student lisi = new Student();
        lisi.name = "李四";
        lisi.scores = new int[]{60, 70, 65};

        System.out.println(zhangsan.name + "的平均分：" + zhangsan.average());
        System.out.println(lisi.name + "的平均分：" + lisi.average());
    }
}
