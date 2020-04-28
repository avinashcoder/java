import java.util.Scanner;
class DoWhile{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int i = 1;
		char ch;

		do{
			System.out.println(i);
			i++;
			System.out.print("Do you want to print next number(y/n) : ");
			ch = sc.next().charAt(0);
		}while(ch == 'y');
	}
}