import java.util.*;
class q2 {

    public void td(int p, double r, int t) {

        double amount = p * Math.pow((1 + (r / 100)), t);
        System.out.println("Amount: " + amount);
    }

    public void rd(int p, double r, int n) {

        double a = p * n + (p * n * (n + 1) / 2.0) * (r / 100) * (1.0 / 12);
        System.out.println("Amount: " + a);
    }

    public static void main(String arge[]) {
        Scanner sc = new Scanner(System.in);
        q2 ob = new q2();
        int in;
        do {
            System.out.println("Enter \n1 for Term Deposit\n2 for Recurring Depostie\n3 to EXIT");
            in = sc.nextInt();
            switch (in) {
                case 1:
                    System.out.print("Enter the principal amount: ");
                    int principal = sc.nextInt();

                    System.out.print("Enter the rate: ");
                    double rate = sc.nextDouble();

                    System.out.print("Enter the time period: ");
                    int time = sc.nextInt();

                    ob.td(principal, rate, time);
                    break;

                case 2:
                    System.out.println("Enter manthly installment");
                    int p = sc.nextInt();

                    System.out.print("Enter the rate: ");
                    double r = sc.nextDouble();
                    
                    System.out.print("Enter the time period: ");
                    int n = sc.nextInt();

                    ob.rd(p, r, n);
                    break;

                case 3:
                    System.out.println("EXITING...");
                    break;
                default:
                    System.out.println("Invalid input...TRY AGAIN");
            }

        } while (in != 3);
        sc.close();
    }
}
