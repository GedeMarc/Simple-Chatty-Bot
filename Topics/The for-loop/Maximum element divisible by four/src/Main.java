import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // put your code here

        int n = s.nextInt();
        int biggest = 0;

        for (int i = 0; i < n; i++) {
            int x = s.nextInt();
            if (x % 4 == 0 && x > biggest) {
                biggest = x;
            }
        }
        System.out.println(biggest);
    }
}