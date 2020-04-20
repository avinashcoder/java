import java.util.Scanner;
class NestedIfElse{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int age, weight;

		System.out.println("Plese enter your age");
		age = sc.nextInt();

		if(age >= 18){
			System.out.println("Plese enter your weight");
			weight = sc.nextInt();
			if(weight >= 50){
				System.out.println("You are eligible for blood donation");
			}
			else{
				System.out.println("Weight should be grater than 50");
			}
		}
		else{
			System.out.println("Your age should be greater than 18");
		}

	}
}