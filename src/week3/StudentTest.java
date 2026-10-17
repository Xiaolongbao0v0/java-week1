package week3;

public class StudentTest {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        // 先造一个能装 3 个学生的数组

        students[0] = new Student();              // ← 关键，别漏
        students[0].setName("张三");
        students[0].setScores(new int[]{85, 92, 78});

        students[1] = new Student();
        students[1].setName("李四");
        students[1].setScores(new int[]{60, 70, 65});

        students[2] = new Student();
        students[2].setName("王五");
        students[2].setScores(new int[]{50, 55, 52});


        for (int i = 0; i < students.length; i++) {
            students[i].printInfo();
            // 循环里调方法
        }
    }
}
