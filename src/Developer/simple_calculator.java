package Developer;
import java.util.Scanner;
public class simple_calculator {
   public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter First Number: ");
       double a = sc.nextDouble();

       System.out.println("Enter Operator (+,-, *, /): ");
       char op = sc.next().charAt(0);

       System.out.println("Enter Second Number: ");
       double b = sc.nextInt();

       double result;
       switch (op) {
           case '+': result = a + b; break;
           case '-': result = a - b; break;
           case '*': result = a * b; break;
           case '/':
                    if(b == 0) {
                        System.out.println("Error! Division by zero.");
                        return;
                    }
                    result = a / b; break;
           default:
               System.out.println("Invalid Operator!");
               return;
       }
       System.out.println("Result: " + a + " " + op + " " + b + " = " + result);
       sc.close();
    }
}
