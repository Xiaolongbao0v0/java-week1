package week5;

public class BookShelf {
    public static double allValue(Book[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i].totalValue();
        }
        return sum;
    }

    public static int totalCount(Book[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i].count;
        }
        return sum;
    }

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
        Book[] books = new Book[5];
        books[0] = new Book("Java基础", 45.0, 3);
        books[1] = new Book("Java进阶", 68.0, 2);
        books[2] = new Book("数据库原理", 52.0, 5);
        books[3] = new Book("Servlet入门", 39.0, 4);
        books[4] = new Book("算法图解", 75.0, 1);

        for (int i = 0; i < books.length; i++) {
            books[i].printInfo();
        }

        System.out.println("--- Java进阶 打八折 ---");
        books[1].discount(0.8);
        books[1].printInfo();

        System.out.println("总价值：" + allValue(books));
        System.out.println("总库存：" + totalCount(books));
        System.out.println("最贵的书：" + mostExpensive(books).name);
    }
}
