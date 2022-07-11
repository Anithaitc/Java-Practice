package proj;

import java.util.Scanner;

public class ArrayList {
	public static void main(String args[]) {
		int a[][]=new int[2][];
		a[0]= new int[3];
		a[1]= new int[5];
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<=a.length-1;i++);{
			int i = 0;
			for(int j=0;j<a[i].length-1;j++);{
				int j = 0;
				System.out.println("Ages of class"+i+"student"+j);
				a[i][j]=scan.nextInt();
			}
		}
		System.out.println("The ages are:");
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a[i].length-1;j++) {
				System.out.println(a[i][j]);
			}
		}
	}
}
