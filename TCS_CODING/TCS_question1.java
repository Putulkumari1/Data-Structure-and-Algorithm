import java.util.Scanner;

public class TCS_question1{
    public static void main(String[] args) {
        //Discount Calculator
     Scanner sc = new Scanner(System.in);
      System.out.println("Enter price: ");
      double price = sc.nextDouble();
      double discount;

      //condition
      if(price>5000){
         discount = 20;
      }else if (price> 2000) {
         discount = 10;
      }else {
         discount = 5;
      }
     //find final price
     double finalDiscount = price*discount/100;
     double finalPrice = price - finalDiscount;

     System.out.println("applied discount: "+discount+"%");
     System.out.println("final price : "+finalPrice );
     sc.close();
    
    }
}