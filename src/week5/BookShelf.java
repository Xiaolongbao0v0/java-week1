package week5;

/**
 * 书架工具类：提供一批操作整个书架的静态方法
 * 这些方法不属于某一本书，而是对"书的数组"整体干活，所以用 static
 */
public class BookShelf {

    // 所有书的总价值：遍历数组，把每本书的 totalValue 累加
    public static double allValue(Book[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i].totalValue();
        }
        return sum;
    }

    // 所有书的总库存：遍历数组，把每本书的 count 累加
    public static int totalCount(Book[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i].count;
        }
        return sum;
    }

    // 找单价最贵的书：返回的是"一整本书"(Book 对象)，不是价格数字
    // 用擂台法：先拿第一本当擂主，后面的书如果单价更高就换人
    public static Book mostExpensive(Book[] arr) {
        Book max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].price > max.price) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // 造一个能装 5 本书的位置数组（此时还是空的，下面逐个填进去）
        Book[] books = new Book[5];
        books[0] = new Book("Java基础", 45.0, 3);
        books[1] = new Book("Java进阶", 68.0, 2);
        books[2] = new Book("数据库原理", 52.0, 5);
        books[3] = new Book("Servlet入门", 39.0, 4);
        books[4] = new Book("算法图解", 75.0, 1);

        // 遍历打印每本书的信息
        for (int i = 0; i < books.length; i++) {
            books[i].printInfo();
        }

        // 给第二本《Java进阶》打八折
        System.out.println("--- Java进阶 打八折 ---");
        books[1].discount(0.8);
        books[1].printInfo();

        // 汇总输出
        System.out.println("总价值：" + allValue(books));
        System.out.println("总库存：" + totalCount(books));
        System.out.println("最贵的书：" + mostExpensive(books).name);
    }
}
