import java.util.Scanner;
class OddEven{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num;

		System.out.println("Enter a number to check it is even or odd");
		num = sc.nextInt();

		if(num%2 == 0){
			System.out.println(num +" is Even number");
		}else{
			System.out.println(num +" is Odd number");
		}
	}
}