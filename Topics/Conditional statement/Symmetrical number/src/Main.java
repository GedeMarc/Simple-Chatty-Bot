import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // put your code here
        String year = scan.nextLine();
        
        if (year.length() == 4) {
            if (year.charAt(0) == year.charAt(3) && year.charAt(1) == year.charAt(2)) {
                System.out.println("1");
            } else {
                System.out.println("7");
            }
        }
    }
}