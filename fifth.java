import java.util.*;
public class fifth {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number : ");				
		int first = sc.nextInt();
		System.out.print("Enter the second number : ");				
		int second = sc.nextInt();
		if(first > second)											
			System.out.println(first+" is greater than "+second);
		else if(second > first)
			System.out.println(second+" is greater than "+first);
		else
			System.out.println("Both numbers are Equal");
		
}

}
