package h;
import java.util.ArrayList;
import java.util.Scanner;

public class EvenSumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> evenNumber = new ArrayList<>();
		int sum = 0;

		System.out.println("Enter the size of the Array = ");
		int n = sc.nextInt();
		int[]numbers = new int[n];

		System.out.println("Enter the Number = ");
		for(int i = 0; i<n; i++) {
			numbers[i] = sc.nextInt();
		}

		for(int num:numbers) {
			if(num % 2 == 0) {
				evenNumber.add(num);
				sum += num;
			}
		}
		System.out.println("Even Numbers = " + evenNumber);
		System.out.println("Sum OF the Even ="+sum);
	}
}
