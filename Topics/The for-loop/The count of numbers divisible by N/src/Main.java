import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // put your code here

        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int number = 0;

        for (int i = a; i <= b; i++) {
            if (i % n == 0) {
                number++;
            }
        }
        System.out.println(number);
    }
}