package assignment;
import java.util.Scanner;
public class BigNumber {

	public static void main(String[] args) {
	int num1,num2;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter Two Numbers");
    num1 = input.nextInt();
    num2 = input.nextInt();
    if(num1>num2)
    	System.out.println("The bigger number is :"+num1);
    else
    	System.out.println("The bigger number is :"+num2);
    input.close();
	}

}
