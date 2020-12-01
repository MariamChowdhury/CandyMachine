
package maricandy;
import java.util.Scanner;

public class MariCandy {
   
            
            

   
    public static void main(String[] args) {
       System.out.println("Welcome to MARI Candy machine.");
      dispenserType Candy= new dispenserType(5,100);
      dispenserType gum= new dispenserType(3,100);
      dispenserType chips= new dispenserType(10,100);
      dispenserType Cookies= new dispenserType(12,100);
      System.out.println("What do you want to buy?");
      System.out.println("Press 1 to buy candy");
      System.out.println("Press 2 to buy gum");
      System.out.println("Press 3 to buy Chips");
      System.out.println("Press 4 to buy Cookie");
      Scanner num=new Scanner(System.in);
      int selection;
      selection=num.nextInt();
      switch(selection){
          case 1:
              System.out.println("Please enter 5 taka for candy");
             cashRegister ob= new cashRegister();
             ob.candyyy();
              break;
              case 2:
              System.out.println("Please enter 3 taka for gum");
              cashRegister ob1= new cashRegister();
        ob1.gumm();
              break;
              case 3:
              System.out.println("Please enter 10 taka for chips");
              cashRegister ob2= new cashRegister();
             ob2.cihpss();
              break;
              case 4:
              System.out.println("Please enter 12 taka for cookie");
              cashRegister ob3= new cashRegister();
             ob3.cookieee();
              break;
              default:
                  System.out.println("Please enter valid output");
      }
    }
}
    