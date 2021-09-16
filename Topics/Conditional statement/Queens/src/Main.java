import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // put your code here
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();

        if (x1 == x2 || y1 == y2 || Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}