import java.util.Scanner;
class UserInputString{
	public static void main(String args[]){

		String input;
		String message;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your good name");
		input = sc.next();

		sc.nextLine();
		
		System.out.println("Enter your message");
		message = sc.nextLine();

		System.out.println("Good morning "+input);
		System.out.println("Your Message "+message);



	}
}