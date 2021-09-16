import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // put your code here

        int n = s.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        for (int i = 0; i < n; i++) {
            int x = s.nextInt();
            if (x == 5) {
                a++;
            } else if (x == 4) {
                b++;
            } else if (x == 3) {
                c++;
            } else if (x == 2) {
                d++;
            }
        }
        System.out.print(d + " " + c + " " + b + " " + a);
    }
}
