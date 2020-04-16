import java.util.Scanner;
class UserInput{
	public static void main(String args[]){

		int num1,num2;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your first number");
		num1 = sc.nextInt();

		System.out.println("Enter your second number");
		num2 = sc.nextInt();

		int sum = num1+num2;

		System.out.println("Sum = "+sum);

	}
}