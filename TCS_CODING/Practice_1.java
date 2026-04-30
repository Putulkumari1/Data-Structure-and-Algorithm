import java.util.Scanner;

public class Practice_1 {
    public static void main(String[] args) {
        // multiple item 
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int item = sc.nextInt();

        double total = 0;

        // Loop only for summing prices
        for (int i = 1; i <= item; i++) {
            System.out.print("Enter price of item " + i + ": ");
            double price = sc.nextDouble();
            total = total + price;
        }

        // Apply condition AFTER loop
        double discount;
        if (item > 3) {
            discount = 10;
        } else {
            discount = 0;
        }

        // Calculate on TOTAL
        double finaldiscount = total * discount / 100;
        double finalamount = total - finaldiscount;

        // Print once
        System.out.println("Total amount: " + total);
        System.out.println("Discount applied: " + discount + "%");
        System.out.println("Final amount: " + finalamount);

        sc.close();
    }
}
