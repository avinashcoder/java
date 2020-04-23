import java.util.Scanner;
class PrintTable{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num;

		System.out.println("Enter any number to print table");
		num = sc.nextInt();

		System.out.println("Table of "+ num + " is:");

		for(int i = 1; i<=10; i++){
			int value = i * num;
			System.out.println(num+" * "+i+" = " +value);
		}
	}
}