import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // put your code here
        
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
    }
}
