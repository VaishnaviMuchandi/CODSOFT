import java.util.*;
public class GradeCalculator {
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
        
        
        int sum=0;
        int per;
        System.out.println(" Enter the number of subject");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println(" Enter the marks of  subject out of 100");
    
  for (int i=0;i<n ;i++ ) {
  	 arr[i]=sc.nextInt();
     }
     for (int i=0;i<n ;i++ ) {
      sum=sum+arr[i];
     }
     System.out.println("The total marks are:"+sum);
      per=sum/n;
     System.out.println("The percentage is:"+per+"%");
   if (per<=40) 
    System.out.println("You are faile");
   else if(per>40&&per<=70)  
   System.out.println("You Got 'C' Grade ");
 else if(per>70&&per<=80)  
   System.out.println("You Got 'B' Grade ");
    else if(per>80&&per<=90)  
   System.out.println("You Got 'A' Grade ");
else 

   System.out.println("You Got 'A+' Grade ");
    }
}
