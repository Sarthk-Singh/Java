<<<<<<< HEAD

import java.util.*;

public class q3 {

    public int sumFact(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        q3 ob = new q3();
        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2:");
        int num2 = sc.nextInt();
        int sum1 = ob.sumFact(num1);
        int sum2 = ob.sumFact(num2);
        if (sum1/num1 == sum2/num2) {
            System.out.println("Friendly pair");
        }
        else{
            System.out.println("Not a friendly pair");
        }
        sc.close();
    }
}
=======

import java.util.*;

public class q3 {

    public int sumFact(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        q3 ob = new q3();
        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2:");
        int num2 = sc.nextInt();
        int sum1 = ob.sumFact(num1);
        int sum2 = ob.sumFact(num2);
        if (sum1/num1 == sum2/num2) {
            System.out.println("Friendly pair");
        }
        else{
            System.out.println("Not a friendly pair");
        }
        sc.close();
    }
}
>>>>>>> 8fdbfb6a0553514a8c2a2c25e2ca25904331e9bb
