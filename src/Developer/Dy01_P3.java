package Developer;

import java.util.Scanner;
public class Dy01_P3 {
    static void main(String[] args) {
        System.out.println("Enter the Name .....");
        Scanner sc = new Scanner(System.in);
        String myName = sc.nextLine();
        System.out.println("Entered Name is --> "+myName);
        System.out.println("Enter The Number To Get The Table");
        int t = sc.nextInt();

        int i;
        System.out.println("======================");
        System.out.println("The Table Of "+t+" is -->");
        System.out.println("======================");
        for( i = 1; i<=10; i++ ){

            System.out.println(t+" X "+i+" = "+t*i);
        }
        System.out.println("Enter the number to print the reverse table");
        int r = sc.nextInt();

        System.out.println("The reverse table of "+r+" IS ");
        for(int j=10; j>=1; j--){
            System.out.println(r+" X "+j+" = "+r*j);
        }
    }
}
