package assignment;

public class Result {

	public static void main(String[] args) {
		float sub1 = 58;
		float sub2 = 69;
		float sub3 = 79;
		float sub4 = 85;
		float sub5 = 81;
        float average;
        average = (sub1+sub2+sub3+sub4+sub5)/5;
        System.out.println("Your Average is : "+average);
        
        if(average>=40)
        	 System.out.println("You are Pass");
        else
        	 System.out.println("You are Fail");
        
	}

}
