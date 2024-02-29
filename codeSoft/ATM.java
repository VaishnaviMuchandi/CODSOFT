import java.util.Scanner;  
  

public class ATM 
{  
    Scanner sc = new Scanner(System.in); 
    int balance = 500000, withdraw, deposit;  
    
    
   public void  withdraw()
    {
        System.out.print(" Please enter money to be withdrawn:");  
                      
          
        withdraw = sc.nextInt();  
                      
        
        if(balance >= withdraw)  
        {  
            
            balance = balance - withdraw;  
            System.out.println("Please collect your money!!!");  
        }  
        else  
        {  
              
            System.out.println("Balance is Insufficient XXXXX ");  
        }  
    }
     public void  deposit()
    {

        System.out.print(" Please enter money to be deposited:");   
        deposit = sc.nextInt();    
        balance = balance + deposit;  
        System.out.println(" Congratulation Money has been successfully deposited!!!");  
     
         
     }
      public void  checkBal()
     {
        System.out.println(" Remaining Balance is : "+balance);  
        
    } 
    public static void main(String args[] )  
    {  
         Scanner sc = new Scanner(System.in); 
        ATM obj=new ATM();

        
        while(true)  
        {  
            System.out.println("Wel-Come SBI ATM ");  
            System.out.println("1.Withdraw");  
            System.out.println("2.Deposit");  
            System.out.println("3.Check Balance");  
            System.out.println("4.EXIT");  
            System.out.print("Choose the operation you want to perform:");  
              
              
            int choice = sc.nextInt();  
            switch(choice)  
            {  
                case 1:
                obj.withdraw();  
     
                break;  
   
                case 2:  
                  obj.deposit();    
                  break;  
   
                case 3:  
                obj.checkBal();
        break;  
   
                case 4:  
         
        System.exit(0);  
            }  
        }  
    }  
}  