package week3;

public class StudentTest {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        // 先造一个能装 3 个学生的数组

        students[0] = new Student("张三", new int[]{85, 92, 78});


        students[1] = new Student("李四", new int[]{60, 70, 65});


        students[2] = new Student("王五", new int[]{55, 50, 62});


        for (int i = 0; i < students.length; i++) {
            students[i].printInfo();
            // 循环里调方法
        }
    }
}
