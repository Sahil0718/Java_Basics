public class Arrays {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};
        for (int i = 0; i < 4; i++) {
            System.out.println(numbers[i]);

            int[] myArr = new int[5];
            myArr[0] = 90;
            myArr[1] =100;
            myArr[2] =70;
            myArr[3] = 140;
            System.out.println(myArr[3]);
        }
    }
}