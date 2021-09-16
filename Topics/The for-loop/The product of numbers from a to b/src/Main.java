import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // put your code here

        int a = sc.nextInt();
        int b = sc.nextInt();
        long sum = a;

        for (int i = a + 1; i < b; i++) {
            sum *= i;
        }
        System.out.println(sum);
    }
}
