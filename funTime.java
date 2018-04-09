import java.util.*;

public class funTime{

   public static void main(String[] args){
   
   int Economy = 100;
   int Premium = 200;
   int Deluxe = 400;

   
   Scanner input = new Scanner(System.in);
   
      System.out.println("Whalecum! What is your name?");
      String name = input.nextLine();
      System.out.println("Hello " + name + "! How much do you want to add to your card?");
      int balance = input.nextInt();
      System.out.println("Great " + name + ". You now have " + balance + "kr.-, which wash do you want to buy?");
      System.out.println("For economic, standard wash, 100.- Press 1");
      System.out.println("For Premium, wax on, wax off, 200.- Press 2");
      System.out.println("For Deluxe, with happy ending, 400.- Press 3");
      int washChoice =  input.nextInt();
     
            {
                if(washChoice == 1)
                {
                                       
                    if(balance >= Economy) 
                    {                      
                        System.out.println("You have chosen Economy" + Economy + ".- will be deducted from your balance");
                        balance = balance - Economy;
                        System.out.println("Your balance is now " + balance);
                    }
                    else
                    {
                      System.out.println("You have insufficient funds!");
                    }
                } 
                else if(washChoice == 2)
                {
                    if(balance >= Premium)
                    {
                        
                        System.out.println("You have chosen Premium " + Premium + ".- will be deducted from your balance");
                        balance = balance - Premium;
                        System.out.println("Your balance is now " + balance);
                    }
                    else
                    {
                      System.out.println("You have insufficient funds!");
                    }

                } 
                else if(washChoice == 3)
                {
                    if (balance >= Deluxe)
                    {

                    System.out.println("You have chosen Deluxe " + Deluxe + ".- will be deducted from your balance");
                    balance = balance - Deluxe;
                    System.out.println("Your balance is now " + balance);
                    }
                    else
                    {
                    System.out.println("You have insufficient funds!!");
                    }
                }

      }
      }          
      
      }
   


