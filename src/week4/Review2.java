package week4;

public class Review2 {
    public void nums(int[] a) {
        int max = a[0];
        int min = a[0];
        int sum = 0;
        for (int i = 1 ; i < a.length ; i++){
            sum = sum + a[i];
            if (a[i] > max){
                max = a[i];
            }
            if (a[i] < min){
                min = a[i];
            }
        }
        System.out.println("最大数是");
    }

}
