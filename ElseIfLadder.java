import java.util.Scanner;
class ElseIfLadder{
	public static void main(String args[]){

		int percentage;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your total percentage");
		percentage = sc.nextInt();

		if(percentage > 90 && percentage <= 100){
			System.out.println("Your grade is : A+");
		}
		else if(percentage > 80 && percentage <=90){
			System.out.println("Your grade is : A");
		}
		else if(percentage > 70 && percentage <=80){
			System.out.println("Your grade is : B+");
		}
		else if(percentage > 60 && percentage <=70){
			System.out.println("Your grade is : B");
		}
		else if(percentage > 50 && percentage <=60){
			System.out.println("Your grade is : C");
		}
		else if(percentage > 41 && percentage <=50){
			System.out.println("Your grade is : D");
		}
		else{
			System.out.println("Your grade is : F");
		}

	}
}