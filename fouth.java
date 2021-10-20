import java.util.*;
public class fouth {
    public static void main(String[] args) throws Exception {
        int i, sum=0, z;  
        Scanner sc = new Scanner(System.in);  
        System.out.print("\n Enter Number of Numbers to be Calculated: ");  
        int n = sc.nextInt();  
        for(i=0;i<n;i++)   //loop executes n times  
        {  
            System.out.print("Enter the number: ");  
            z = sc.nextInt(); //reads integer from the user  
            sum=sum+z;       //calculates sum  
        }     
        System.out.println("The sum of the numbers is: "+sum);  

    }
}
