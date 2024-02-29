import java.util.*;
public class GenerateRandomNo {
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
        // create random object
        Random ran = new Random();
  
        // get number between 0-99
        int num = ran.nextInt(100);
        int guess;
        System.out.println("Guess number between 1-100 U can guess number only 5 attempts");
  for (int i=1;i<6 ;i++ ) {
  	
  	 System.out.println(" Take Your"+i+"attempt");
  	guess=sc.nextInt();

  	if (guess==num) {
  		System.out.println("Congratulation Your guess is correct");
  		break;
  	}
  	 else if(guess<num){
  		System.out.println("Too Low");
  	}
  	else{
  		System.out.println("Too high");
  	}
  }
   
     System.out.println("The random number is"+num);   
    }
}
