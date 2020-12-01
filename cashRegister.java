
package maricandy;

import java.util.Scanner;

public class cashRegister {
    private int cashOnHand;
    cashRegister(){
        cashOnHand=500;
    }
    cashRegister(int x){
        cashOnHand=x;
    }
   int getCurrentBalance(){
       return cashOnHand;
        
    }
    int acceptAmount(int x){
        cashOnHand=cashOnHand-x;
        return 0;
    }
    void gumm (){
         Scanner numb=new Scanner(System.in);
       int NUMBER;
       NUMBER=numb.nextInt();
       switch(NUMBER){
           case 0:
           case 1:
           case 2:
               System.out.println("Please give more money to purchase gum and Thank you for using Mari Candy Machine. ");
               break;
           case 3:
               System.out.println("Please collect your gum from the machine and Thank you for using Mari Candy Machine.");
               break;
           default:
               System.out.println("Please collect your gum and extra money from the machine and Thank you for using Mari Candy Machine.");
               break;
    }
    }
    void candyyy(){
        Scanner numb1=new Scanner(System.in);
       int NUMBER1;
       NUMBER1=numb1.nextInt();
       switch(NUMBER1){
           case 0:
           case 1:
           case 2:
           case 3:
           case 4:
           System.out.println("Please give more money to purchase candy and Thank you for using Mari Candy Machine. ");
           break;
           case 5:
               System.out.println("Please collect your candy from the machine and Thank you for using Mari Candy Machine.");
               break;
           default:
               System.out.println("Please collect your candy and extra money from the machine and Thank you for using Mari Candy Machine.");
               break;
               
           
       }
        
    }
    void cihpss(){
        Scanner numb2=new Scanner(System.in);
       int NUMBER2;
       NUMBER2=numb2.nextInt();
       switch(NUMBER2){
           case 0:
           case 1:
           case 2:
           case 3:
           case 4:
           case 5:
           case 6:
           case 7:
           case 8:
           case 9:
               System.out.println("Please give more money to purchase chips and Thank you for using Mari Candy Machine. ");
               break;
           case 10:
               System.out.println("Please collect your chips from the machine and Thank you for using Mari Candy Machine.");
               break;
                default:
               System.out.println("Please collect your chips and extra money from the machine and Thank you for using Mari Candy Machine.");
               break;
               
           
       }
    }
    void cookieee(){
        Scanner numb3=new Scanner(System.in);
       int NUMBER3;
       NUMBER3=numb3.nextInt();
       switch(NUMBER3){
           case 0:
           case 1:
           case 2:
           case 3:
           case 4:
           case 5:
           case 6:
           case 7:
           case 8:
           case 9:
           case 10:
           case 11:
                System.out.println("Please give more money to purchase cookie and Thank you for using Mari Candy Machine. ");
                break;
                 case 12:
               System.out.println("Plese collect your cookie from the machine and Thank you for using Mari Candy Machine.");
               break;
                 default:
               System.out.println("Please collect your cookie and extra money from the machine and Thank you for using Mari Candy Machine.");
               break;
               
               
           
       }
    }
}
       
  