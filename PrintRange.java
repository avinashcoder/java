import java.util.Scanner;
class PrintRange{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int startPoint, endPoint;

		System.out.println("Enter Starting Point");
		startPoint = sc.nextInt();

		System.out.println("Enter End Point");
		endPoint = sc.nextInt();

		for(int i = startPoint; i <= endPoint; i++){
			System.out.print(i+ " ");
		}
	}
}