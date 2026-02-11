import java.util.Scanner;
class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        
        if (num > 0) {
            System.out.println(num + " is a positive number.");
        } else if (num < 0) {
            System.out.println(num + " is a negative number.");
        } else {
            System.out.println(num + " is zero.");
        }
        
        scanner.close();
    }
}

class LargestOfThree {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        if (a >= b && a >= c) {
            System.out.println("Largest: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest: " + b);
        } else {
            System.out.println("Largest: " + c);
        }
    }
}

public class main{
    public static void main(String[] args) {
        int[] numbers={3, -1, 7, 0, 9};
        System.out.println(number[0]);
    }
}