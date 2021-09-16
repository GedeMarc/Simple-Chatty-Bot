import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // put your code here

        int n = s.nextInt();
        int sumLarger = 0;
        int sumSmaller = 0;
        int sumPerfect = 0;

        for (int i = 0; i < n; i++) {
            int x = s.nextInt();
            if (x == -1) {
                sumSmaller++;
            } else if (x == 0) {
                sumPerfect++;
            } else if (x == 1) {
                sumLarger++;
            }
        }
        System.out.println(sumPerfect + " " + sumLarger + " " + sumSmaller);
    }
}