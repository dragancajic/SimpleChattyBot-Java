import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        
        if (number1 > 0 && number2 <= 0 && number3 <= 0) {
            System.out.println(true);
        } else if (number1 <= 0 && number2 > 0 && number3 <= 0) {
            System.out.println(true);
        } else if (number1 <= 0 && number2 <= 0 && number3 > 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
